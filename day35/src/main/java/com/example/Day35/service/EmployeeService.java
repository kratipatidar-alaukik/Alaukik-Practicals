
package com.example.Day35.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Day35.model.Employee;
import com.example.Day35.model.Department;
import com.example.Day35.repository.EmployeeRepository;
import com.example.Day35.repository.DepartmentRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    public EmployeeService(EmployeeRepository employeeRepository,
                           DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    // Add Employee
    public Employee addEmployee(Employee employee) {

        int departmentId = employee.getDepartment().getDepartmentId();

        Department department = departmentRepository
                .findById(departmentId)
                .orElseThrow(() -> new RuntimeException("Department not found"));

        employee.setDepartment(department);

        return employeeRepository.save(employee);
    }

    // Get All Employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Get Employee By ID
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }
}
