
<%@ page import="java.util.List" %>
<%@ page import="model.Employee" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%
    if (session.getAttribute("username") == null) {
        response.sendRedirect(request.getContextPath() + "/login.jsp");
        return;
    }

    List<Employee> employees =
        (List<Employee>) request.getAttribute("employees");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee List</title>
</head>
<body>

    <h2>Employee List</h2>

    <a href="${pageContext.request.contextPath}/dashboard.jsp">
        Dashboard
    </a>

    |

    <a href="${pageContext.request.contextPath}/add-employee.jsp">
        Add Employee
    </a>

    <br><br>

    <table border="1" cellpadding="10">

        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Department</th>
            <th>Salary</th>
            <th>Action</th>
        </tr>

        <% if (employees != null && !employees.isEmpty()) {
               for (Employee emp : employees) { %>

            <tr>
                <td><%= emp.getId() %></td>
                <td><%= emp.getName() %></td>
                <td><%= emp.getEmail() %></td>
                <td><%= emp.getDepartment() %></td>
                <td><%= emp.getSalary() %></td>

                <td>
                    <a href="${pageContext.request.contextPath}/EmployeeServlet?id=<%= emp.getId() %>">
                        Edit
                    </a>

                    |

                    <a href="${pageContext.request.contextPath}/EmployeeServlet?action=delete&id=<%= emp.getId() %>"
                       onclick="return confirm('Are you sure you want to delete this employee?');">
                        Delete
                    </a>
                </td>
            </tr>

        <%   }
           } else { %>

            <tr>
                <td colspan="6">No employees found.</td>
            </tr>

        <% } %>

    </table>

</body>
</html>
