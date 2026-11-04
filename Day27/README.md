# Day 27 – Servlet

## Overview
This project covers the fundamentals of Java Servlets and demonstrates how to create a simple Login Application using Java Servlet, HTML, JSP, and MySQL.

## Theory

### 1. Servlet
A Servlet is a Java class that runs on a web server and handles client requests. It is used to create dynamic web applications.

**Uses of Servlet:**
- Process user requests.
- Communicate with databases.
- Generate dynamic responses.
- Handle form submissions.

### 2. Servlet Lifecycle
The Servlet lifecycle is managed by the Servlet Container (Tomcat).

It consists of three main methods:

1. **init()** – Called only once when the servlet is initialized.
2. **service()** – Handles incoming requests and calls the appropriate method, such as doGet() or doPost().
3. **destroy()** – Called before the servlet is removed from service.

### 3. Request
An HTTP Request is sent by the client (browser) to the server to request a resource or perform an operation.

In Servlets, `HttpServletRequest` is used to read request information.

Example:
```java
String username = request.getParameter("username");
```

### 4. Response
An HTTP Response is sent by the server back to the client after processing a request.

In Servlets, `HttpServletResponse` is used to send responses.

Example:
```java
response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println("<h1>Hello User</h1>");
```

### 5. doGet()
- Handles HTTP GET requests.
- Commonly used to retrieve data.
- Data is generally sent through the URL query string.

### 6. doPost()
- Handles HTTP POST requests.
- Commonly used to submit form data.
- Data is generally sent in the request body.

### 7. Session
A Session is used to maintain information about a user across multiple HTTP requests.

Servlets use `HttpSession` to store and retrieve user information.

Example:
```java
HttpSession session = request.getSession();
session.setAttribute("username", "Krati");

String username = (String) session.getAttribute("username");
```

## Practical

### Project: Login Servlet Application

**Technologies Used:**
- Java
- Jakarta Servlet
- HTML
- JSP
- JDBC
- MySQL
- Apache Tomcat

### Features
- Login form using HTML.
- Accept username and password.
- Process login using `doPost()`.
- Verify user credentials using JDBC and MySQL.
- Create a session after successful login.
- Display a welcome page after successful login.
- Display an error message for invalid credentials.

### Database

Database Name: `login_db`

Table Name: `users`

| Column | Data Type |
|---|---|
| id | INT (Primary Key, Auto Increment) |
| username | VARCHAR(100) |
| password | VARCHAR(255) |

### Application Flow

```text
Login Page (HTML)
       |
       v
  LoginServlet
       |
       v
   doPost()
       |
       v
  DBConnection
       |
       v
    MySQL
       |
       v
 Validate Credentials
       |
   +---+---+
   |       |
 Valid   Invalid
   |       |
   v       v
 Session   Error Message
   |
   v
Welcome Page (JSP)
```

## Learning Outcomes
- Understood Servlet fundamentals and lifecycle.
- Learned how HTTP requests and responses work.
- Understood the difference between doGet() and doPost().
- Learned how to manage user sessions.
- Connected a Servlet application with MySQL using JDBC.
- Practiced running Java web applications on Apache Tomcat.

## Conclusion
Day 27 helped me understand how Java Servlets handle HTTP requests and responses and how they are used to build dynamic web applications.