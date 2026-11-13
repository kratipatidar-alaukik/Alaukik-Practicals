
package com.example.Day36.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Day36.model.Department;

public interface DepartmentRepository
        extends JpaRepository<Department, Integer> {

}
