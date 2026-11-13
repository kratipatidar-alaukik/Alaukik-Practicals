package com.example.day34.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day34.model.Employee;
import com.example.day34.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // Get employee by ID
    public Employee getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    // Add employee
    public Employee addEmployee(Employee employee) {
        return repository.save(employee);
    }

    // Update employee
    public Employee updateEmployee(int id, Employee employee) {

        Employee existing = repository.findById(id).orElse(null);

        if (existing != null) {

            existing.setEmployeeName(employee.getEmployeeName());
            existing.setEmployeeEmail(employee.getEmployeeEmail());

            return repository.save(existing);
        }

        return null;
    }

    // Delete employee
    public boolean deleteEmployee(int id) {

        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }

        return false;
    }
}