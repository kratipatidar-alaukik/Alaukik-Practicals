# Day 13 — Packages & Java APIs

## Theory

### 1. Packages
- A package is a group of related classes and interfaces.
- It helps organize code and avoid naming conflicts.
- Types:
  - **Built-in packages:** `java.util`, `java.io`
  - **User-defined packages:** Packages created by developers.

Example:
```java
package com.company.employee;
```

### 2. Imports
- The `import` keyword allows us to use classes from other packages.
- `java.lang` is imported automatically.
- We can import a specific class or all classes from a package.

Example:
```java
import java.util.Scanner;
import java.util.*;
```

### 3. Java API
- Java API (Application Programming Interface) is a collection of predefined classes, interfaces, and methods.
- It helps perform common tasks without writing code from scratch.

Examples:
- `String` — handles text.
- `Scanner` — takes user input.
- `ArrayList` — stores dynamic lists.
- `Math` — performs mathematical operations.

### 4. Access Control
Access modifiers control the visibility of classes, methods, and variables.

| Modifier | Accessibility |
|---|---|
| private | Within the same class |
| Default | Within the same package |
| protected | Same package and subclasses in other packages |
| public| Accessible from anywhere, subject to class and module accessibility |

Access control helps protect data and implement encapsulation.

### 5. Naming Conventions
Naming conventions make Java code readable and consistent.

| Element | Convention | Example |
|---|---|---|
| Class | PascalCase | `EmployeeDetails` |
| Variable | camelCase | `employeeName` |
| Method | camelCase | `calculateSalary()` |
| Constant | UPPER_SNAKE_CASE | `MAX_VALUE` |
| Package | Lowercase | `com.company.employee` |

### 6. Project Organization
- Project organization means arranging files and packages in a structured way.
- It makes code easier to understand, maintain, and reuse.
- Related classes should be grouped into appropriate packages.

Example:
```text
EmployeeProject/
└── src/
    └── com/
        └── company/
            └── employee/
                ├── Main.java
                ├── model/
                │   └── Employee.java
                ├── service/
                │   └── EmployeeService.java
                └── util/
                    └── EmployeeUtil.java
```

## Practical
Created a user-defined package structure for an Employee Management System using:
- com.company.employee
- com.company.employee.model
- com.company.employee.service
- com.company.employee.util

