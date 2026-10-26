CREATE DATABASE employee_db;

USE employee_db;

-- Departments table
CREATE TABLE departments (
    department_id INT PRIMARY KEY AUTO_INCREMENT,
    department_name VARCHAR(100) NOT NULL UNIQUE
);

-- Roles table
CREATE TABLE roles (
    role_id INT PRIMARY KEY AUTO_INCREMENT,
    role_name VARCHAR(100) NOT NULL UNIQUE
);

-- Employees table
CREATE TABLE employees (
    employee_id INT PRIMARY KEY AUTO_INCREMENT,
    employee_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    salary DECIMAL(10,2),
    department_id INT,
    role_id INT,

    FOREIGN KEY (department_id)
        REFERENCES departments(department_id),

    FOREIGN KEY (role_id)
        REFERENCES roles(role_id)
);

-- Insert departments
INSERT INTO departments (department_name)
VALUES
('IT'),
('HR'),
('Finance');

-- Insert roles
INSERT INTO roles (role_name)
VALUES
('Java Developer'),
('HR Manager'),
('Accountant');

-- Insert employees
INSERT INTO employees
(employee_name, email, salary, department_id, role_id)
VALUES
('Rahul Sharma', 'rahul@gmail.com', 50000, 1, 1),
('Priya Singh', 'priya@gmail.com', 45000, 2, 2),
('Aman Verma', 'aman@gmail.com', 40000, 3, 3);

