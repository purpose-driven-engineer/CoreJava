/**
 * EXAMPLE 12: Math Class
 *
 * TOPICS COVERED:
 * - Math.random() — random double in [0.0, 1.0)
 * - Math.pow(base, exp), Math.sqrt(x)
 * - Math.round, Math.floor, Math.ceil
 * - Math.min, Math.max, Math.abs
 * - Math class methods are static (call as Math.methodName())
 *
 * Math provides common mathematical operations and constants.
 */
public class MathClass {

    public static void main(String[] args) {
        // --- RANDOM: value in [0.0, 1.0) — 1.0 is never returned ---
        double r = Math.random();
        System.out.println("Random [0, 1): " + r);

        // Random integer 1 to 6 (dice): scale and shift, then cast to int
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("Dice roll: " + dice);

        // --- POW AND SQRT ---
        System.out.println("2^10 = " + Math.pow(2, 10));   // 1024.0
        System.out.println("sqrt(16) = " + Math.sqrt(16)); // 4.0

        // --- ROUNDING ---
        double x = 3.7;
        System.out.println("round(3.7) = " + Math.round(x));   // 4 (long)
        System.out.println("floor(3.7) = " + Math.floor(x));   // 3.0 (down)
        System.out.println("ceil(3.2) = " + Math.ceil(3.2));   // 4.0 (up)

        // --- MIN, MAX, ABS ---
        System.out.println("min(5, 9) = " + Math.min(5, 9));
        System.out.println("max(5, 9) = " + Math.max(5, 9));
        System.out.println("abs(-7) = " + Math.abs(-7));
        System.out.println("abs(7) = " + Math.abs(7));

        // --- CONSTANTS ---
        System.out.println("PI = " + Math.PI);
        System.out.println("E = " + Math.E);
    }
}
