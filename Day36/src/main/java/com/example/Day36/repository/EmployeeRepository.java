
package com.example.Day36.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Day36.model.Employee;

public interface EmployeeRepository
        extends JpaRepository<Employee, Integer> {

}
