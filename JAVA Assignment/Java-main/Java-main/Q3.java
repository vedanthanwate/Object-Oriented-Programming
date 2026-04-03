import java.util.Scanner;

class CARRENTAL {
    int    CarId;
    String CarType;
    float  Rent;

    // Get car details from user
    void GetCar(int CarId, String CarType) {
        this.CarId   = CarId;
        this.CarType = CarType;
        this.Rent    = GetRent();
    }

    // Calculate rent based on car type
    float GetRent() {
        switch (CarType.toLowerCase()) {
            case "small car": return 1000;
            case "van":       return 800;
            case "suv":       return 2500;
            default:
                System.out.println("Unknown car type. Rent set to 0.");
                return 0;
        }
    }

    // Display car details
    void ShowCar() {
        System.out.println("---------------------------");
        System.out.println("Car ID   : " + CarId);
        System.out.println("Car Type : " + CarType);
        System.out.println("Rent     : Rs." + Rent);
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cars: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        CARRENTAL[] cars = new CARRENTAL[n];

        // Input details for each car
        for (int i = 0; i < n; i++) {
            cars[i] = new CARRENTAL();

            System.out.println("\nEnter details for Car " + (i + 1) + ":");
            System.out.print("Car ID   : ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Car Type (Small Car / Van / SUV): ");
            String type = sc.nextLine();

            cars[i].GetCar(id, type);
        }

        // Display all cars
        System.out.println("\n===== Car Rental Details =====");
        for (CARRENTAL car : cars) {
            car.ShowCar();
        }

        sc.close();
    }
}
