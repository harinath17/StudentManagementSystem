# Student Management System

A console-based Student Management System developed using Java, JDBC, MySQL, OOP concepts, and the DAO Design Pattern.

## Features

- Add Student
- View All Students
- Search Student by Roll Number
- Search Student by Name
- Search Students by Marks Range
- Update Student Marks
- Delete Student
- Count Total Students
- Calculate Average Marks
- Find Topper Student
- Display Students Sorted by Marks
- Duplicate Roll Number Validation

## Technologies Used

- Java
- JDBC
- MySQL
- OOP (Object-Oriented Programming)
- DAO Design Pattern
- Git & GitHub

## Project Structure

```text
Main
 ↓
StudentService
 ↓
StudentDAO (Interface)
 ↓
StudentDAOImpl
 ↓
MySQL Database
```

## Database Schema

```sql
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE student (
    rollno INT PRIMARY KEY,
    name VARCHAR(50),
    marks DOUBLE
);
```

## Project Packages

```text
com.studentmanagement
│
├── Main.java
├── Student.java
├── StudentService.java
├── StudentDAO.java
├── StudentDAOImpl.java
├── DBConnection.java
└── StudentNotFoundException.java
```

## JDBC Connection

```java
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/studentdb",
    "root",
    "your_password"
);
```

## Design Patterns Used

### DAO Pattern

The DAO (Data Access Object) pattern separates business logic from database logic.

```text
Main
 ↓
Service Layer
 ↓
DAO Interface
 ↓
DAO Implementation
 ↓
Database
```

Benefits:

- Better code organization
- Easy maintenance
- Loose coupling
- Scalability

## SQL Operations Used

### CRUD Operations

```sql
INSERT INTO student VALUES(?,?,?)
SELECT * FROM student
UPDATE student SET marks=? WHERE rollno=?
DELETE FROM student WHERE rollno=?
```

### Aggregate Functions

```sql
SELECT COUNT(*) FROM student
SELECT AVG(marks) FROM student
```

### Sorting

```sql
SELECT * FROM student
ORDER BY marks DESC
```

### Topper Student

```sql
SELECT * FROM student
ORDER BY marks DESC
LIMIT 1
```

### Search by Marks Range

```sql
SELECT * FROM student
WHERE marks BETWEEN ? AND ?
```

## Learning Outcomes

Through this project I learned:

- Core Java
- OOP Concepts
- Collections Framework
- JDBC
- MySQL
- DAO Pattern
- Exception Handling
- SQL Queries
- Git & GitHub

## Future Enhancements

- Spring Boot Integration
- Hibernate/JPA
- Logging Framework
- Maven Build Tool
- REST APIs
- JUnit Testing
- User Authentication

