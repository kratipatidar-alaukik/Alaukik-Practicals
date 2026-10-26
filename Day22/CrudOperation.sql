USE employee_db;

-- CREATE / INSERT
INSERT INTO employees
(employee_name, email, salary, department_id, role_id)
VALUES
('Neha Sharma', 'neha@gmail.com', 55000, 1, 1);

-- READ
SELECT * FROM employees;

SELECT employee_name, salary
FROM employees;

-- WHERE
SELECT *
FROM employees
WHERE salary > 45000;

-- UPDATE
UPDATE employees
SET salary = 60000
WHERE employee_name = 'Neha Sharma';

-- Check updated record
SELECT *
FROM employees
WHERE employee_name = 'Neha Sharma';

-- DELETE
DELETE FROM employees
WHERE employee_name = 'Neha Sharma';

-- ORDER BY
SELECT *
FROM employees
ORDER BY salary DESC;

-- GROUP BY
SELECT department_id, COUNT(*) AS total_employees
FROM employees
GROUP BY department_id;

-- HAVING
SELECT department_id, COUNT(*) AS total_employees
FROM employees
GROUP BY department_id
HAVING COUNT(*) > 1;