/**
 * EXAMPLE 5: if, else if, and else
 *
 * TOPICS COVERED:
 * - if (condition) { ... }
 * - else if and else
 * - Comparison operators: ==, !=, <, >, <=, >=
 * - Logical operators: && (and), || (or), ! (not)
 * - Block scope: variables declared inside {} are local to that block
 *
 * Conditionals let your program make decisions based on values.
 */
public class IfElse {

    public static void main(String[] args) {
        int score = 75;

        // --- SIMPLE IF ---
        if (score >= 60) {
            System.out.println("You passed!");
        }

        // --- IF-ELSE (exactly one branch runs) ---
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // --- COMPARISON OPERATORS ---
        int a = 10, b = 20;
        System.out.println("a == b? " + (a == b));   // false (equal)
        System.out.println("a != b? " + (a != b));   // true (not equal)
        System.out.println("a < b?  " + (a < b));   // true
        System.out.println("a > b?  " + (a > b));   // false
        System.out.println("a <= 10? " + (a <= 10)); // true
        System.out.println("a >= 10? " + (a >= 10)); // true

        // --- LOGICAL OPERATORS ---
        boolean hasTicket = true;
        boolean hasId = true;
        if (hasTicket && hasId) {
            System.out.println("You may enter. (both conditions true)");
        }

        int age = 16;
        if (age < 13 || age > 65) {
            System.out.println("Discount applies. (either condition true)");
        }

        boolean rainy = false;
        if (!rainy) {
            System.out.println("It's not raining. (! flips boolean)");
        }

        // --- STRING COMPARISON: use .equals(), not == ---
        String answer = "yes";
        if (answer.equals("yes")) {
            System.out.println("User said yes. (correct way to compare strings)");
        }
    }
}
