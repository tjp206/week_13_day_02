package com.example.codeclan.many_to_many_employee_lab.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="dept")
public class Dept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    @JsonIgnoreProperties({"dept"})
    @OneToMany(mappedBy = "dept")
    private List<Employee> employees;

    public Dept(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public Dept () {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }


}
