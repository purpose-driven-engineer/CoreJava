/**
 * EXAMPLE 3: Arithmetic Operators
 *
 * TOPICS COVERED:
 * - Addition (+), subtraction (-), multiplication (*), division (/)
 * - Modulus (%) — remainder after division
 * - Integer vs floating-point division
 * - Compound assignment (+=, -=, *=, /=)
 *
 * Operators let you perform math and combine values.
 */
public class LogicalOperators {

    public static void main(String[] args) {
        int a = 17;
        int b = 5;

        // --- BASIC OPERATORS ---
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));   // 22
        System.out.println("a - b = " + (a - b));   // 12
        System.out.println("a * b = " + (a * b));   // 85
        // Integer division: result is truncated (no decimal)
        System.out.println("a / b = " + (a / b));   // 3 (not 3.4!)
        // Modulus: remainder when a is divided by b
        System.out.println("a % b = " + (a % b));   // 2 (17 = 3*5 + 2)

        // --- FLOATING-POINT DIVISION ---
        double x = 17.0;
        double y = 5.0;
        System.out.println("17.0 / 5.0 = " + (x / y));  // 3.4

        // If one operand is double, result is double
        System.out.println("17 / 5.0 = " + (a / y));    // 3.4

        // --- INCREMENT AND DECREMENT ---
        int count = 10;
        count++;  // same as count = count + 1;  → 11
        count--;  // same as count = count - 1;  → 10
        System.out.println("Count after ++ and --: " + count);

        // --- COMPOUND ASSIGNMENT ---
        int total = 100;
        total += 20;   // total = total + 20;  → 120
        total -= 10;   // total = total - 10;  → 110
        total *= 2;    // total = total * 2;   → 220
        System.out.println("Total after +=, -=, *=: " + total);
    }
}
