package com.example.codeclan.many_to_many_employee_lab;

import com.example.codeclan.many_to_many_employee_lab.models.Dept;
import com.example.codeclan.many_to_many_employee_lab.models.Employee;
import com.example.codeclan.many_to_many_employee_lab.models.Project;
import com.example.codeclan.many_to_many_employee_lab.repos.DeptRepo;
import com.example.codeclan.many_to_many_employee_lab.repos.EmployeeRepo;
import com.example.codeclan.many_to_many_employee_lab.repos.ProjectRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.OneToMany;

@RunWith(SpringRunner.class)
@SpringBootTest
class ManyToManyEmployeeLabApplicationTests {

	@Autowired
	EmployeeRepo employeeRepo;

	@Autowired
	DeptRepo deptRepo;

	@Autowired
	ProjectRepo projectRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void createDeptAndEmployeeAndProject() {
		Dept dept = new Dept("Marketing");
		deptRepo.save(dept);

		Employee employee1 = new Employee("TJ", "P", 6, dept);
		employeeRepo.save(employee1);

		Employee employee2 = new Employee("Craig", "A", 7, dept);
		employeeRepo.save(employee2);

		Project project = new Project("Car Advertisement", 7);
		projectRepo.save(project);
	}

	@Test
	public void addEmployeesAndProjects() {
		Dept dept = new Dept("Marketing");
		deptRepo.save(dept);

		Employee employee1 = new Employee("TJ", "P", 6, dept);
		employeeRepo.save(employee1);

		Employee employee2 = new Employee("Craig", "A", 7, dept);
		employeeRepo.save(employee2);

		Project project1 = new Project("Car Advertisement", 7);
		projectRepo.save(project1);

		Project project2 = new Project("Ice Cream Advertisement", 5);
		projectRepo.save(project2);

		project1.addEmployee(employee1);
		projectRepo.save(project1);

		project2.addEmployee(employee1);
		projectRepo.save(project2);

		project2.addEmployee(employee2);
		projectRepo.save(project2);
	}
}
