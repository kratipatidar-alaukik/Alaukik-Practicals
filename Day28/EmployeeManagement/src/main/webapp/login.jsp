<!DOCTYPE html>
<html>
<head>
    <title>Employee Login</title>
</head>
<body>

    <h2>Employee Management System</h2>
    <h3>Login</h3>

    <form action="<%= request.getContextPath() %>/LoginServlet"
      method="post">

        <label>Username:</label>
        <input type="text" name="username" required>
        <br><br>

        <label>Password:</label>
        <input type="password" name="password" required>
        <br><br>

        <button type="submit">Login</button>

    </form>

</body>
</html>
