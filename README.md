# University Student Management System

## About the Project

The University Student Management System is a Java project developed as part of the capstone assignment, **Building Data-Driven Java Applications with JDBC & OOP**.

The project focuses on applying Java programming concepts to a practical university management scenario. It brings together object-oriented programming, Java collections, database connectivity, and version control.

The main goal is to build an application that can manage students, courses, and enrollments while keeping the code organized, reusable, and easy to maintain.

## Technologies and Tools

- **Java (JDK 26):** Application development.
- **PostgreSQL:** Relational database for storing information.
- **JDBC:** Connecting Java applications to the database.
- **IntelliJ IDEA:** Java development environment.
- **Git and GitHub:** Version control and project management.

## Project Structure

The project is organized into three main parts:

### Lab 1: Object-Oriented Programming

This lab focuses on designing and organizing the application using object-oriented programming principles.

The work includes:
- Creating Student, Course, and Instructor classes.
- Applying encapsulation through private fields, constructors, getters, and setters.
- Using inheritance and method overriding.
- Demonstrating polymorphism.
- Using Java Collections such as List, Set, and Map to manage data.

### Lab 2: Database Integration with JDBC

This lab extends the university management system by connecting Java to a PostgreSQL database.

The work includes:
- Creating the students, courses, and enrollments tables.
- Establishing a database connection using JDBC.
- Implementing Create, Read, Update, and Delete (CRUD) operations for students and courses.
- Using PreparedStatement for executing SQL queries safely.
- Applying the Data Access Object (DAO) pattern through StudentDAO, CourseDAO, and EnrollmentDAO.
- Retrieving enrollment information using SQL INNER JOIN.

### Lab 3: Mini Capstone Project

The final part of the assignment brings together the concepts learned in Labs 1 and 2 to develop a university management console application.

The planned features include:
- Managing student and course records.
- Enrolling students in courses.
- Viewing students together with their enrolled courses.
- Handling invalid inputs and database errors.
- Using Git and GitHub to practice collaborative development.

## Database Design

The project uses a PostgreSQL database named `university_management`.

It contains three main tables:

| Table | Purpose |
|---|---|
| students | Stores student information. |
| courses | Stores available course information. |
| enrollments | Connects students with the courses they take. |

Primary keys, foreign keys, and constraints are used to maintain relationships and data integrity.

## How to Run the Project

1. Install Java JDK and PostgreSQL.
2. Clone or download this repository.
3. Open the project in IntelliJ IDEA.
4. Create a PostgreSQL database named `university_management`.
5. Execute the SQL commands in `src/Lab2_JDBC/database_setup.sql`.
6. Add the PostgreSQL JDBC driver to the project.
7. Configure the `DB_PASSWORD` environment variable with your PostgreSQL password.
8. Run the appropriate `Main` class from the package you want to test.

## What I Am Learning

Through this project, I am gaining practical experience in:

- Writing organized and reusable Java code.
- Understanding object-oriented programming in real applications.
- Managing data using Java Collections.
- Connecting Java applications to PostgreSQL databases.
- Performing database operations using JDBC.
- Separating database operations from other application responsibilities using the DAO pattern.
- Managing project changes with Git and GitHub.

## Author

**Deborah ABIMANA**