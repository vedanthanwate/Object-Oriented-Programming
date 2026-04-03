// Interface
interface Bank {
    double getInterestRate();
}

// SBI class
class SBI implements Bank {
    public double getInterestRate() {
        return 6.5;
    }
}

// HDFC class
class HDFC implements Bank {
    public double getInterestRate() {
        return 7.2;
    }
}

// ICICI class
class ICICI implements Bank {
    public double getInterestRate() {
        return 6.9;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + b3.getInterestRate() + "%");
    }
}