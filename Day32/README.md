# Day 32 – Dependency Injection in Spring

## 1. Dependency Injection (DI)

Dependency Injection is a feature of Spring in which Spring provides the required objects (dependencies) to a class instead of the class creating them manually.

**Advantages:**
- Reduces tight coupling.
- Makes code reusable.
- Makes testing easier.
- Improves maintainability.

## 2. Types of Dependency Injection

### Constructor Injection
Dependencies are provided through a class constructor.

```java
@Component
class StudentService {
}

@Component
class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }
}
```

**Advantages:**
- Recommended approach.
- Supports final fields.
- Makes dependencies mandatory.

### Setter Injection
Dependencies are provided through setter methods.

```java
@Component
class StudentController {

    private StudentService service;

    @Autowired
    public void setService(StudentService service) {
        this.service = service;
    }
}
```

**Use:** When a dependency is optional or can be changed later.

### Field Injection
Dependencies are injected directly into class fields.

```java
@Component
class StudentController {

    @Autowired
    private StudentService service;
}
```

**Note:** Field injection is easy to write but is generally not recommended because it makes testing and dependency management harder.

## 3. @Component

- `@Component` marks a Java class as a Spring-managed bean.
- Spring detects it through component scanning.
- Spring creates and manages its object.

Example:

```java
@Component
public class StudentService {
}
```

## 4. @Service

- `@Service` is a specialized form of `@Component`.
- It is used for classes that contain business logic.
- It helps organize the service layer.

Example:

```java
@Service
public class StudentService {
}
```

## 5. @Repository

- `@Repository` is used for the database access layer.
- It marks classes that perform database operations.
- It also supports translation of persistence-related exceptions.

Example:

```java
@Repository
public class StudentRepository {
}
```

## 6. @Autowired

- `@Autowired` tells Spring to inject a required dependency automatically.
- It can be

# Practical 
Build: 
Controller 
↓ 
Service 
↓ 
Repository 