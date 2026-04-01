import java.util.ArrayList;
import java.util.Scanner;

/**
 * PRACTICE PROJECT 4: Console Todo List
 *
 * PRACTICES: ArrayList, Scanner, while loop, switch (or if/else), methods.
 *
 * Menu: (1) Add task, (2) List tasks, (3) Remove task by number, (4) Quit.
 * Store tasks in an ArrayList and let the user manage them.
 */
public class Project04_ConsoleTodoList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        System.out.println("=== Todo List ===\n");

        while (true) {
            System.out.println("1. Add task");
            System.out.println("2. List tasks");
            System.out.println("3. Remove task (by number)");
            System.out.println("4. Quit");
            System.out.print("Choice: ");

            String input = scanner.nextLine().trim();

            switch (input) {
                case "1" -> {
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine().trim();
                    if (!task.isEmpty()) {
                        tasks.add(task);
                        System.out.println("Added.\n");
                    }
                }
                case "2" -> {
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet.\n");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        System.out.println();
                    }
                }
                case "3" -> {
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove.\n");
                    } else {
                        System.out.print("Task number to remove (1-" + tasks.size() + "): ");
                        try {
                            int num = Integer.parseInt(scanner.nextLine().trim());
                            if (num >= 1 && num <= tasks.size()) {
                                tasks.remove(num - 1);
                                System.out.println("Removed.\n");
                            } else {
                                System.out.println("Invalid number.\n");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter a number.\n");
                        }
                    }
                }
                case "4" -> {
                    System.out.println("Bye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Unknown option.\n");
            }
        }
    }
}
