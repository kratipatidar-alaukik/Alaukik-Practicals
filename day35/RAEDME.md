Day 35 — Spring Data JPA 
# Day 35 – JPA and Hibernate

## Topics Covered
- ORM (Object Relational Mapping)
- JPA (Java Persistence API)
- Hibernate
- Entity
- Repository
- JpaRepository
- Entity Relationships

## 1. ORM (Object Relational Mapping)

ORM is a technique that maps Java objects to database tables.

It allows developers to work with Java classes and objects instead of writing SQL queries for every database operation.

**Example:**
- Java Class → Database Table
- Java Object → Table Row
- Class Variables → Table Columns

**Advantages:**
- Reduces SQL code.
- Simplifies database operations.
- Makes code easier to maintain.

## 2. JPA (Java Persistence API)

- JPA is a Java specification used for mapping Java objects to database tables.
- It defines standards for database operations.
- It provides annotations like `@Entity`, `@Id`, and `@OneToMany`.
- JPA itself is not an implementation; Hibernate is a popular implementation of JPA.

## 3. Hibernate

- Hibernate is an ORM framework and a popular implementation of JPA.
- It maps Java classes to database tables.
- It automatically generates SQL queries for many database operations.
- It helps perform CRUD operations.

**Example:**

```java
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
```

Hibernate uses this entity mapping to manage the corresponding database table.

## 4. Entity

- An Entity is a Java class mapped to a database table.
- It is marked using `@Entity`.
- `@Id` identifies the primary key.
- `@GeneratedValue` generates primary key values automatically.

**Common Annotations:**

| Annotation | Purpose |
|---|---|
| `@Entity` | Marks a class as an entity |
| `@Id` | Defines the primary key |
| `@GeneratedValue` | Generates primary key values |
| `@Column` | Configures a database column |
| `@Table` | Specifies the table name |

## 5. Repository

- Repository is used to communicate with the database.
- It contains methods for database operations.
- It separates database access logic from business logic.
- In Spring Data JPA, repositories reduce the need to write common CRUD queries manually.

## 6. JpaRepository

`JpaRepository` is an interface provided by Spring Data JPA.

It provides ready-made methods for database operations.

**Example:**

```java
@Repository
public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {
}
```

**Common Methods:**

| Method | Purpose |
|---|---|
| `save()` | Insert or update data |
| `findAll()` | Retrieve all records |
| `findById()` | Find record by ID |
| `deleteById()` | Delete record by ID |
| `existsById()` | Check whether ID exists |

## 7. Entity Relationships

Entity relationships define how database tables are connected.

There are four main types:

### One-to-One
One record is related to only one record in another table.

**Example:** One person has one passport.

Annotation: `@OneToOne`

### One-to-Many
One record is related to multiple records in another table.

**Example:** One department has many employees.

Annotation: `@OneToMany`

### Many-to-One
Many records are related to one record in another table.

**Example:** Many employees belong to one department.

Annotation: `@ManyToOne`

### Many-to-Many
Multiple records in one table are related to multiple records in another table.

**Example:** Many students can enroll in many courses.

Annotation: `@ManyToMany`

## 8. Important Relationship Annotations

| Annotation | Purpose |
|---|---|
| `@OneToOne` | One-to-one relationship |
| `@OneToMany` | One-to-many relationship |
| `@ManyToOne` | Many-to-one relationship |
| `@ManyToMany` | Many-to-many relationship |
| `@JoinColumn` | Specifies the foreign key column |
| `@JoinTable` | Specifies the joining table |

## 9. Practical Implementation

Create an Employee Management System using:

- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL

Implement:
- Employee Entity
- Department Entity
- EmployeeRepository
- DepartmentRepository
- CRUD operations
- Employee–Department relationship

**Architecture Flow:**

Controller → Service → Repository → Hibernate/JPA → MySQL Database

 