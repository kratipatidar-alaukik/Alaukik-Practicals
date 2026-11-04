
<%@ page import="model.Employee" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%
    if (session.getAttribute("username") == null) {
        response.sendRedirect(request.getContextPath() + "/login.jsp");
        return;
    }

    Employee emp = (Employee) request.getAttribute("employee");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Employee</title>
</head>
<body>

    <h2>Edit Employee</h2>

    <% if (emp != null) { %>

        <form action="${pageContext.request.contextPath}/EmployeeServlet"
              method="post">

            <input type="hidden" name="id"
                   value="<%= emp.getId() %>">

            Name:
            <input type="text" name="name"
                   value="<%= emp.getName() %>" required>
            <br><br>

            Email:
            <input type="email" name="email"
                   value="<%= emp.getEmail() %>" required>
            <br><br>

            Department:
            <input type="text" name="department"
                   value="<%= emp.getDepartment() %>" required>
            <br><br>

            Salary:
            <input type="number" name="salary"
                   value="<%= emp.getSalary() %>"
                   step="0.01" min="0" required>
            <br><br>

            <button type="submit">Update Employee</button>

        </form>

    <% } else { %>

        <p>Employee details not found.</p>

    <% } %>

    <br>

    <a href="${pageContext.request.contextPath}/EmployeeServlet">
        Back to Employee List
    </a>

</body>
</html>
