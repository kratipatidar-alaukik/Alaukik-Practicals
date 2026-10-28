# Day 25 — JDBC CRUD Project

## Employee Management System

A simple Java console-based Employee Management System built using **JDBC** and **MySQL**.

## Features

- Add Employee
- View Employees
- Update Employee
- Delete Employee
- Search Employee

## Technologies Used

- Java
- JDBC
- MySQL
- PreparedStatement
- ResultSet

## Architecture

```text
UI
 ↓
Service
 ↓
DAO
 ↓
JDBC
 ↓
MySQL
```

### UI
Handles user input and displays the menu and results.

### Service
Contains the application logic and connects the UI with the DAO layer.

### DAO
Handles database operations such as:

- INSERT
- SELECT
- UPDATE
- DELETE

### JDBC
Provides the connection between Java and MySQL.

### MySQL
Stores employee information such as:

- Employee ID
- Employee Name
- Email
- Salary

## Project Structure

```text
EmployeeManagementSystem
│
├── src
│   ├── Main.java
│   │
│   ├── model
│   │   └── Employee.java
│   │
│   ├── dao
│   │   ├── DBConnection.java
│   │   └── EmployeeDAO.java
│   │
│   └── service
│       └── EmployeeService.java
│
└── lib
    └── mysql-connector-j.jar
```

## JDBC Operations

The project uses `PreparedStatement` for database operations.

### Add Employee

```sql
INSERT INTO employees
(employee_name, email, salary)
VALUES (?, ?, ?);
```

### View Employees

```sql
SELECT * FROM employees;
```

### Update Employee

```sql
UPDATE employees
SET employee_name=?, email=?, salary=?
WHERE employee_id=?;
```

### Delete Employee

```sql
DELETE FROM employees
WHERE employee_id=?;
```

### Search Employee

```sql
SELECT * FROM employees
WHERE employee_id=?;
```

## Database

Database name:

```text
employee_db
```

Employee table:

```text
employees
```

## Learning Outcomes

- Understand JDBC architecture
- Connect Java with MySQL
- Perform CRUD operations using JDBC
- Use `PreparedStatement`
- Use `ResultSet`
- Understand DAO and Service layers
- Build a simple layered Java application

## Conclusion

This project demonstrates how to build a basic **Employee Management System using Java, JDBC, and MySQL** with a simple layered architecture.