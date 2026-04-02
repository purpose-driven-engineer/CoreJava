/**
 * EXAMPLE 6: switch Statement
 *
 * TOPICS COVERED:
 * - switch (expression) with case and break
 * - default branch (when no case matches)
 * - Why break is important (fall-through)
 * - switch with int, String, and enum (concept)
 *
 * Use switch when you have many possible values for one variable (cleaner than long if-else).
 */
public class SwitchStatement {

    public static void main(String[] args) {
        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;  // Without break, execution "falls through" to the next case!
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                // Multiple cases can share the same code (intentional fall-through)
                System.out.println("Weekend!");
                break;
            default:
                // Runs when no case matches (like else)
                System.out.println("Invalid day (1-7)");
                break;
        }

        // --- SWITCH WITH STRING (Java 7+) ---
        String fruit = "apple";
        switch (fruit) {
            case "apple":
                System.out.println("Apples are red or green.");
                break;
            case "banana":
                System.out.println("Bananas are yellow.");
                break;
            case "orange":
                System.out.println("Oranges are orange.");
                break;
            default:
                System.out.println("Unknown fruit.");
        }

        // --- SWITCH EXPRESSION (Java 14+) — returns a value ---
        String dayName = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Weekend";
            default -> "Invalid";
        };
        System.out.println("Day name: " + dayName);
    }
}
