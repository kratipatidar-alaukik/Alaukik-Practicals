# Day 22 — SQL CRUD & Queries

# Theory

## 1. CREATE

Used to create a database or table.

CREATE TABLE products (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    price DECIMAL(10,2)
);

## 2. INSERT

Used to add data.

INSERT INTO products
VALUES (1, 'Laptop', 55000);

## 3. SELECT

Used to read data.

SELECT * FROM products;

## 4. UPDATE

Used to modify existing data.

UPDATE products
SET price = 60000
WHERE id = 1;

## 5. DELETE

Used to remove data.

DELETE FROM products
WHERE id = 1;

## 6. WHERE

Used to filter rows.

SELECT * FROM products
WHERE price > 5000;

## 7. ORDER BY

Used to sort data.

SELECT * FROM products
ORDER BY price DESC;

## 8. GROUP BY

Used to group similar data.

SELECT category, COUNT(*)
FROM products
GROUP BY category;

## 9. HAVING

Used to filter grouped data.

SELECT category, COUNT(*)
FROM products
GROUP BY category
HAVING COUNT(*) > 1;

## CRUD

C → Create → INSERT
R → Read   → SELECT
U → Update → UPDATE
D → Delete → DELETE

# Practical
Perform CRUD operations using MySQL.