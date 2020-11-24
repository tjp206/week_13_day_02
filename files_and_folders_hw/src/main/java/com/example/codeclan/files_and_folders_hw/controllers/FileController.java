package com.example.codeclan.files_and_folders_hw.controllers;

import com.example.codeclan.files_and_folders_hw.models.File;
import com.example.codeclan.files_and_folders_hw.models.Folder;
import com.example.codeclan.files_and_folders_hw.repos.FileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FileController {

    @Autowired
    FileRepo fileRepo;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles() {
        return new ResponseEntity<>(fileRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/files/{id}")
    public ResponseEntity getFile(@PathVariable Long id) {
        return new ResponseEntity(fileRepo.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/files")
    public ResponseEntity<File> postFile(@RequestBody File file) {
        fileRepo.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }
}
