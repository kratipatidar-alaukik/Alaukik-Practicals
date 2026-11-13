
package com.example.Day35.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.Day35.model.Department;
import com.example.Day35.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    // Add Department
    @PostMapping
    public Department addDepartment(@RequestBody Department department) {
        return departmentService.addDepartment(department);
    }

    // Get All Departments
    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    // Get Department By ID
    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable int id) {
        return departmentService.getDepartmentById(id);
    }
}
