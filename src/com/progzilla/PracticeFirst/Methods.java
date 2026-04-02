/**
 * EXAMPLE 10: Methods
 *
 * TOPICS COVERED:
 * - Defining a method: modifiers, return type, name, parameters, body
 * - Calling a method: name(arguments);
 * - Parameters vs arguments
 * - Return type void (no return value) vs a type (return value)
 * - Method overloading (same name, different parameter lists)
 *
 * Methods group code into reusable pieces and make programs easier to read and maintain.
 */
public class Methods {

    public static void main(String[] args) {
        // Call a method that returns nothing (void)
        sayHello();

        // Call a method that takes one argument
        greet("Alice");

        // Call a method that returns a value—use it in an expression
        int sum = add(10, 20);
        System.out.println("10 + 20 = " + sum);

        double avg = average(70.0, 80.0, 90.0);
        System.out.println("Average of 70, 80, 90 = " + avg);

        // Overloaded method: same name, different parameters
        System.out.println("Max of 5 and 9: " + max(5, 9));
        System.out.println("Max of 2.3 and 4.1: " + max(2.3, 4.1));
    }

    // void = no return value; no parameters
    static void sayHello() {
        System.out.println("Hello!");
    }

    // One parameter: String name (parameter is the variable in the definition)
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Return type int; two parameters
    // "10" and "20" when we call add(10, 20) are the "arguments"
    static int add(int a, int b) {
        return a + b;  // return sends a value back to the caller
    }

    // Return type double; three parameters
    static double average(double x, double y, double z) {
        double sum = x + y + z;
        return sum / 3;
    }

    // Overloading: two methods named "max" but different parameter types
    static int max(int a, int b) {
        return a > b ? a : b;  // ternary: if a>b return a, else return b
    }

    static double max(double a, double b) {
        return a > b ? a : b;
    }
}
