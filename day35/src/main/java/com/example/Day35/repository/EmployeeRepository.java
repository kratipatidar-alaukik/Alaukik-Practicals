
package com.example.Day35.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Day35.model.Employee;

public interface EmployeeRepository
        extends JpaRepository<Employee, Integer> {

}
