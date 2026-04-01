import java.util.Scanner;

/**
 * PRACTICE PROJECT 1: Temperature Converter
 *
 * PRACTICES: Scanner, variables (double), if/else, methods, String comparison.
 *
 * Build a program that asks the user for a temperature and unit (C or F),
 * then converts and displays the result. Try using a method for the conversion.
 */
public class Project01_TemperatureConverter {

    /**
     * Converts Celsius to Fahrenheit. Formula: F = C * 9/5 + 32
     */
    static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }

    /**
     * Converts Fahrenheit to Celsius. Formula: C = (F - 32) * 5/9
     */
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");
        System.out.print("Enter temperature value: ");
        double temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter unit (C for Celsius, F for Fahrenheit): ");
        String unit = scanner.nextLine().trim().toUpperCase();

        if (unit.equals("C")) {
            double result = celsiusToFahrenheit(temp);
            System.out.printf("%.2f °C = %.2f °F%n", temp, result);
        } else if (unit.equals("F")) {
            double result = fahrenheitToCelsius(temp);
            System.out.printf("%.2f °F = %.2f °C%n", temp, result);
        } else {
            System.out.println("Unknown unit. Please use C or F.");
        }

        scanner.close();
    }
}
