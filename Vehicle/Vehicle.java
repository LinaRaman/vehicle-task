package homeworks.Vehicle;
public class Vehicle {
    private float fuel;
    private float fuelUsage;
    private int passengers;

    public Vehicle(float fuel, float fuelUsage, int passengers){
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public double maxDistance(){
        return (fuel*100) / (fuelUsage + (fuelUsage * (passengers*0.05)));
    }

    class Car extends Vehicle {

        boolean airConditioner;

        public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner){
            super(fuel, fuelUsage, passengers);
            this.airConditioner = airConditioner;
        }
        @Override
        public double maxDistance() {
            double fuelUsageWithPassengers = fuelUsage + (fuelUsage * (passengers * 0.05));
            return (fuel*100) / (fuelUsageWithPassengers + (fuelUsageWithPassengers*0.1));
        }
    }
}
