USE employee_db;

-- 1. Employee + Department
SELECT
    e.employee_name,
    d.department_name
FROM employees e
JOIN departments d
    ON e.department_id = d.department_id;


-- 2. Employee + Salary
SELECT
    employee_name,
    salary
FROM employees;


-- 3. Department-wise Salary
SELECT
    d.department_name,
    SUM(e.salary) AS total_salary
FROM employees e
JOIN departments d
    ON e.department_id = d.department_id
GROUP BY d.department_name;


-- 4. Highest Paid Employee
SELECT
    employee_name,
    salary
FROM employees
ORDER BY salary DESC
LIMIT 1;