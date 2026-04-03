class Calculator {

    // Method with 2 integers
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with 2 double values
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Calling different overloaded methods
        System.out.println("Sum of 2 integers: " + calc.add(5, 10));
        System.out.println("Sum of 3 integers: " + calc.add(1, 2, 3));
        System.out.println("Sum of 2 doubles: " + calc.add(2.5, 3.5));
    }
}