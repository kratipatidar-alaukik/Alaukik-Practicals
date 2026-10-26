# Day 24 — JDBC

## Theory

### JDBC Architecture
JDBC (Java Database Connectivity) allows Java applications to connect and communicate with databases.

Basic flow:

`Java Application → JDBC API → JDBC Driver → MySQL Database`

### JDBC Driver
A JDBC Driver is a software component that allows Java to communicate with a specific database, such as MySQL.

### Connection
`Connection` creates a connection between the Java application and the database.

```java
Connection con = DriverManager.getConnection(url, username, password);
```

### Statement
`Statement` is used to execute simple and fixed SQL queries.

```java
Statement st = con.createStatement();
```

### PreparedStatement
`PreparedStatement` is used for parameterized SQL queries. It uses `?` placeholders and helps prevent SQL Injection.

```java
PreparedStatement ps = con.prepareStatement(
    "SELECT * FROM employees WHERE id = ?"
);
```

### ResultSet
`ResultSet` stores the data returned by a `SELECT` query and allows us to read rows one by one.

```java
ResultSet rs = st.executeQuery("SELECT * FROM employees");
```

### Transactions
A transaction is a group of database operations treated as one unit. It can be committed if successful or rolled back if an error occurs.

- `commit()` → saves changes
- `rollback()` → cancels changes

## Practical

**Connect Java application with MySQL using JDBC.**

### Topics Covered

- Connect Java with MySQL
- Execute SQL queries
- Use Statement and PreparedStatement
- Read data using ResultSet
- Understand basic transactions