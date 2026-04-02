import java.util.Scanner;

/**
 * PRACTICE PROJECT 3: Number Guessing Game
 *
 * PRACTICES: Math.random(), Scanner, while loop, if/else, int comparison.
 *
 * The program picks a random number between 1 and 100. The user guesses until
 * they get it right. Give feedback: "too high" or "too low".
 */
public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // (int)(Math.random() * 100) gives 0..99, so +1 gives 1..100
        int secret = (int) (Math.random() * 100) + 1;
        int guesses = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("I'm thinking of a number between 1 and 100.\n");

        while (true) {
            System.out.print("Your guess: ");
            int guess;
            try {
                guess = scanner.nextInt();
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Please enter a number.");
                continue;
            }
            guesses++;

            if (guess < secret) {
                System.out.println("Too low! Try again.");
            } else if (guess > secret) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You got it in " + guesses + " guess(es).");
                break;
            }
        }

        scanner.close();
    }
}
