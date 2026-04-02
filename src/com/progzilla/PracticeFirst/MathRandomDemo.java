import java.util.Random;

public class MathRandomDemo {
    public static void main(String[] args){

        int maxNumber = Math.max(10,20);
        int minNumber = Math.min(10, 20);
        double absoluteNumber = Math.abs(-15.45);

        System.out.println("Max: " + maxNumber);
        System.out.println("Min: " + minNumber);
        System.out.println("Absolute: " + absoluteNumber);

        int numberPower = (int)Math.pow(2,3);
        int SquareRootOfNumber = (int)(Math.sqrt(16));
        int CubeRootOfNumber = Math.toIntExact(Math.round(Math.cbrt(27)));

        System.out.println("Power: " + numberPower); // 2^3 - 2 to the power of 3
        System.out.println("Square Root: " + SquareRootOfNumber);
        System.out.println("Cube root: " + CubeRootOfNumber);

        double value = 7.2;
        double roundNumber = Math.round(value);
        double floorNumber = Math.floor(value);
        double ceilNumber = Math.ceil(value);

        System.out.println("Round Number: " + roundNumber);
        System.out.println("Floor Number: " + floorNumber);
        System.out.println("Ceil: " + ceilNumber);

        double sinToRadians = Math.sin(Math.toRadians(value));
        double cosToRadians = Math.cos(Math.toRadians(value));
        System.out.println(sinToRadians);
        System.out.println(cosToRadians);

        System.out.println("PI: " + Math.PI);
        System.out.println("E: " + Math.E);

        double rand = Math.random();
        System.out.println("Random 0-1: " + rand);

        int randomInt = (int) (Math.random() * 100);
        System.out.println("Random Number 1-99: " +randomInt);

        int dice = (int) (Math.random() * 10) + 1;
        System.out.println("Random Number 1-10: " + dice);

        int min = 50;
        int max = 100;
        int randomRangeNumber = (int) (Math.random() * (max -min +1)) + min;
        System.out.println("Random Range Numbers: " + randomRangeNumber);

        Random random = new Random();

        System.out.println("Random Integer: " + random.nextInt());
        System.out.println("Random 0-99: " + random.nextInt(100));
        System.out.println("Random 0-100" + random.nextInt(100) + 1);

        System.out.println("Random Double: " + random.nextDouble());
        System.out.println("Random boolean: " + random.nextBoolean());

        System.out.println("Guassian: " + random.nextGaussian());

        // Some examples

        //coin flipping
        String coinFlip = Math.random() < 0.5 ? "Heads" : "Tails";
        System.out.println("Coin Flip: " + coinFlip);

        //dice rolling
        int die1 = (int) (Math.random() * 6) + 1;
        int die2 = (int) (Math.random() * 6) + 1;
        System.out.println("Dice Roll: " + die1 + "+" + die2);


    }
}
