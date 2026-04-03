// Employee class
class Employee {
    String name;
    int id;

    // static variable
    static int employeeCount = 0;

    // constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++; // increment count whenever object is created
    }

    // static method to display total employees
    static void displayCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

// Main class
public class CompanyDemo {
    public static void main(String[] args) {

        // creating objects
        Employee e1 = new Employee("Aman", 101);
        Employee e2 = new Employee("Riya", 102);
        Employee e3 = new Employee("Rahul", 103);

        // displaying total count
        Employee.displayCount();
    }
}