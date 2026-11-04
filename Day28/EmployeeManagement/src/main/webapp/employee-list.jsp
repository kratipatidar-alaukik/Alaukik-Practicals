
<%@ page import="java.util.List" %>
<%@ page import="model.Employee" %>

<!DOCTYPE html>
<html>
<head>
    <title>Employee List</title>
</head>
<body>

    <h2>Employee List</h2>

    <a href="dashboard.jsp">Dashboard</a> |
    <a href="add-employee.jsp">Add Employee</a>

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

        <%
            List<Employee> employees =
                (List<Employee>) request.getAttribute("employees");

            if (employees != null) {
                for (Employee emp : employees) {
        %>

        <tr>
            <td><%= emp.getId() %></td>
            <td><%= emp.getName() %></td>
            <td><%= emp.getEmail() %></td>
            <td><%= emp.getDepartment() %></td>
            <td><%= emp.getSalary() %></td>

            <td>
                <a href="employees?id=<%= emp.getId() %>">Edit</a>

                |

                <a href="employees?action=delete&id=<%= emp.getId() %>"
                   onclick="return confirm('Are you sure you want to delete this employee?');">
                    Delete
                </a>
            </td>
        </tr>

        <%
                }
            }
        %>

    </table>

</body>
</html>
