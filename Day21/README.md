# Day 21 — SQL Fundamentals

# Theory
## 1. Database

A database is an organized collection of data that can be stored, managed, and accessed easily.

Example

An employee database can store:

Employee details
Department details
Role details
Salary information

Example database:
employee_db

## 2. DBMS

DBMS stands for Database Management System.

It is software used to create, store, update, delete, and manage data in a database.

Examples

MySQL
Oracle
PostgreSQL
Microsoft SQL Server
Main operations

Create
Read
Update
Delete
These are commonly called CRUD operations.

## 3. RDBMS

RDBMS stands for Relational Database Management System.

It stores data in tables and allows tables to be related to each other.

Examples

MySQL
PostgreSQL
Oracle
SQL Server

For example:

employees
    |
    | department_id
    ↓
departments

The tables are connected using keys.

## 4. Tables

A table stores data in the form of rows and columns.

Example:

employees

+-------------+---------------+--------+
| employee_id | employee_name | salary |
+-------------+---------------+--------+
| 1           | Rahul         | 50000  |
| 2           | Priya         | 45000  |
+-------------+---------------+--------+

Row

A row represents one complete record.

Example:

1 | Rahul | 50000

Column

A column represents a particular type of information.

Example:

employee_id
employee_name
salary

## 6. Foreign Key

A foreign key is used to create a relationship between two tables.

Example:

FOREIGN KEY (department_id)
REFERENCES departments(department_id)

Here:

employees.department_id
          ↓
departments.department_id

This means an employee can be connected to a department.

Example

departments

1 → IT
2 → HR
3 → Finance

employees

Rahul → department_id = 1

Therefore:

Rahul → IT

## 7. Constraints

Constraints are rules applied to table columns to maintain correct and valid data.

Common constraints

PRIMARY KEY

Uniquely identifies a record.

id INT PRIMARY KEY

NOT NULL

The value cannot be empty.

name VARCHAR(100) NOT NULL

UNIQUE

Prevents duplicate values.

email VARCHAR(100) UNIQUE

FOREIGN KEY

Creates a relationship between tables.

FOREIGN KEY (department_id)
REFERENCES departments(department_id)

AUTO_INCREMENT

Automatically generates increasing numbers.

id INT AUTO_INCREMENT

## 8. Normalization

Normalization is the process of organizing data to reduce duplicate data and improve data consistency.

Instead of storing everything in one large table, we divide data into related tables.

Without normalization

employees

Employee | Department | Role
--------------------------------
Rahul    | IT         | Developer
Priya    | IT         | Developer
Aman     | IT         | Developer

Here, IT and Developer are repeated.

After normalization

We create separate tables:

departments
----------------
1 | IT
2 | HR

roles
----------------
1 | Developer
2 | Manager

employees
----------------
1 | Rahul | 1 | 1
2 | Priya | 1 | 1

Now the employee table stores IDs instead of repeatedly storing department and role names.

Benefits:
Reduces duplicate data
Improves data consistency
Makes database easier to maintain
Makes relationships between data clearer


# Practical
Install/configure MySQL.
## Create:
employee_db
Tables:
employees
departments
roles