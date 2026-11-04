
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%
    if (session.getAttribute("username") == null) {
        response.sendRedirect(request.getContextPath() + "/login.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
</head>
<body>

    <h2>Welcome to Employee Management System</h2>

    <h3>Dashboard</h3>

    <p>Welcome, ${sessionScope.username}!</p>

    <a href="${pageContext.request.contextPath}/EmployeeServlet">
        View Employees
    </a>

    <br><br>

    <a href="${pageContext.request.contextPath}/add-employee.jsp">
        Add Employee
    </a>

    <br><br>

    <a href="${pageContext.request.contextPath}/LogoutServlet">
        Logout
    </a>

</body>
</html>
