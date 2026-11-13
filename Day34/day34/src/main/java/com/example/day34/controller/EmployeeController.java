package com.example.day34.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import com.example.day34.model.Employee;
import com.example.day34.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    // GET - Get all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    // GET - Get employee by ID
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(
            @PathVariable int id) {

        Employee employee = service.getEmployeeById(id);

        if (employee != null) {
            return ResponseEntity.ok(employee);
        }

        return ResponseEntity.notFound().build();
    }

    // POST - Add employee
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.addEmployee(employee);
    }

    // PUT - Update employee
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(
            @PathVariable int id,
            @RequestBody Employee employee) {

        Employee updated = service.updateEmployee(id, employee);

        if (updated != null) {
            return ResponseEntity.ok(updated);
        }

        return ResponseEntity.notFound().build();
    }

    // DELETE - Delete employee
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(
            @PathVariable int id) {

        boolean deleted = service.deleteEmployee(id);

        if (deleted) {
            return ResponseEntity.ok("Employee deleted successfully!");
        }

        return ResponseEntity.notFound().build();
    }
}