
package controller;

import java.io.IOException;
import java.util.List;

import dao.EmployeeDAO;
import model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {

    private EmployeeDAO dao = new EmployeeDAO();


    // 1. Display employees OR open edit page
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");

        if (id != null) {

            int employeeId = Integer.parseInt(id);

            Employee emp = dao.getEmployeeById(employeeId);

            request.setAttribute("employee", emp);

            request.getRequestDispatcher("/edit-employee.jsp")
                   .forward(request, response);

        } else {

            List<Employee> employees = dao.getAllEmployees();

            request.setAttribute("employees", employees);

            request.getRequestDispatcher("/employee-list.jsp")
                   .forward(request, response);
        }
        if ("delete".equals(request.getParameter("action"))) {

            int employeeId = Integer.parseInt(
                    request.getParameter("id"));

            dao.deleteEmployee(employeeId);

            response.sendRedirect(
                    request.getContextPath() + "/employees");

            return;
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

            if (id != null && !id.isEmpty()) {

                emp.setId(Integer.parseInt(id));

                dao.updateEmployee(emp);

            } else {

                dao.addEmployee(emp);
            }

            response.sendRedirect(
                    request.getContextPath() + "/employees");

        } catch (NumberFormatException e) {

            response.sendError(
                    HttpServletResponse.SC_BAD_REQUEST,
                    "Invalid employee ID or salary."
            );
        }
    }
}
