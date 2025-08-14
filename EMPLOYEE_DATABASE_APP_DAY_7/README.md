# Employee Database App

A Java console application for managing employee records using a database.  
This app allows you to add, view, update, and delete employee information with persistent storage.

## Features

- **Add Employee:** Insert new employee records into the database.
- **View Employees:** List all employees.
- **Update Employee:** Modify existing employee details.
- **Delete Employee:** Remove an employee from the database.
- **Search Employee:** Find employees by ID or name.

## Project Structure

```
YOUR_PROJECT/
│
├── src/         # Java source files (.java)
├── bin/         # Compiled class files (.class)
├── lib/         # External libraries (e.g., MySQL connector JAR)
└── EmployeeDatabaseApp.jar  # Runnable JAR file
```

## How to Compile

1. **Compile the source files to the `bin` directory:**
    ```sh
    javac -d bin -cp "lib/mysql-connector.jar" src/*.java
    ```

## How to Create the JAR

1. **Navigate to the `bin` directory:**
    ```sh
    cd bin
    ```

2. **Create the JAR file (replace `MainClass` with your actual main class name):**
    ```sh
    jar cfe ../EmployeeDatabaseApp.jar MainClass *
    ```

## How to Run

1. **From the project root, run:**
    ```sh
    java -cp "EmployeeDatabaseApp.jar;lib/mysql-connector.jar" MainClass
    ```
    - On Linux/Mac, use `:` instead of `;` as the separator.

## Requirements

- Java Development Kit (JDK) 8 or above
- MySQL database (or your chosen DB)
- MySQL JDBC Connector (place the JAR in the `lib` folder)

## Author

- DEEP SAHA

---

**Tip:**  
Update `MainClass` with the fully qualified name of your main class if it’s in a package (e.g., `com.company.Main