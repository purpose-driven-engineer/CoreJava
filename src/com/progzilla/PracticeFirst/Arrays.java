/**
 * EXAMPLE 9: Arrays
 *
 * TOPICS COVERED:
 * - Declaring and creating arrays: type[] name = new type[size];
 * - Literal initialization: { value1, value2, ... }
 * - Indexing: array[index] (indices start at 0)
 * - array.length (number of elements, not last index)
 * - Default values (0, 0.0, false, null)
 *
 * Arrays hold a fixed number of elements of the same type.
 */
public class Arrays {

    public static void main(String[] args) {
        // --- CREATING AN ARRAY (size fixed at creation) ---
        int[] numbers = new int[5];  // 5 slots, indices 0..4
        // Default value for int is 0
        System.out.println("Default int array: " + numbers[0] + ", " + numbers[4]);

        // --- ASSIGNING VALUES ---
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        // numbers[5] = 60;  // Runtime error: ArrayIndexOutOfBoundsException!

        // --- LITERAL INITIALIZATION (no need to specify size) ---
        int[] scores = { 85, 92, 78, 95, 88 };
        System.out.println("First score: " + scores[0]);
        System.out.println("Last score: " + scores[scores.length - 1]);

        // --- LENGTH (read-only, not a method—no parentheses) ---
        System.out.println("Length of scores: " + scores.length);

        // --- LOOPING THROUGH AN ARRAY ---
        System.out.println("All scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("  " + i + ": " + scores[i]);
        }

        // --- ARRAY OF STRINGS ---
        String[] names = { "Alice", "Bob", "Charlie" };
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name " + i + ": " + names[i]);
        }

        // --- DEFAULT VALUES ---
        boolean[] flags = new boolean[2];  // default false
        double[] values = new double[2];   // default 0.0
        String[] words = new String[2];    // default null (no object yet)
        System.out.println("flags[0]=" + flags[0] + ", values[0]=" + values[0] + ", words[0]=" + words[0]);
    }
}
