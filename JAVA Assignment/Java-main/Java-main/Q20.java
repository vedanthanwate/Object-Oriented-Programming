class Employee {
    String name;
    double salary;

    // constructor using this keyword
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aman", 30000);
        Employee e2 = new Employee("Riya", 40000);

        e1.display();
        e2.display();
    }
}