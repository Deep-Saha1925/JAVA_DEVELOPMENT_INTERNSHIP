# Student Management System

This is a simple console-based Student Management System implemented in Java.  
It allows you to add, view, update, and delete student records.

## Features

- **Add Student:** Enter student ID, name, and marks to add a new student.
- **View Students:** Display all students in the system.
- **Update Student:** Update the name and marks of an existing student by ID.
- **Delete Student:** Remove a student from the system by ID.

## Structure

- The `Student` class is created separately to represent student data (ID, name, marks).
- The `Management` class contains the main logic and uses the `Student` class for all operations.

## How to Run

1. Open a terminal and navigate to the `STUDENT_MANAGEMENT_SYSTEM/src` directory.
2. Compile the Java files:
   ```
   javac Management.java Student.java
   ```
3. Run the program:
   ```
   java STUDENT_MANAGEMENT_SYSTEM.src.Management
   ```

## Requirements

- Java Development Kit (JDK) installed.

## Author

- DEEP SAHA