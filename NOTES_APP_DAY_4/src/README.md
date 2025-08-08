# Notes App

A simple console-based Notes Application in Java.  
This app allows you to add notes to a file and view notes from a file.

## Features

- **Add Note:** Save a note to a specified file.
- **View Notes:** Display all notes from a specified file.
- **Exit:** Close the application.

## Project Structure

- `Main.java` — Contains the main menu and user interaction logic.
- `NoteApp.java` — Handles note operations (adding and viewing notes).

> **Note:** Both files use the package `NOTES_APP_DAY_4.src`.  
> Your `.java` files must be in the folder:  
> `src/NOTES_APP_DAY_4/src/`

## How to Compile and Run

1. **Navigate to your project root:**
    ```sh
    cd "d:\INTERNSHIP\TASK 1\NOTES_APP_DAY_4"
    ```

2. **Compile the Java files:**
    ```sh
    javac src\NOTES_APP_DAY_4\src\*.java
    ```

3. **Create the JAR file:**
    ```sh
    jar cfe NotesApp.jar NOTES_APP_DAY_4.src.Main -C src NOTES_APP_DAY_4
    ```

4. **Run the JAR:**
    ```sh
    java -jar NotesApp.jar
    ```

## Requirements

- Java Development Kit (JDK) 8 or above

## Author