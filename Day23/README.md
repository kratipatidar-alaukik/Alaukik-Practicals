# Day 23 — Advanced SQL

# Theory

## 1. Joins

A JOIN is used to combine data from two or more related tables.

Example:

SELECT e.employee_name, d.department_name
FROM employees e
JOIN departments d
ON e.department_id = d.department_id;

## 2. Inner Join

Returns only matching records from both tables.

SELECT e.employee_name, d.department_name
FROM employees e
INNER JOIN departments d
ON e.department_id = d.department_id;

## 3. Left Join

Returns all records from the left table and matching records from the right table.

SELECT e.employee_name, d.department_name
FROM employees e
LEFT JOIN departments d
ON e.department_id = d.department_id;

## 6. Aggregate Functions

Aggregate functions perform calculations on multiple rows.

Common functions:

COUNT() → counts rows
SUM()   → calculates total
AVG()   → calculates average
MAX()   → finds highest value
MIN()   → finds lowest value

Example:

SELECT AVG(salary)
FROM employees;

## 7. Indexes

An index helps the database find data faster.

Example:

CREATE INDEX idx_employee_email
ON employees(email);

Check indexes:

SHOW INDEX FROM employees;

Indexes can improve search performance, but too many indexes can slow down INSERT, UPDATE, and DELETE.

# Practical
Create reporting queries:
Employee + Department
Employee + Salary
Department-wise salary
Highest paid employee