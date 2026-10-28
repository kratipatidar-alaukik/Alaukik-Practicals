package service;

import dao.EmployeeDAO;
import model.Employee;

import java.util.List;

public class EmployeeService {

    private EmployeeDAO employeeDAO;

    public EmployeeService() {
        employeeDAO = new EmployeeDAO();
    }

    // Add employee
    public void addEmployee(Employee employee) {

        employeeDAO.addEmployee(employee);
    }

    // View employees
    public List<Employee> getAllEmployees() {

        return employeeDAO.getAllEmployees();
    }

    // Update employee
    public void updateEmployee(Employee employee) {

        employeeDAO.updateEmployee(employee);
    }

    // Delete employee
    public void deleteEmployee(int id) {

        employeeDAO.deleteEmployee(id);
    }

    // Search employee
    public Employee searchEmployee(int id) {

        return employeeDAO.searchEmployee(id);
    }
}