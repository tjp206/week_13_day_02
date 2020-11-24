package com.example.codeclan.files_and_folders_hw;

import com.example.codeclan.files_and_folders_hw.models.File;
import com.example.codeclan.files_and_folders_hw.models.Folder;
import com.example.codeclan.files_and_folders_hw.models.User;
import com.example.codeclan.files_and_folders_hw.repos.FileRepo;
import com.example.codeclan.files_and_folders_hw.repos.FolderRepo;
import com.example.codeclan.files_and_folders_hw.repos.UserRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FilesAndFoldersHwApplicationTests {

	@Autowired
	FileRepo fileRepo;

	@Autowired
	FolderRepo folderRepo;

	@Autowired
	UserRepo userRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void	createFilesAndFoldersAndUsers() {
		User user1 = new User("TJ");
		userRepo.save(user1);

//		Folder folder1 = new Folder("Top Secret", user1);
//		folderRepo.save(folder1);
//
//		File file1 = new File("Assassin Order", ".txt", 5, folder1);
//		fileRepo.save(file1);
	}

}
