# QuizApp

A simple Java console application for taking quizzes.  
QuizApp allows users to answer multiple-choice questions, keeps track of scores, and provides feedback at the end.

## Features

- **Multiple-choice questions:** Presents a series of questions with several answer options.
- **Score tracking:** Calculates and displays the user's score at the end of the quiz.
- **Immediate feedback:** Lets users know if their answer is correct or incorrect.
- **Easy to extend:** Add or modify questions easily in the source code.

## Project Structure

```
YOUR_PROJECT/
│
├── src/         # Java source files (.java)
└── QuizApp.jar  # Runnable JAR file
```

## How to Compile

1. **Navigate to the `src` directory:**
    ```sh
    cd "d:\INTERNSHIP\TASK 1\QUIZ_APP\src"
    ```

2. **Compile all Java files:**
    ```sh
    javac *.java
    ```

## How to Create the JAR

1. **From the `src` directory, create the JAR (replace `Main` with your main class name):**
    ```sh
    jar cfe QuizApp.jar Main *.class
    ```

## How to Run

1. **From the `src` directory, run:**
    ```sh
    java -jar QuizApp.jar
    ```

## Requirements

- Java Development Kit (JDK) 8 or above

## Author

- DEEP