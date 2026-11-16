
package com.example.Day38.controller;

import com.example.Day38.entity.Employee;
import com.example.Day38.repository.EmployeeRepository;

import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Pagination
    @GetMapping(params = {"page", "size"})
    public Page<Employee> getEmployees(
            @RequestParam int page,
            @RequestParam int size) {

        return employeeRepository.findAll(
                PageRequest.of(page, size)
        );
    }

    // Filter by department
    @GetMapping(params = "department")
    public List<Employee> getEmployeesByDepartment(
            @RequestParam String department) {

        return employeeRepository.findByDepartmentIgnoreCase(department);
    }

    // Sort employees by salary
    @GetMapping(params = "sort")
    public List<Employee> sortEmployees(
            @RequestParam String sort) {

        return employeeRepository.findAll(
                Sort.by(Sort.Direction.ASC, sort)
        );
    }

}
