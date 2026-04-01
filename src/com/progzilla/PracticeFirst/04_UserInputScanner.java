import java.util.Scanner;

/**
 * EXAMPLE 4: User Input with Scanner
 *
 * TOPICS COVERED:
 * - Importing classes (java.util.Scanner)
 * - Creating a Scanner tied to System.in (keyboard)
 * - nextInt(), nextDouble(), next(), nextLine()
 * - Closing the scanner when done (good practice)
 *
 * Scanner reads input from the user so your program can react to what they type.
 */
public class UserInputScanner {

    public static void main(String[] args) {
        // System.in is the "standard input" stream (usually the keyboard)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        // nextLine() reads the entire line including spaces
        String name = scanner.nextLine();

        System.out.print("Enter your age (integer): ");
        // nextInt() reads an integer; throws exception if user types non-number
        int age = scanner.nextInt();

        System.out.print("Enter your height in meters (e.g. 1.75): ");
        double height = scanner.nextDouble();

        // Consume the leftover newline after nextDouble() so next nextLine() works
        scanner.nextLine();

        System.out.print("Enter your favorite color (one word): ");
        // next() reads only up to the next space (one "token")
        String color = scanner.next();

        // Use the input
        System.out.println("\n--- Your info ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " m");
        System.out.println("Favorite color: " + color);

        // Closing the scanner releases the resource (recommended)
        scanner.close();
    }
}
