import java.util.Scanner;

class Employee {
    int    empno;
    String ename;
    float  basic, hra, da, netpay;

    // Calculate and return net pay
    float Calculate() {
        return basic + hra + da;
    }

    // Accept employee details and calculate net pay
    void havedata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Number : ");
        empno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name   : ");
        ename = sc.nextLine();

        System.out.print("Enter Basic Salary    : ");
        basic = sc.nextFloat();

        System.out.print("Enter HRA             : ");
        hra = sc.nextFloat();

        System.out.print("Enter DA              : ");
        da = sc.nextFloat();

        netpay = Calculate();  // Auto-calculate net pay
    }

    // Display all employee details
    void dispdata() {
        System.out.println("\n================================");
        System.out.println("       EMPLOYEE PAY DETAILS     ");
        System.out.println("================================");
        System.out.println("Employee No   : " + empno);
        System.out.println("Employee Name : " + ename);
        System.out.println("--------------------------------");
        System.out.printf("Basic Salary  : Rs. %10.2f%n", basic);
        System.out.printf("HRA           : Rs. %10.2f%n", hra);
        System.out.printf("DA            : Rs. %10.2f%n", da);
        System.out.println("--------------------------------");
        System.out.printf("Net Pay       : Rs. %10.2f%n", netpay);
        System.out.println("================================");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        // Input details for each employee
        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            System.out.println("\n--- Enter Details for Employee " + (i + 1) + " ---");
            emp[i].havedata();
        }

        // Display payslip for each employee
        System.out.println("\n======= EMPLOYEE PAYROLL SUMMARY =======");
        for (Employee e : emp) {
            e.dispdata();
        }

        sc.close();
    }
}
