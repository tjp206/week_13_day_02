package com.example.codeclan.files_and_folders_hw.components;

import com.example.codeclan.files_and_folders_hw.models.File;
import com.example.codeclan.files_and_folders_hw.models.Folder;
import com.example.codeclan.files_and_folders_hw.models.User;
import com.example.codeclan.files_and_folders_hw.repos.FileRepo;
import com.example.codeclan.files_and_folders_hw.repos.FolderRepo;
import com.example.codeclan.files_and_folders_hw.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepo fileRepo;

    @Autowired
    FolderRepo folderRepo;

    @Autowired
    UserRepo userRepo;

    public DataLoader() {}

    public void run(ApplicationArguments args) {
        User tj = new User("TJ");
        userRepo.save(tj);
        User sarah = new User("Sarah");
        userRepo.save(sarah);

        Folder secret = new Folder("Secret", tj);
        folderRepo.save(secret);
        Folder open = new Folder("Open", sarah);
        folderRepo.save(open);

        File order = new File("Executive Order", ".zip", 5, secret);
        fileRepo.save(order);
        File personal = new File("Journal Entry", ".txt", 3, open);
        fileRepo.save(personal);

        secret.addFile(order);
        secret.addFile(personal);
        folderRepo.save(secret);

        tj.addFolder(secret);
        tj.addFolder(open);
        userRepo.save(tj);

    }
}
