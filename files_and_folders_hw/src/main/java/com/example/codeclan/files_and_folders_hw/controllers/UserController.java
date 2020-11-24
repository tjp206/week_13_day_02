package com.example.codeclan.files_and_folders_hw.controllers;

import com.example.codeclan.files_and_folders_hw.models.User;
import com.example.codeclan.files_and_folders_hw.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity getUser(@PathVariable Long id) {
        return new ResponseEntity(userRepo.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/users")
    public ResponseEntity<User> postUser(@RequestBody User user) {
        userRepo.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
