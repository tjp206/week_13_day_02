package com.example.codeclan.many_to_many_employee_lab.repos;

import com.example.codeclan.many_to_many_employee_lab.models.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepo extends JpaRepository<Dept, Long> {
}
