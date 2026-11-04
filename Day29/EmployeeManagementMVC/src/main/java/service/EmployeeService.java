
package service;

import java.util.List;

import dao.EmployeeDAO;
import model.Employee;

public class EmployeeService {

    EmployeeDAO dao = new EmployeeDAO();
    
   public List<Employee> getAllEmployees() {
    return dao.getAllEmployees();
   }
    public boolean addEmployee(Employee emp) {
        if (emp.getName() == null || emp.getName().isEmpty()) {
            return false;
            }
        if (emp.getEmail() == null || emp.getEmail().isEmpty()) {
            return false;
        }
        return dao.addEmployee(emp);
    }

    public Employee getEmployeeById(int id) {
        if (id <= 0) {
            return null;
        }
        return dao.getEmployeeById(id);
    }
   public boolean updateEmployee(Employee emp) {

        if (emp.getId() <= 0) {
            return false;
        }
        if (emp.getName() == null || emp.getName().isEmpty()) {
            return false;
        }
        return dao.updateEmployee(emp);
    }

    public boolean deleteEmployee(int id) {

        if (id <= 0) {
            return false;
        }

        return dao.deleteEmployee(id);
    }
}
