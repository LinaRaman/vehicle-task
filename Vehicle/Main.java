package homeworks.Vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter fuel (L) in the fuel tank");
        float fuel = scanner.nextFloat();
        System.out.println("Please enter fuel consumption per 100 km");
        float fuelUsage = scanner.nextFloat();
        System.out.println("Please enter the number of passengers in the car");
        int passengers = scanner.nextInt();
        System.out.println("Is the conditioner on in the car? (true/false)");
        boolean airConditioner = scanner.nextBoolean();

        Vehicle vehicle = new Vehicle(fuel,fuelUsage,passengers);
        Vehicle.Car car = vehicle.new Car(fuel,fuelUsage,passengers,airConditioner);

        if (airConditioner) {
            System.out.printf("Maximum distance is %.2f", car.maxDistance());
        } else {
            System.out.printf("Maximum distance is %.2f", vehicle.maxDistance());
        }
    }
}
