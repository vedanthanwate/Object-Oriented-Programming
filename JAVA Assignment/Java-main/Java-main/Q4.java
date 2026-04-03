import java.util.Scanner;

class Resort {
    int    RNo;
    String Name;
    double Charges;
    int    Days;

    // Calculate amount based on stay duration and charges
    double Compute() {
        double Amount = Days * Charges;
        if (Amount > 11000) {
            Amount = 1.02 * Amount;  // 2% surcharge applied
        }
        return Amount;
    }

    // Accept room and customer details from user
    void Getinfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room Number   : ");
        RNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name : ");
        Name = sc.nextLine();

        System.out.print("Enter Per Day Charges: ");
        Charges = sc.nextDouble();

        System.out.print("Enter Number of Days : ");
        Days = sc.nextInt();
    }

    // Display all room and billing details
    void DispInfo() {
        double Amount = Compute();

        System.out.println("\n=============================");
        System.out.println("       RESORT BILL DETAILS   ");
        System.out.println("=============================");
        System.out.println("Room Number    : " + RNo);
        System.out.println("Customer Name  : " + Name);
        System.out.println("Per Day Charges: Rs." + Charges);
        System.out.println("Number of Days : " + Days);
        System.out.println("-----------------------------");

        if (Days * Charges > 11000) {
            System.out.println("Note: 2% surcharge applied (Amount > Rs.11000)");
            System.out.println("-----------------------------");
        }

        System.out.printf("Total Amount   : Rs.%.2f%n", Amount);
        System.out.println("=============================");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();

        Resort[] guests = new Resort[n];

        // Input details for each guest
        for (int i = 0; i < n; i++) {
            guests[i] = new Resort();
            System.out.println("\n--- Enter Details for Customer " + (i + 1) + " ---");
            guests[i].Getinfo();
        }

        // Display bill for each guest
        System.out.println("\n======= RESORT BILLING SUMMARY =======");
        for (Resort guest : guests) {
            guest.DispInfo();
        }

        sc.close();
    }
}
