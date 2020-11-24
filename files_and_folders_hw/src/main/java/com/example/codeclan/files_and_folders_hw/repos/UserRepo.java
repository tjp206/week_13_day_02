package com.example.codeclan.files_and_folders_hw.repos;

import com.example.codeclan.files_and_folders_hw.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
