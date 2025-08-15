import java.util.ArrayList;
import java.util.List;

public class Question{
    String questionText;
    String options[];
    int correctOption;

    Question(String questionText, String[] options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    boolean isCorrectOption(int option) {
        return option == correctOption;
    }

    public static List<Question> getAllQuestions() {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question("What is the capital of France?",
        new String[]{"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"}, 3));

        questions.add(new Question("Which language runs in a web browser?",
                new String[]{"1. Java", "2. C", "3. Python", "4. JavaScript"}, 4));

        questions.add(new Question("Which company developed Java?",
                new String[]{"1. Microsoft", "2. Sun Microsystems", "3. Google", "4. IBM"}, 2));

        questions.add(new Question("What is the largest planet in our solar system?",
                new String[]{"1. Earth", "2. Jupiter", "3. Mars", "4. Saturn"}, 2));

        questions.add(new Question("Which keyword is used to inherit a class in Java?",
                new String[]{"1. this", "2. super", "3. extends", "4. implements"}, 3));

        questions.add(new Question("Who is known as the father of computers?",
                new String[]{"1. Alan Turing", "2. Charles Babbage", "3. John von Neumann", "4. Bill Gates"}, 2));

        questions.add(new Question("Which of these is not an OOP principle?",
                new String[]{"1. Encapsulation", "2. Inheritance", "3. Polymorphism", "4. Compilation"}, 4));

        questions.add(new Question("What does SQL stand for?",
                new String[]{"1. Structured Question Language", "2. Structured Query Language", "3. Simple Query Language", "4. Standard Query Language"}, 2));

        questions.add(new Question("Which data structure uses LIFO (Last In First Out)?",
                new String[]{"1. Queue", "2. Stack", "3. Array", "4. Linked List"}, 2));

        questions.add(new Question("Which symbol is used to start a single-line comment in Java?",
                new String[]{"1. //", "2. /*", "3. #", "4. --"}, 1));

        return questions;
    }
}