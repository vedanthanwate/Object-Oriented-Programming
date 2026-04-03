// Abstract class
abstract class Shape {
    
    // Abstract method
    abstract double calculate_area();

    // Concrete method
    void display_info() {
        System.out.println("This is a Shape.");
    }
}

// Circle subclass
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    double calculate_area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    @Override
    double calculate_area() {
        return length * breadth;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

 
        // Shape s = new Shape();

        // ✔ Creating subclass objects
        Shape c = new Circle(3);
        Shape r = new Rectangle(4, 5);

        // Calling methods
        c.display_info();
        System.out.println("Circle Area: " + c.calculate_area());

        r.display_info();
        System.out.println("Rectangle Area: " + r.calculate_area());
    }
}