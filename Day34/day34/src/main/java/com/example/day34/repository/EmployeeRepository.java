package com.example.day34.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.day34.model.Employee;

public interface EmployeeRepository
        extends JpaRepository<Employee, Integer> {

}