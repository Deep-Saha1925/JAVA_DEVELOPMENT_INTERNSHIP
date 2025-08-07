# Library Management System

A simple console-based Library Management System in Java.  
This application allows you to manage books and users, issue and return books, and perform basic library operations.

## Features

- **Add Book:** Add a new book by title and author.
- **Show All Books:** List all books in the library.
- **Add User:** Register a new user by name.
- **Show All Users:** List all registered users.
- **Issue Book:** Issue a book to a user by user ID and book title.
- **Return Book:** Return a book from a user by user ID and book title.
- **Delete Book:** Remove a book from the library by title.
- **Exit:** Close the application.

## Project Structure

- `Main.java` — Contains the main menu and user interaction logic.
- `Library.java` — Handles the core library operations (not shown here).
- `Book.java` — Represents a book entity.
- `User.java` — Represents a user entity.

> **Note:** The `Book`, `User`, and `Library` classes should be in the same package as `Main.java` (`LIBRARY_MANAGEMENT_SYSTEM_DAY_3.src`).

## How to Compile and Run

1. **Navigate to the `src` directory:**
    ```sh
    cd "d:\INTERNSHIP\TASK 1\LIBRARY_MANAGEMENT_SYSTEM_DAY_3\src"
    ```

2. **Compile all Java files:**
    ```sh
    javac LIBRARY_MANAGEMENT_SYSTEM_DAY_3\src\*.java
    ```

3. **Run the program:**
    ```sh
    java LIBRARY_MANAGEMENT_SYSTEM_DAY_3.src.Main
    ```

## Requirements

- Java Development Kit (JDK) 8 or above

## Author

- DEEP SAHA

---