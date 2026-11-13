package com.example.Day32.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Day32.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}