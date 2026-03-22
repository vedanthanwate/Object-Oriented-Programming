class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Person_detail {
    public static void main(String[] args) {
        // Creating two Person objects
        Person p1 = new Person("Vedant", 20);
        Person p2 = new Person("Rahul", 22);

        // Printing their details
        p1.display();
        p2.display();
    }
}