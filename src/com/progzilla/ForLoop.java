/**
 * EXAMPLE 7: for Loops
 *
 * TOPICS COVERED:
 * - for (init; condition; update) { ... }
 * - Loop counter (e.g. i from 0 to n-1)
 * - Nested loops (loop inside a loop)
 * - break (exit loop early) and continue (skip to next iteration)
 *
 * Loops repeat a block of code. for is ideal when you know how many times to repeat.
 */
public class ForLoop {

    public static void main(String[] args) {
        // --- BASIC FOR LOOP ---
        // Structure: for (initialization; condition; update) { body }
        // 1. Run initialization once (int i = 0)
        // 2. Check condition (i < 5); if false, exit loop
        // 3. Run body
        // 4. Run update (i++), then go back to step 2
        System.out.println("Counting 0 to 4:");
        for (int i = 0; i < 5; i++) {
            System.out.println("  i = " + i);
        }

        // --- COUNTING DOWN ---
        System.out.println("Counting down 5 to 1:");
        for (int j = 5; j >= 1; j--) {
            System.out.println("  j = " + j);
        }

        // --- STEP BY 2 ---
        System.out.println("Even numbers 0 to 8:");
        for (int k = 0; k <= 8; k += 2) {
            System.out.print(k + " ");
        }
        System.out.println();

        // --- ITERATING OVER AN ARRAY (preview) ---
        int[] numbers = { 10, 20, 30, 40, 50 };
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("  index " + i + " -> " + numbers[i]);
        }

        // --- BREAK: exit the loop immediately ---
        System.out.println("Stop at 3:");
        for (int i = 0; i < 10; i++) {
            if (i == 3) break;
            System.out.print(i + " ");
        }
        System.out.println();

        // --- CONTINUE: skip rest of iteration, go to next ---
        System.out.println("Skip 3:");
        for (int i = 0; i < 6; i++) {
            if (i == 3) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        // --- NESTED LOOP (e.g. rows and columns) ---
        System.out.println("3x3 grid (row, col):");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("(" + row + "," + col + ") ");
            }
            System.out.println();
        }
    }
}
