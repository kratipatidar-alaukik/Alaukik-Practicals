# Day 26 — HTTP & Web Fundamentals

## Employee REST API

A simple Spring Boot REST API created to understand **HTTP methods, REST APIs, request/response, JSON, and Postman**.

The project stores employee data using a Java **ArrayList**, so no database is used.

## Technologies Used

- Java 24
- Spring Boot
- Maven
- Postman
- VS Code
- ArrayList

## Project Structure

```text
employeeapi
│
├── src
│   └── main
│       ├── java
│       │   └── com.example.employeeapi
│       │       ├── Employee.java
│       │       ├── EmployeeController.java
│       │       └── EmployeeapiApplication.java
│       │
│       └── resources
│           └── application.properties
│
├── pom.xml
└── mvnw.cmd
```

## Features

The API supports:

- Add Employee
- View Employees
- Update Employee
- Delete Employee

## API Endpoints

Base URL:

```text
http://localhost:8080
```

| Method | Endpoint | Purpose |
|---|---|---|
| GET | `/employees` | Get all employees |
| POST | `/employees` | Add employee |
| PUT | `/employees/{id}` | Update employee |
| DELETE | `/employees/{id}` | Delete employee |

## Example POST Request

```text
POST http://localhost:8080/employees
```

Body → raw → JSON:

```json
{
    "id": 1,
    "name": "Rahul",
    "salary": 30000
}
```

`@RequestBody` converts the JSON request body into an `Employee` Java object.

## Example PUT Request

```text
PUT http://localhost:8080/employees/1
```

```json
{
    "id": 1,
    "name": "Rahul Sharma",
    "salary": 40000
}
```

## Example DELETE Request

```text
DELETE http://localhost:8080/employees/1
```

## How to Run

Open the terminal in the project folder:

```powershell
.\mvnw.cmd spring-boot:run
```

The application runs on:

```text
http://localhost:8080
```

## Important Concepts Learned

- Client-Server Architecture
- HTTP
- HTTP Methods
- GET
- POST
- PUT
- DELETE
- Request
- Response
- JSON
- `@RequestBody`
- `@PathVariable`
- REST Controller
- Testing APIs using Postman
- Using `ArrayList` as temporary storage

## Note

This project uses an `ArrayList` instead of a database. Therefore, employee data will be lost whenever the application is restarted.