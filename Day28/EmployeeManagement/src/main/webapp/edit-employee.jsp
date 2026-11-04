
<%@ page import="model.Employee" %>

<!DOCTYPE html>
<html>
<head>
    <title>Edit Employee</title>
</head>
<body>

    <h2>Edit Employee</h2>

    <%
        Employee emp = (Employee) request.getAttribute("employee");
    %>

    <% if (emp != null) { %>

    <form action="employees" method="post">

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
               value="<%= emp.getSalary() %>" step="0.01" required>
        <br><br>

        <button type="submit">Update Employee</button>

    </form>

    <% } else { %>

        <p>Employee details not found.</p>

    <% } %>

    <br>
    <a href="employees">Back to Employee List</a>

</body>
</html>
