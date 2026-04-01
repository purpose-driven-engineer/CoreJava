import java.util.Scanner;

/**
 * PRACTICE PROJECT 2: Simple Quiz
 *
 * PRACTICES: Scanner, variables, if/else or switch, for loop, String comparison.
 *
 * Create a short multiple-choice quiz. Store questions and correct answers,
 * loop through them, and report the score at the end.
 */
public class Project02_SimpleQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Store questions and answers in parallel arrays (or you could use a 2D array)
        String[] questions = {
                "What is 2 + 2? (a) 3 (b) 4 (c) 5",
                "What is the capital of France? (a) London (b) Paris (c) Berlin",
                "How many days in a week? (a) 5 (b) 6 (c) 7"
        };
        String[] answers = { "b", "b", "c" };

        int score = 0;

        System.out.println("=== Simple Quiz ===\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();

            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong. The answer was " + answers[i] + ".\n");
            }
        }

        System.out.println("=== Results ===");
        System.out.println("You got " + score + " out of " + questions.length + " correct.");
        if (score == questions.length) {
            System.out.println("Perfect!");
        }

        scanner.close();
    }
}
