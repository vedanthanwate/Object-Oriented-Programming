class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.display();
        c.calculateArea();

        r.display();
        r.calculateArea();
    }
}