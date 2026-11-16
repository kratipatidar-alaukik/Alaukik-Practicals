# Day 37 — Validation & Exception Handling 
1. Bean Validation

Bean Validation is used to validate user input before processing or saving data.

It helps prevent invalid data from entering the database.

Spring Boot supports validation through annotations.

2. Validation Annotations

@NotNull

Ensures that a field cannot have a null value.

Example: @NotNull

@NotBlank

Ensures that a String is not null, empty, or containing only spaces.

Example: @NotBlank

@Email

Checks whether an email address has a valid email format.

Example: @Email

@Size

Checks the minimum and maximum length of a field.

Example: @Size(min = 3, max = 30)

3. Global Exception Handling

Global Exception Handling manages application errors in one common place.

It prevents applications from returning unclear error messages.

It helps maintain consistent API error responses.

4. @ControllerAdvice

@ControllerAdvice is used to handle exceptions globally across multiple controllers.

It avoids writing exception-handling code separately in every controller.

It works with @ExceptionHandler to catch specific exceptions.

Practical Implementation

Created an Employee REST API with:

Employee Entity with validation annotations.

EmployeeRepository using JpaRepository.

EmployeeController with REST endpoints.

@Valid to trigger input validation.

ErrorResponse class to standardize error responses.

GlobalExceptionHandler to handle validation exceptions.

API Error Response

When invalid employee data is submitted, the API returns:

{
  "status": 400,
  "message": "Invalid employee data",
  "timestamp": "2026-11-14T14:00:00"}

# Practical 
Create standardized API errors: 
{ 
"status": 400, 
"message": "Invalid employee data", 
"timestamp": "..." 
} 