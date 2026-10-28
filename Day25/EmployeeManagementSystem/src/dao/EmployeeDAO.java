package dao;

import model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    // ADD EMPLOYEE
    public void addEmployee(Employee employee) {

        String sql = "INSERT INTO employees employee_name, email, salary VALUES (?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getEmail());
            ps.setDouble(3, employee.getSalary());

            ps.executeUpdate();

            System.out.println("Employee added successfully!");

        } catch (SQLException e) {
            System.out.println("Error while adding employee.");
            e.printStackTrace();
        }
    }


    // VIEW ALL EMPLOYEES
    public List<Employee> getAllEmployees() {

        List<Employee> employees = new ArrayList<>();

        String sql = "SELECT * FROM employees";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Employee employee = new Employee(
                        rs.getInt("employee_id"),
                        rs.getString("employee_name"),
                        rs.getString("email"),
                        rs.getDouble("salary")
                );

                employees.add(employee);
            }

        } catch (SQLException e) {
            System.out.println("Error while fetching employees.");
            e.printStackTrace();
        }

        return employees;
    }


    // UPDATE EMPLOYEE
    public void updateEmployee(Employee employee) {

        String sql = "UPDATE employees " +
                "SET employee_name=?, email=?, salary=? " +
                "WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getEmail());
            ps.setDouble(3, employee.getSalary());
            ps.setInt(4, employee.getId());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee updated successfully!");
            } else {
                System.out.println("Employee not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error while updating employee.");
            e.printStackTrace();
        }
    }


    // DELETE EMPLOYEE
    public void deleteEmployee(int id) {

        String sql = "DELETE FROM employees WHERE employee_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee deleted successfully!");
            } else {
                System.out.println("Employee not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error while deleting employee.");
            e.printStackTrace();
        }
    }


    // SEARCH EMPLOYEE
    public Employee searchEmployee(int id) {

        String sql = "SELECT * FROM employees WHERE employee_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    return new Employee(
                            rs.getInt("employee_id"),
                            rs.getString("employee_name"),
                            rs.getString("email"),
                            rs.getDouble("salary")
                    );
                }
            }

        } catch (SQLException e) {
            System.out.println("Error while searching employee.");
            e.printStackTrace();
        }

        return null;
    }
}