// Base class
class Staff {
    void work() {
        System.out.println("Staff performs general duties.");
    }
}

// Subclass Doctor
class Doctor extends Staff {
    @Override
    void work() {
        System.out.println("Doctor diagnoses patients and prescribes treatment.");
    }
}

// Subclass Nurse
class Nurse extends Staff {
    @Override
    void work() {
        System.out.println("Nurse takes care of patients and assists doctors.");
    }
}

// Subclass Receptionist
class Receptionist extends Staff {
    @Override
    void work() {
        System.out.println("Receptionist manages appointments and patient records.");
    }
}

// Main class
public class HospitalDemo {
    public static void main(String[] args) {
        Staff s;

        s = new Doctor();
        s.work();

        s = new Nurse();
        s.work();

        s = new Receptionist();
        s.work();
    }
}