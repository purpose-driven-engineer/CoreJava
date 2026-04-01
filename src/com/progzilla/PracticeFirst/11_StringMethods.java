/**
 * EXAMPLE 11: String Methods
 *
 * TOPICS COVERED:
 * - length(), charAt(index)
 * - substring(beginIndex), substring(begin, end)
 * - equals(), equalsIgnoreCase()
 * - toUpperCase(), toLowerCase(), trim()
 * - indexOf(), contains(), startsWith(), endsWith()
 * - Strings are immutable (methods return new strings, don't change the original)
 *
 * String is a reference type with many helpful methods for text.
 */
public class StringMethods {

    public static void main(String[] args) {
        String text = "  Hello, Java!  ";

        // --- LENGTH AND CHARACTERS ---
        System.out.println("Length: " + text.length());       // 15 (includes spaces)
        System.out.println("Char at 0: " + text.charAt(0));   // space
        System.out.println("Char at 2: " + text.charAt(2));   // 'H'

        // --- SUBSTRING (begin index is inclusive, end index is exclusive) ---
        System.out.println("From index 2: " + text.substring(2));        // "Hello, Java!  "
        System.out.println("From 2 to 7: " + text.substring(2, 7));       // "Hello" (7 not included)

        // --- COMPARISON: always use .equals() for content, not == ---
        String a = "hello";
        String b = "hello";
        String c = "HELLO";
        System.out.println("a.equals(b): " + a.equals(b));           // true
        System.out.println("a == b: " + (a == b));                   // may be true due to literal pooling
        System.out.println("a.equalsIgnoreCase(c): " + a.equalsIgnoreCase(c));  // true

        // --- CASE AND WHITESPACE ---
        System.out.println("toUpperCase: " + text.toUpperCase());
        System.out.println("toLowerCase: " + text.toLowerCase());
        System.out.println("trim (no leading/trailing spaces): '" + text.trim() + "'");

        // --- SEARCHING ---
        String sentence = "The quick brown fox";
        System.out.println("indexOf('q'): " + sentence.indexOf('q'));       // 4
        System.out.println("indexOf(\"brown\"): " + sentence.indexOf("brown"));  // 10
        System.out.println("contains(\"fox\"): " + sentence.contains("fox"));   // true
        System.out.println("startsWith(\"The\"): " + sentence.startsWith("The")); // true
        System.out.println("endsWith(\"fox\"): " + sentence.endsWith("fox"));   // true

        // --- IMMUTABILITY: original string never changes ---
        String s = "abc";
        s.toUpperCase();  // returns "ABC" but we didn't assign it
        System.out.println("s is still: " + s);  // "abc"
        s = s.toUpperCase();  // now we assign the result
        System.out.println("s now: " + s);       // "ABC"
    }
}
