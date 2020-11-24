package com.example.codeclan.files_and_folders_hw.repos;

import com.example.codeclan.files_and_folders_hw.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepo extends JpaRepository<File, Long> {
}
