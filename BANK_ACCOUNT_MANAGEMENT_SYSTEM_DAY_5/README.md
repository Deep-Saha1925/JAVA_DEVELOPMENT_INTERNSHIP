# Bank Account Management System

A simple console-based Bank Account Management System in Java.  
This application allows users to create a bank account, deposit and withdraw money, view their balance, and see a list of transactions.

## Features

- **Create Account:** Enter account holder name and initial balance.
- **Deposit:** Add money to your account.
- **Withdraw:** Remove money from your account (with balance check).
- **View Balance:** Display the current account balance.
- **View Transactions:** Show a list of all deposits and withdrawals.
- **Exit:** Close the application.

## Project Structure

- `Main.java` — Contains the main menu and user interaction logic.
- `Account.java` — Handles account operations (deposit, withdraw, balance, transactions).
- `BankAccountManagementSystem.jar` — The runnable JAR file located in the main project directory.

## How to Compile and Run

1. **Navigate to the `src` directory:**
    ```sh
    cd "d:\INTERNSHIP\TASK 1\BANK_ACCOUNT_MANAGEMENT_SYSTEM_DAY_5\src"
    ```

2. **Compile all Java files:**
    ```sh
    javac *.java
    ```

3. **Create the JAR file (from the `src` directory):**
    ```sh
    jar cfe ../BankAccountManagementSystem.jar Main *.class
    ```

4. **Run the JAR file (from the main project directory):**
    ```sh
    java -jar BankAccountManagementSystem.jar
    ```

## Requirements

- Java Development Kit (JDK) 8 or above

## Author

- DEEP SAHA

---