package com.example.Day32.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Day32.model.Employee;
import com.example.Day32.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }
    public Employee updateEmployee(int id, Employee employee) {

        Employee existingEmployee = employeeRepository.findById(id).orElse(null);

        if (existingEmployee != null) {
            existingEmployee.setEmployeeName(employee.getEmployeeName());
            existingEmployee.setEmployeeEmail(employee.getEmployeeEmail());

            return employeeRepository.save(existingEmployee);
        }

        return null;
    }
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}