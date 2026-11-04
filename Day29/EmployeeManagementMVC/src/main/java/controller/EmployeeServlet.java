
package controller;

import java.io.IOException;
import java.util.List;

import model.Employee;
import service.EmployeeService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {

    private EmployeeService service = new EmployeeService();

    // 1. View employees OR open edit page
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        String id = request.getParameter("id");

        // Delete employee
        if ("delete".equals(action)) {

            try {
                int employeeId = Integer.parseInt(id);

                service.deleteEmployee(employeeId);

                response.sendRedirect(
                    request.getContextPath() + "/EmployeeServlet"
                );

            } catch (NumberFormatException e) {
                response.sendError(
                    HttpServletResponse.SC_BAD_REQUEST,
                    "Invalid employee ID"
                );
            }

            return;
        }

        // Open edit page
        if (id != null && !id.isEmpty()) {

            try {
                int employeeId = Integer.parseInt(id);

                Employee emp = service.getEmployeeById(employeeId);

                if (emp == null) {
                    response.sendError(
                        HttpServletResponse.SC_NOT_FOUND,
                        "Employee not found"
                    );
                    return;
                }

                request.setAttribute("employee", emp);

                request.getRequestDispatcher("/edit-employee.jsp")
                       .forward(request, response);

            } catch (NumberFormatException e) {
                response.sendError(
                    HttpServletResponse.SC_BAD_REQUEST,
                    "Invalid employee ID"
                );
            }

        } else {

            // Display all employees
            List<Employee> employees = service.getAllEmployees();

            request.setAttribute("employees", employees);

            request.getRequestDispatcher("/employee-list.jsp")
                   .forward(request, response);
        }
    }

    // 2. Add OR update employee
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String department = request.getParameter("department");
        String salaryValue = request.getParameter("salary");

        try {

            Employee emp = new Employee();

            emp.setName(name);
            emp.setEmail(email);
            emp.setDepartment(department);
            emp.setSalary(Double.parseDouble(salaryValue));

            boolean success;

            // Update employee
            if (id != null && !id.isEmpty()) {

                emp.setId(Integer.parseInt(id));

                success = service.updateEmployee(emp);

            } else {

                // Add employee
                success = service.addEmployee(emp);
            }

            if (success) {

                response.sendRedirect(
                    request.getContextPath() + "/EmployeeServlet"
                );

            } else {

                response.sendError(
                    HttpServletResponse.SC_BAD_REQUEST,
                    "Employee operation failed. Check the details."
                );
            }

        } catch (NumberFormatException e) {

            response.sendError(
                HttpServletResponse.SC_BAD_REQUEST,
                "Invalid employee ID or salary."
            );
        }
    }
}
