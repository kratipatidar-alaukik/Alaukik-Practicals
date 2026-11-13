# Day 33 – Spring Boot Introduction

## Topics Covered
- Spring Boot
- Auto Configuration
- Spring Boot Starters
- Application Properties
- Embedded Server
- Spring Boot Project Structure

## 1. What is Spring Boot?

Spring Boot is a Java framework built on top of the Spring Framework. It makes it easier to create standalone, production-ready applications with minimal configuration.

**Advantages:**
- Reduces manual configuration.
- Simplifies application development.
- Provides embedded servers.
- Supports REST API development.
- Makes dependency management easier.

## 2. Auto Configuration

Auto Configuration automatically configures the Spring application based on the dependencies available in the project.

**Example:**

When we add the Spring Web dependency, Spring Boot automatically configures the web application and embedded server.

**Annotation:**
```java
@SpringBootApplication
```

This annotation enables auto-configuration along with component scanning and Spring Boot configuration.

## 3. Spring Boot Starters

Starters are ready-made dependency packages that provide the libraries required for specific features.

**Common Starters:**

| Starter | Purpose |
|---|---|
| `spring-boot-starter-web` | REST APIs and web applications |
| `spring-boot-starter-data-jpa` | Database operations using JPA |
| `spring-boot-starter-security` | Application security |
| `spring-boot-starter-test` | Testing applications |
| `spring-boot-starter-validation` | Input validation |

## 4. Application Properties

The `application.properties` file is used to configure Spring Boot applications.

**Location:**
```text
src/main/resources/application.properties
```

**Examples:**

```properties
server.port=8081

spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

**Purpose:**
- `server.port` – Changes the application port.
- `spring.datasource.url` – Database connection URL.
- `spring.datasource.username` – Database username.
- `spring.datasource.password` – Database password.
- `spring.jpa.hibernate.ddl-auto` – Controls database schema management.
- `spring.jpa.show-sql` – Displays generated SQL queries.

## 5. Embedded Server

An embedded server is a server included with the application, so we do not need to install and configure a separate server to run it.

**Example:**
- Spring Boot Web applications commonly use embedded Tomcat.
- The application can run directly using the main method.
- It can be packaged as an executable JAR file.

## 6. Spring Boot Project Structure

```text
EmployeeManagement/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       ├── DemoApplication.java
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── repository/
│   │   │       └── model/
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── pom.xml
└── mvnw
```

**Important Files and Folders:**

- `DemoApplication.java` – Main class used to start the application.
- `controller` – Handles HTTP requests.
- `service` – Contains business logic.
- `repository` – Handles database operations.
- `model` – Contains entity or model classes.
- `resources` – Stores configuration and static resources.
- `application.properties` – Application configuration.
- `pom.xml` – Manages Maven dependencies and project configuration.
- `test` – Contains test classes.

# Practical 
Create Spring Boot application. 