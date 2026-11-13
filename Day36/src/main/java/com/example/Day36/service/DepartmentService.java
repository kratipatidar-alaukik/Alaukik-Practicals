
package com.example.Day36.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Day36.model.Department;
import com.example.Day36.repository.DepartmentRepository;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    // Add Department
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    // Get All Departments
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    // Get Department By ID
    public Department getDepartmentById(int id) {
        return departmentRepository.findById(id).orElse(null);
    }
}
