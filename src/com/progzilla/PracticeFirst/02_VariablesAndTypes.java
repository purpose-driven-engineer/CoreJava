/**
 * EXAMPLE 2: Variables and Data Types
 *
 * TOPICS COVERED:
 * - Declaring variables (type name = value;)
 * - Primitive types: int, double, boolean, char
 * - Reference type: String
 * - Naming conventions (camelCase for variables)
 *
 * Variables hold data. The type tells the compiler what kind of data and how much space.
 */
public class VariablesAndTypes {

    public static void main(String[] args) {
        // --- INTEGER (whole numbers, no decimals) ---
        int age = 25;
        int year = 2025;
        // int has a limited range (about -2 billion to +2 billion)

        // --- DOUBLE (decimal numbers, "floating point") ---
        double price = 19.99;
        double temperature = -3.5;
        // Use double when you need fractions (e.g. money, measurements)

        // --- BOOLEAN (true or false only) ---
        boolean isStudent = true;
        boolean hasPassed = false;
        // Great for conditions and flags

        // --- CHAR (single character, single quotes) ---
        char grade = 'A';
        char symbol = '%';
        // Note: char uses single quotes; String uses double quotes

        // --- STRING (sequence of characters, reference type) ---
        String name = "Alice";
        String greeting = "Hello, " + name;  // String concatenation with +

        // --- PRINTING VARIABLES ---
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Is student? " + isStudent);
        System.out.println("Grade: " + grade);
        System.out.println(greeting);

        // --- FINAL (constant—value cannot change after first assignment) ---
        final double PI = 3.14159;
        // PI = 3.14;  // This would cause a compiler error!
        System.out.println("PI is approximately: " + PI);
    }
}
