package com.example.codeclan.many_to_many_employee_lab.repos;

import com.example.codeclan.many_to_many_employee_lab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Long> {
}
