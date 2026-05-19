/**
 * EXAMPLE 8: while and do-while Loops
 *
 * TOPICS COVERED:
 * - while (condition) { ... } — check condition before each iteration
 * - do { ... } while (condition); — body runs at least once, then check
 * - When to use while vs for (unknown iterations vs known count)
 *
 * Use while when you don't know in advance how many times to repeat (e.g. "until user quits").
 */
public class WhileLoop {

    public static void main(String[] args) {

        // --- WHILE: repeat while condition is true ---
        int count = 0;
        while (count < 5) {
            System.out.println("While count: " + count);
            count++;  // Must update counter or you get an infinite loop!
        }

        // --- DO-WHILE: body runs at least once, then condition is checked ---
        int value = 10;
        do {
            System.out.println("Do-while value: " + value);
            value++;
        } while (value < 12);

        // Even when condition is false from the start, body runs once:
        int x = 100;
        do {
            System.out.println("This runs once even though x is already >= 5: " + x);
        } while (x < 5);

        // --- SIMULATING A SIMPLE MENU (concept) ---
        // In a real program you'd read user input; here we just run a few "choices"
        int choice = 1;
        while (choice != 0) {
            System.out.println("Choice is " + choice + ". Next we'd show menu and read input.");
            choice++;  // Simulate user eventually choosing 0
            if (choice > 2) choice = 0;
        }
        System.out.println("Exited loop (choice became 0).");
    }
}
