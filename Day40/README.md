# Day 40 – API Documentation & Testing

## Topics Covered

### 1. API Testing
- Testing REST API endpoints.
- Verifying HTTP status codes.
- Checking request and response data.
- Testing GET, POST, PUT and DELETE APIs.

### 2. Unit Testing
- Testing individual methods and classes independently.
- Verifying business logic.
- Identifying errors in individual components.

### 3. Integration Testing
- Testing multiple application components together.
- Verifying communication between Controller, Service, Repository and Database.
- Testing complete application workflows.

### 4. JUnit
- Introduction to JUnit 5.
- Writing and executing test cases.
- Understanding `@Test`, `@BeforeEach` and `@AfterEach`.
- Using assertions such as `assertEquals()` and `assertNotNull()`.

### 5. Mockito
- Introduction to Mockito.
- Creating mock objects using `@Mock`.
- Injecting mock dependencies using `@InjectMocks`.
- Using `when()`, `thenReturn()` and `verify()`.
- Testing service logic without connecting to the actual database.

### 6. Swagger / OpenAPI
- Understanding API documentation.
- Difference between Swagger and OpenAPI.
- Generating interactive REST API documentation.
- Exploring and testing API endpoints using Swagger UI.

## Practical Implementation

Tested the Employee Management System components:

1. **Controller Testing**
   - Tested REST API endpoints.
   - Verified HTTP responses and status codes.

2. **Service Testing**
   - Tested business logic using JUnit and Mockito.
   - Mocked repository dependencies.

3. **Repository Testing**
   - Tested database operations.
   - Verified data retrieval and persistence.

4. **Authentication Testing**
   - Tested user registration and login.
   - Verified JWT token generation.
   - Tested protected API access.

5. **API Documentation**
   - Integrated Swagger/OpenAPI.
   - Generated interactive API documentation.
   - Explored and tested endpoints through Swagger UI.

## Tools & Technologies

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- JUnit 5
- Mockito
- Spring Boot Test
- MockMvc
- Swagger / OpenAPI
- Postman
- Maven



