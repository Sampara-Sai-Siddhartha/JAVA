// Vehicle class
class Vehicle {
    // Method to drive
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Car subclass extending Vehicle
class Car extends Vehicle {
    // Override drive method to repair a car
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        // Create an instance of Vehicle
        Vehicle myVehicle = new Vehicle();

        // Call drive method of Vehicle
        System.out.println("Calling drive method of Vehicle:");
        myVehicle.drive();

        // Create an instance of Car
        Car myCar = new Car();

        // Call drive method of Car (which overrides Vehicle's drive)
        System.out.println("\nCalling drive method of Car:");
        myCar.drive();
    }
}
