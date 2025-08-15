import java.util.Scanner;
import java.util.List;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //get Questions
        List<Question> questions = Question.getAllQuestions();
        int score = 0;

        for (Question q : questions) {
            System.out.println("\n" + q.questionText);
            for (String option : q.options) {
                System.out.println(option);
            }
            System.out.print("Your answer (1-4): ");
            int userChoice = sc.nextInt();

            if (q.isCorrectOption(userChoice)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: Option " + q.correctOption);
            }
        }

        System.out.println("\nQuiz Over! Your score: " + score + "/" + questions.size());
        sc.close();
    }
}
