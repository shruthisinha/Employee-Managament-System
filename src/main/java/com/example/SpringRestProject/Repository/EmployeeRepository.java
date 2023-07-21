package com.example.SpringRestProject.Repository;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringRestProject.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Employee findByEmpcity(String emp_city);

	Optional<List<Employee>> findByEmpageGreaterThan(int emp_age);
}
