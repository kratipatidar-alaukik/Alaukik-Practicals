
<!DOCTYPE html>
<html>
<head>
    <title>Add Employee</title>
</head>
<body>

    <h2>Add New Employee</h2>

    <form action="employees" method="post">

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
        <input type="number" name="salary" step="0.01" required>
        <br><br>

        <button type="submit">Save Employee</button>

    </form>

    <br>

    <a href="employees">Back to Employee List</a>

</body>
</html>
