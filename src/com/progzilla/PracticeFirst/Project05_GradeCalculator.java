import java.util.ArrayList;
import java.util.Scanner;

/**
 * PRACTICE PROJECT 5: Grade Calculator
 *
 * PRACTICES: ArrayList (or array), Scanner, for loop, methods, if/else.
 *
 * Ask the user how many grades they have, then read each grade. Compute and
 * display the average and a letter grade (e.g. A: 90+, B: 80+, ...).
 */
public class Project05_GradeCalculator {

    /**
     * Returns letter grade based on numeric average.
     */
    static String letterGrade(double average) {
        if (average >= 90) return "A";
        if (average >= 80) return "B";
        if (average >= 70) return "C";
        if (average >= 60) return "D";
        return "F";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("=== Grade Calculator ===\n");
        System.out.print("How many grades? ");
        int count;
        try {
            count = Integer.parseInt(scanner.nextLine().trim());
            if (count <= 0) {
                System.out.println("Please enter a positive number.");
                scanner.close();
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
            scanner.close();
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            try {
                double g = Double.parseDouble(scanner.nextLine().trim());
                if (g >= 0 && g <= 100) {
                    grades.add(g);
                } else {
                    System.out.println("Enter a value between 0 and 100.");
                    i--;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
                i--;
            }
        }

        double sum = 0;
        for (Double g : grades) {
            sum += g;
        }
        double average = sum / grades.size();
        String letter = letterGrade(average);

        System.out.println("\n=== Results ===");
        System.out.println("Average: " + String.format("%.2f", average));
        System.out.println("Letter grade: " + letter);

        scanner.close();
    }
}
