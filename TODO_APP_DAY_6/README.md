# TODO App

A simple Java Swing-based TODO application.  
This app provides a graphical interface to manage your tasks.

## Features

- Add new tasks
- Mark tasks as completed
- Remove tasks
- User-friendly GUI

## Project Structure

- `Main.java` — Launches the application using Swing.
- `ToDoApp.java` — Contains the main GUI and logic for the TODO app.
- `ToDoApp.jar` — Runnable JAR file located in the main project directory.

## How to Compile and Run

1. **Navigate to the `src` directory:**
    ```sh
    cd "d:\INTERNSHIP\TASK 1\TODO_APP_DAY_6\src"
    ```

2. **Compile all Java files:**
    ```sh
    javac *.java
    ```

3. **Create the JAR file (from the `src` directory):**
    ```sh
    jar cfe ../ToDoApp.jar Main *.class
    ```

4. **Run the JAR file (from the main project directory):**
    ```sh
    java -jar ToDoApp.jar
    ```

## Requirements

- Java Development Kit (JDK) 8 or above

## Author

- DEEP