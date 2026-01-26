//Q:Write a Java program to implement inheritance for a Vehicle system:Vehicle (Base): company, price.
//LightMotorVehicle (Derived): Adds mileage.HeavyMotorVehicle (Derived): Adds capacity_in_tons.
//Requirements:Use parameterized constructors and the super keyword.
//Override the display() method to show details.Accept $n$ objects from the user, determine their 
//type (Light/Heavy), and display all information.
import java.util.Scanner;

class Vehicle {
    String company;
    double price;

    public Vehicle(String company, double price) {
        this.company = company;
        this.price = price;
    }

    public void display() {
        System.out.println("Company: " + company);
        System.out.println("Price: " + price);
    }
}

class LightMotorVehicle extends Vehicle {
    double mileage;

    public LightMotorVehicle(String company, double price, double mileage) {
        super(company, price);
        this.mileage = mileage;
    }

    public void display() {
        super.display();
        System.out.println("Mileage: " + mileage);
    }
}

class HeavyMotorVehicle extends Vehicle {
    double capacity_in_tons;

    public HeavyMotorVehicle(String company, double price, double capacity_in_tons) {
        super(company, price);
        this.capacity_in_tons = capacity_in_tons;
    }

    public void display() {
        super.display();
        System.out.println("Capacity in tons: " + capacity_in_tons);
    }
}

public class Slip29_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();
        sc.nextLine();

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nVehicle " + (i + 1));
            System.out.print("Enter type (light/heavy): ");
            String type = sc.nextLine().toLowerCase();

            System.out.print("Enter company: ");
            String company = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            if (type.equals("light")) {
                System.out.print("Enter mileage: ");
                double mileage = sc.nextDouble();
                vehicles[i] = new LightMotorVehicle(company, price, mileage);
            } else if (type.equals("heavy")) {
                System.out.print("Enter capacity in tons: ");
                double capacity = sc.nextDouble();
                vehicles[i] = new HeavyMotorVehicle(company, price, capacity);
            }
            sc.nextLine();
        }

        System.out.println("\n--- Vehicle Details ---");
        for (Vehicle v : vehicles) {
            v.display();
            System.out.println();
        }
    }
}

