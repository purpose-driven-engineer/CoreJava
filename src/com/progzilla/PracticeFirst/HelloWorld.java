/**
 * EXAMPLE 1: Hello World
 *
 * TOPICS COVERED:
 * - The main method (entry point of every Java application)
 * - System.out for printing to the console
 * - String literals in double quotes
 * - Semicolons ending statements
 *
 * This is the classic first program. Run it to see output in the terminal.
 */
public class HelloWorld {

    /*
     * The JVM looks for this exact signature to start your program.
     * public = visible everywhere
     * static = belongs to the class, not to an object (no "new" needed)
     * void = this method doesn't return a value
     * String[] args = command-line arguments (optional)
     */
    public static void main(String[] args) {
        // System.out is the "standard output" stream (usually your terminal)
        // println prints the text and then moves to the next line
        System.out.println("Hello, World!");

        // print() does NOT add a newline—next output continues on same line
        System.out.print("Welcome to ");
        System.out.println("Java!");
    }
}
