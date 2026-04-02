import java.util.ArrayList;

/**
 * EXAMPLE 14: ArrayList Basics
 *
 * TOPICS COVERED:
 * - Importing java.util.ArrayList
 * - Creating an ArrayList: new ArrayList<>()
 * - add(element), get(index), set(index, element), remove(index)
 * - size() (dynamic length)
 * - Wrapper types: ArrayList holds objects, so we use Integer not int (autoboxing helps)
 *
 * ArrayList is a resizable list—unlike arrays, you can add and remove elements.
 */
public class ArrayListBasics {

    public static void main(String[] args) {
        // ArrayList<Type> — Type is what you want to store (e.g. String, Integer)
        // We use Integer (wrapper) for numbers; Java auto-converts int <-> Integer (autoboxing)
        ArrayList<Integer> numbers = new ArrayList<>();

        // --- ADD: append to the end ---
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("After add: " + numbers);  // [10, 20, 30]

        // --- SIZE: number of elements (like .length for arrays) ---
        System.out.println("Size: " + numbers.size());

        // --- GET: element at index (0-based) ---
        System.out.println("Element at 1: " + numbers.get(1));  // 20

        // --- SET: replace element at index ---
        numbers.set(1, 25);
        System.out.println("After set(1, 25): " + numbers);  // [10, 25, 30]

        // --- REMOVE: by index (returns the removed element) ---
        numbers.remove(0);
        System.out.println("After remove(0): " + numbers);  // [25, 30]

        // --- ARRAYLIST OF STRINGS ---
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Names: " + names);

        // Loop using size() and get(i)
        for (int i = 0; i < names.size(); i++) {
            System.out.println("  " + i + ": " + names.get(i));
        }

        // --- ADD AT INDEX: insert at position ---
        names.add(1, "Eve");  // insert "Eve" at index 1
        System.out.println("After add(1, \"Eve\"): " + names);  // [Alice, Eve, Bob, Charlie]
    }
}
