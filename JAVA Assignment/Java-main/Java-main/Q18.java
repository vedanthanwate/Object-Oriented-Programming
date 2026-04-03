class Bank {
    final double interestRate = 5.0; // fixed interest rate

    // method to calculate interest
    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank b = new Bank();

        double i1 = b.calculateInterest(10000);
        double i2 = b.calculateInterest(20000);

        System.out.println("Interest for Customer 1: " + i1);
        System.out.println("Interest for Customer 2: " + i2);
    }
}