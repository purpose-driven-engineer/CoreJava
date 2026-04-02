public class StringFormatDemo {
    public static void main(String[] args){
        String name = "Alice";
        int age = 25;
        double salary = 75000.50;

        System.out.printf("Name: %s, %nAge: %d, %nSalary: $%.2f%n", name, age, salary);
        // %s = string, %d = integer, %.2f = floating with 2 decimals, %n = new line

        String info = String.format("Employee: %s (Age: %d)", name, age);
        System.out.println(info);

        // .formatted - modern approach
        String message = """
                Hello %s!
                You are %d years old.
                Your salary is $%.2f
                """.formatted(name, age, salary);
        System.out.println(message);

        int num = 40;
        System.out.printf("Decimal: %d%n", num);
        System.out.printf("Padded: %5d%n", num);
        System.out.printf("Zero-nums: %05d%n", num);
        System.out.printf("Hex: %x%n", num);
        System.out.printf("Scientific: %e%n", 1290.34);
    }
}
