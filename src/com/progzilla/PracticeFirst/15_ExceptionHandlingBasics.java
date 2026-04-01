import java.util.Scanner;

/**
 * EXAMPLE 15: Exception Handling Basics
 *
 * TOPICS COVERED:
 * - try { ... } catch (ExceptionType e) { ... }
 * - Catching exceptions so the program doesn't crash
 * - Common exceptions: NumberFormatException, ArithmeticException
 * - getMessage() and printing the exception
 * - finally (optional): runs whether or not an exception occurred
 *
 * Exceptions are Java's way of signaling errors. We catch them to handle errors gracefully.
 */
public class ExceptionHandlingBasics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- TRY-CATCH: code that might throw an exception ---
        System.out.print("Enter a number: ");
        try {
            String input = scanner.nextLine();
            int num = Integer.parseInt(input);  // Throws NumberFormatException if not a number
            System.out.println("You entered: " + num);

            int result = 100 / num;  // Throws ArithmeticException if num is 0
            System.out.println("100 / " + num + " = " + result);
        } catch (NumberFormatException e) {
            // This block runs only if Integer.parseInt threw
            System.out.println("That was not a valid integer. Message: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. Message: " + e.getMessage());
        }

        // --- MULTIPLE EXCEPTIONS IN ONE CATCH (Java 7+) ---
        try {
            int[] arr = { 1, 2, 3 };
            System.out.println(arr[10]);  // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Array error: " + e.getClass().getSimpleName());
        }

        // --- FINALLY: runs no matter what (use for cleanup, e.g. closing files) ---
        try {
            System.out.println("Inside try");
            // int x = 1 / 0;  // Uncomment to see finally still run after exception
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block always runs.");
        }

        scanner.close();
    }
}
