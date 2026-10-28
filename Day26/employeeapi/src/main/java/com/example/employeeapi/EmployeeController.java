package com.example.employeeapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    List<Employee> employees = new ArrayList<>();

    @GetMapping
    public List<Employee> getEmployees() {
        return employees;
    }

    @PostMapping
    public String addEmployee(@RequestBody Employee employee) {
        employees.add(employee);
        return "Employee added";
    }

    @PutMapping("/{id}")
    public String updateEmployee(
            @PathVariable int id,
            @RequestBody Employee newEmployee) {

        for (Employee employee : employees) {

            if (employee.getId() == id) {

                employee.setName(newEmployee.getName());
                employee.setSalary(newEmployee.getSalary());

                return "Employee updated";
            }
        }

        return "Employee not found";
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {

        for (Employee employee : employees) {

            if (employee.getId() == id) {

                employees.remove(employee);

                return "Employee deleted";
            }
        }

        return "Employee not found";
    }
}