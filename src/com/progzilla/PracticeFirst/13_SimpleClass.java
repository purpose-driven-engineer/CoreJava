/**
 * EXAMPLE 13: A Simple Class (OOP basics)
 *
 * TOPICS COVERED:
 * - Fields (instance variables) — data each object holds
 * - Constructor — special method that runs when you do "new ClassName(...)"
 * - Instance methods — behavior that uses the object's fields
 * - new Keyword — creates an object
 * - Reference: variable holds a "reference" to the object, not the object itself
 *
 * Classes are blueprints; objects are instances created from that blueprint.
 */
public class SimpleClass {

    // --- FIELDS (each Rectangle object has its own width and height) ---
    private double width;
    private double height;

    // --- CONSTRUCTOR: same name as class, no return type ---
    // Runs when we write: new SimpleClass(5.0, 3.0)
    public SimpleClass(double width, double height) {
        this.width = width;   // "this" refers to the current object
        this.height = height; // We use "this" when parameter name matches field name
    }

    // --- INSTANCE METHODS: called on an object (e.g. rect.getArea()) ---
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void scale(double factor) {
        width *= factor;
        height *= factor;
    }

    // --- MAIN: we run the program from here and create objects ---
    public static void main(String[] args) {
        // Create two different "Rectangle" objects
        SimpleClass rect1 = new SimpleClass(5.0, 3.0);
        SimpleClass rect2 = new SimpleClass(10.0, 2.0);

        // Call methods on each object
        System.out.println("Rect1 area: " + rect1.getArea());       // 15.0
        System.out.println("Rect2 area: " + rect2.getArea());       // 20.0
        System.out.println("Rect1 perimeter: " + rect1.getPerimeter());

        rect1.scale(2.0);  // double rect1's dimensions
        System.out.println("After scale(2), Rect1 area: " + rect1.getArea());  // 60.0
    }
}
