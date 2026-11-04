
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
    <title>Add Employee</title>
</head>
<body>

    <h2>Add New Employee</h2>

    <form action="${pageContext.request.contextPath}/EmployeeServlet"
          method="post">

        Name:
        <input type="text" name="name" required>
        <br><br>

        Email:
        <input type="email" name="email" required>
        <br><br>

        Department:
        <input type="text" name="department" required>
        <br><br>

        Salary:
        <input type="number" name="salary"
               step="0.01" min="0" required>
        <br><br>

        <button type="submit">Save Employee</button>

    </form>

    <br>

    <a href="${pageContext.request.contextPath}/EmployeeServlet">
        Back to Employee List
    </a>

</body>
</html>
