# Day 28 – JSP (Java Server Pages)

## Topics Covered

- JSP
- JSP Lifecycle
- JSP vs Servlet
- JSTL (JSP Standard Tag Library)
- Expression Language (EL)
- JSP Implicit Objects
- MVC Architecture

## 1. What is JSP?
JSP stands for Java Server Pages. It is a server-side technology used to create dynamic web pages using HTML and Java.

**Advantages:**
- Easy to create dynamic web pages.
- Supports Java code and HTML.
- Reduces HTML output code compared to Servlets.
- Works with Java web applications.

## 2. JSP Lifecycle

The JSP lifecycle consists of five steps:

1. Translation – JSP is converted into a Servlet.
2. Compilation – Servlet code is compiled.
3. Class Loading – Compiled class is loaded.
4. Execution – JSP processes requests and generates responses.
5. Destruction – JSP is removed from memory.

## 3. JSP vs Servlet

| JSP | Servlet |
|---|---|
| Mainly used for UI | Mainly used for request handling |
| HTML is easy to write | HTML is written using Java code |
| Automatically converted into Servlet | Written directly as a Java class |
| Suitable for presentation | Suitable for controller logic |

## 4. JSTL

JSTL stands for JSP Standard Tag Library. It provides ready-made tags to perform common tasks without writing Java code inside JSP pages.

**Common JSTL Tags:**
- `<c:if>` – Conditional statements.
- `<c:forEach>` – Looping.
- `<c:out>` – Displays output.
- `<c:set>` – Sets variables.
- `<c:choose>` – Multiple conditions.

## 5. Expression Language (EL)

Expression Language is used to access data in JSP without writing Java code.

**Syntax:** `${}`

Examples:
```jsp
${employee.name}
${employee.email}
${sessionScope.username}
${param.id}
```

## 6. JSP Implicit Objects

JSP provides built-in objects that can be used directly.

- request – Gets client request data.
- response – Sends a response to the client.
- session – Stores user session data.
- application – Shares data across the application.
- out – Prints output.
- config – Provides servlet configuration.

Practical 
Create: 
Employee Web Application 
Pages: 
Login 
Dashboard 
Employee List 
Add Employee 
Edit Employee
Practical 
Create: 
Employee Web Application 
Pages: 
Login 
Dashboard 
Employee List 
Add Employee 
Edit Employee# Day 28 – JSP (Java Server Pages)

## Topics Covered

- JSP
- JSP Lifecycle
- JSP vs Servlet
- JSTL (JSP Standard Tag Library)
- Expression Language (EL)
- JSP Implicit Objects
- MVC Architecture

## 1. What is JSP?
JSP stands for Java Server Pages. It is a server-side technology used to create dynamic web pages using HTML and Java.

**Advantages:**
- Easy to create dynamic web pages.
- Supports Java code and HTML.
- Reduces HTML output code compared to Servlets.
- Works with Java web applications.

## 2. JSP Lifecycle

The JSP lifecycle consists of five steps:

1. Translation – JSP is converted into a Servlet.
2. Compilation – Servlet code is compiled.
3. Class Loading – Compiled class is loaded.
4. Execution – JSP processes requests and generates responses.
5. Destruction – JSP is removed from memory.

## 3. JSP vs Servlet

| JSP | Servlet |
|---|---|
| Mainly used for UI | Mainly used for request handling |
| HTML is easy to write | HTML is written using Java code |
| Automatically converted into Servlet | Written directly as a Java class |
| Suitable for presentation | Suitable for controller logic |

## 4. JSTL

JSTL stands for JSP Standard Tag Library. It provides ready-made tags to perform common tasks without writing Java code inside JSP pages.

**Common JSTL Tags:**
- `<c:if>` – Conditional statements.
- `<c:forEach>` – Looping.
- `<c:out>` – Displays output.
- `<c:set>` – Sets variables.
- `<c:choose>` – Multiple conditions.

## 5. Expression Language (EL)

Expression Language is used to access data in JSP without writing Java code.

**Syntax:** `${}`

Examples:
```jsp
${employee.name}
${employee.email}
${sessionScope.username}
${param.id}
```

## 6. JSP Implicit Objects

JSP provides built-in objects that can be used directly.

- request – Gets client request data.
- response – Sends a response to the client.
- session – Stores user session data.
- application – Shares data across the application.
- out – Prints output.
- config – Provides servlet configuration.

# Practical 
 ## Create: 
 
Employee Web Application 
Pages: 
Login 
Dashboard 
Employee List 
Add Employee 
Edit Employee