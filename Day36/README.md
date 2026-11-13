    # Day 36 – JPA Relationships

## Topics Covered
- One-to-One Relationship
- One-to-Many Relationship
- Many-to-One Relationship
- Many-to-Many Relationship
- Lazy Loading
- Eager Loading
- Department–Employee Relationship

## 1. What are JPA Relationships?

JPA relationships define how two or more database tables are connected.

They help manage relationships between Java entities and database tables.

There are four main types of relationships.

## 2. One-to-One Relationship

- One record in a table is associated with only one record in another table.
- Each record has a single corresponding record.

**Example:** One person has one passport.

**Annotation:** `@OneToOne`

## 3. One-to-Many Relationship

- One record in a table is associated with multiple records in another table.
- One parent can have many child records.

**Example:** One department has many employees.

**Annotation:** `@OneToMany`

## 4. Many-to-One Relationship

- Multiple records in one table are associated with one record in another table.

**Example:** Many employees belong to one department.

**Annotation:** `@ManyToOne`

## 5. Many-to-Many Relationship

- Multiple records in one table are associated with multiple records in another table.

**Example:** Many students can enroll in many courses.

**Annotation:** `@ManyToMany`

## 6. Lazy Loading

- Lazy loading means related data is loaded only when it is accessed.
- It helps avoid loading unnecessary data.
- It is commonly used with `@OneToMany` and `@ManyToMany`.

Example:

```java
@OneToMany(fetch = FetchType.LAZY)
private List<Employee> employees;
```

## 7. Eager Loading

- Eager loading means related data is loaded immediately along with the main entity.
- It is useful when related data is always required.
- It can increase database loading if too much data is fetched.

Example:

```java
@OneToMany(fetch = FetchType.EAGER)
private List<Employee> employees;
```

## 8. Lazy vs Eager Loading

| Lazy Loading | Eager Loading |
|---|---|
| Loads data when accessed | Loads data immediately |
| Avoids unnecessary loading | May load unnecessary data |
| Can improve performance | Can increase loading time |
| Uses `FetchType.LAZY` | Uses `FetchType.EAGER` |

## 9. Practical – Department and Employee Relationship

Implement a One-to-Many and Many-to-One relationship using Spring Boot, JPA, Hibernate, and MySQL.

**Relationship:**

```text
Department
    |
    | One-to-Many
    |
 Employees
```

- One department can have many employees.
- Each employee belongs to one department.
- The `employees` table contains a foreign key named `department_id`.
- The `departments