# Day 31 – Spring Framework Introduction

## Topics Covered
- Why Spring Framework?
- Spring Ecosystem
- IoC (Inversion of Control)
- DI (Dependency Injection)
- Spring Bean
- ApplicationContext

## 1. What is Spring Framework?
Spring is a Java framework used to develop enterprise applications. It simplifies development by providing features like Dependency Injection, IoC, security, and database connectivity.

## 2. Why Spring?
- Reduces boilerplate code.
- Supports loose coupling.
- Makes applications easier to maintain.
- Provides Dependency Injection.
- Simplifies database connectivity.
- Supports REST API development.

## 3. Spring Ecosystem

Important Spring modules:

- **Spring Core:** Provides IoC and DI.
- **Spring MVC:** Used for web application development.
- **Spring Boot:** Simplifies Spring application setup.
- **Spring Data JPA:** Simplifies database operations.
- **Spring Security:** Handles authentication and authorization.
- **Spring Cloud:** Supports microservices development.

## 4. IoC (Inversion of Control)

IoC means giving control of object creation and management to the Spring container instead of creating objects manually.

**Without Spring:**
```java
Student student = new Student();
```

**With Spring:** Spring creates and manages the Student object

# Practical 
Create first Spring project. 