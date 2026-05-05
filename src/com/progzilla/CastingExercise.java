public class CastingExercise {
    public static void main(String[] args){

        /*
            2 types of casting
            1. Widening (Automatic) Casting - cast from small datatype to large datatype e.g. byte -> short, etc.
            2. Narrowing (Manual) Casting - cast from large to small datatype - requires to be explicit else causes data loss

         */

        int intData = 85;
        double doubleData = intData; // automatic casting
        System.out.println("Int: " + intData);
        System.out.println("Double: " + doubleData);

        // manual casting
        double price = 99.99;
        int dollars = (int) price; // data loss - decimal part
        System.out.println("Price: " + price);
        System.out.println("Dollars: " + dollars);

        // data loss - overflow
        long bigNumber = 10000000000000L;
        int smallNumber = (int) bigNumber;
        System.out.println("Long: " + bigNumber);
        System.out.println("Small: " + smallNumber); // wrong output

        // using casting calculations
        int a = 5;
        int b = 2;
        double result1 = a / b;
        double result2 = (double) a / b;
        System.out.println("Casting: "+ result1);
        System.out.println("No Casting: "+ result2);

        char letter = 'A';
        int asciiValue = letter;
        System.out.println("ASCII of 'A': " + asciiValue);

        // manual casting
        int num = 66;
        char character = (char) num;
        System.out.println("Character: " + character);

        // casting String to Int
        String numberString = "123";
        int parsedString = Integer.parseInt(numberString);
        System.out.println(parsedString + 10);

        double parseDouble = Double.parseDouble("44.56");
        System.out.println(parseDouble);


    }
}
