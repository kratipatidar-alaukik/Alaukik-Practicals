# Day 34 – Spring Boot REST API (Theory)

## 1. REST Architecture

REST stands for Representational State Transfer. It is an architectural style used to develop web services that allow clients and servers to communicate over HTTP.

REST APIs commonly exchange data in JSON format.

## 2. REST Principles

1. **Client-Server:** Client and server work independently.
2. **Stateless:** Every request contains the information needed to process it.
3. **Cacheable:** Responses can be cached when appropriate.
4. **Uniform Interface:** APIs follow a consistent communication structure.
5. **Layered System:** The client does not need to know the internal server structure.

## 3. @RestController

- Used to create REST API controllers.
- Combines `@Controller` and `@ResponseBody`.
- Returns data directly, usually in JSON format.

Example:
```java
@RestController
@RequestMapping("/employees")
public class EmployeeController {
}
```

## 4. @GetMapping

- Used to retrieve data from the server.
- Commonly used to fetch all records or a particular record.

Example:
```java
@GetMapping
public String getEmployees() {
    return "All Employees";
}
```

## 5. @PostMapping

- Used to create new records.
- Receives data from the client, usually through `@RequestBody`.

Example:
```java
@PostMapping
public String addEmployee() {
    return "Employee Added";
}
```

## 6. @PutMapping

- Used to update an existing record.
- Usually identifies the record using its ID.

Example:
```java
@PutMapping("/{id}")
public String updateEmployee(@PathVariable int id) {
    return "Employee Updated: " + id;
}
```

## 7. @DeleteMapping

- Used to delete an existing record.
- Usually identifies the record using its ID.

Example:
```java
@DeleteMapping("/{id}")
public String deleteEmployee(@PathVariable int id) {
    return "Employee Deleted: " + id;
}
```

## 8. Path Variables

- `@PathVariable` extracts values from the URL.
- Used to identify a specific resource.

Example:
```java
@GetMapping("/{id}")
public String getEmployee(@PathVariable int id) {
    return "Employee ID: " + id;
}
```

URL: `/employees/1`

## 9. Request Parameters

- `@RequestParam` extracts values from query parameters in the URL.
- Commonly used for searching and filtering.

Example:
```java
@GetMapping("/search")
public String searchEmployee(@RequestParam String name) {
    return "Searching: " + name;
}
```

URL: `/employees/search?name=Krati`

## 10. Request Body

- `@RequestBody` reads data sent by the client in the HTTP request body.
- Spring converts JSON data into a Java object.
- Commonly used with POST and PUT requests.

Example:
```java
@PostMapping
public Employee addEmployee(@RequestBody Employee employee) {
    return employee;
}
```

JSON:
```json
{
    "employeeName": "Krati",
    "employeeEmail": "krati@gmail.com"
}
```

## 11. Difference Between PathVariable, RequestParam and RequestBody

| Annotation | Purpose | Example |
|---|---|---|
| `@PathVariable` | Gets value from URL path | `/employees/1` |
| `@RequestParam` | Gets value from query parameter | `?name=Krati` |
| `@RequestBody` | Gets data from request body | JSON data |

## 12. HTTP Methods Summary

| Method | Purpose |
|---|---|
| GET | Retrieve data |
| POST | Create data |
| PUT | Update data |
| DELETE | Delete data |


# Practical 
Build: 
Employee REST API 
GET    /employees 
GET    /employees/{id} 
POST   /employees 
PUT    /employees/{id} 
DELETE /employees/{id}