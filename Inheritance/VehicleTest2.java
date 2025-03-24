// Vehicle class
class Vehicle {
    // Properties
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;

    // Constructor
    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    // Method to calculate fuel efficiency
    public double calculateFuelEfficiency() {
        // Default implementation (can be overridden by subclasses)
        return 0.0;
    }

    // Method to calculate distance traveled
    public double calculateDistance(double fuelEfficiency, double fuelConsumed) {
        return fuelEfficiency * fuelConsumed;
    }

    // Method to get maximum speed
    public int getMaxSpeed() {
        // Default implementation (can be overridden by subclasses)
        return 0;
    }
}

// Truck subclass extending Vehicle
class Truck extends Vehicle {
    // Additional properties for Truck
    private double cargoCapacity;

    // Constructor
    public Truck(String make, String model, int year, String fuelType, double cargoCapacity) {
        super(make, model, year, fuelType);
        this.cargoCapacity = cargoCapacity;
    }

    // Override calculateFuelEfficiency method for Truck
    @Override
    public double calculateFuelEfficiency() {
        // Implementation specific to trucks
        // Example: Trucks may have lower fuel efficiency due to their size and load capacity
        return 8.5; // miles per gallon
    }

    // Override getMaxSpeed method for Truck
    @Override
    public int getMaxSpeed() {
        // Example: Maximum speed for a truck is 70 mph
        return 70;
    }
}

// Car subclass extending Vehicle
class Car extends Vehicle {
    // Additional properties for Car
    private boolean isConvertible;

    // Constructor
    public Car(String make, String model, int year, String fuelType, boolean isConvertible) {
        super(make, model, year, fuelType);
        this.isConvertible = isConvertible;
    }

    // Override calculateFuelEfficiency method for Car
    @Override
    public double calculateFuelEfficiency() {
        // Implementation specific to cars
        // Example: Cars are generally more fuel-efficient
        return 25.0; // miles per gallon
    }

    // Override getMaxSpeed method for Car
    @Override
    public int getMaxSpeed() {
        // Example: Maximum speed for a car is 120 mph
        return 120;
    }
}

// Motorcycle subclass extending Vehicle
class Motorcycle extends Vehicle {
    // Additional properties for Motorcycle
    private boolean hasFairing;

    // Constructor
    public Motorcycle(String make, String model, int year, String fuelType, boolean hasFairing) {
        super(make, model, year, fuelType);
        this.hasFairing = hasFairing;
    }

    // Override calculateFuelEfficiency method for Motorcycle
    @Override
    public double calculateFuelEfficiency() {
        // Implementation specific to motorcycles
        // Example: Motorcycles may have high fuel efficiency
        return 50.0; // miles per gallon
    }

    // Override getMaxSpeed method for Motorcycle
    @Override
    public int getMaxSpeed() {
        // Example: Maximum speed for a motorcycle is 150 mph
        return 150;
    }
}

public class VehicleTest2 {
    public static void main(String[] args) {
        // Create instances of different vehicles
        Truck myTruck = new Truck("Ford", "F-150", 2022, "Gasoline", 2000);
        Car myCar = new Car("Toyota", "Camry", 2022, "Gasoline", false);
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022, "Gasoline", true);

        // Display information and perform calculations for each vehicle
        displayVehicleInfo(myTruck);
        displayVehicleInfo(myCar);
        displayVehicleInfo(myMotorcycle);
    }

    // Method to display information and perform calculations for a vehicle
    public static void displayVehicleInfo(Vehicle vehicle) {
        System.out.println("Vehicle Information:");
        System.out.println("Make: " + vehicle.make);
        System.out.println("Model: " + vehicle.model);
        System.out.println("Year: " + vehicle.year);
        System.out.println("Fuel Type: " + vehicle.fuelType);

        double fuelEfficiency = vehicle.calculateFuelEfficiency();
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " miles per gallon");

        double fuelConsumed = 10.0; // Example fuel consumption
        double distanceTraveled = vehicle.calculateDistance(fuelEfficiency, fuelConsumed);
        System.out.println("Distance Traveled: " + distanceTraveled + " miles");

        int maxSpeed = vehicle.getMaxSpeed();
        System.out.println("Maximum Speed: " + maxSpeed + " mph");

        System.out.println(); // Add a newline for better readability
    }
}
