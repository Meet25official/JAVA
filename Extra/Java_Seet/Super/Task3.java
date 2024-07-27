// Scenario 1: Vehicle Manufacturing
// In a vehicle manufacturing system, have a base class called "Vehicle" with a method called "manufacture" that handles common manufacturing steps. Implement a derived class called "Car" that overrides the "manufacture" method and uses the super keyword to invoke the base class implementation.

class Vehicle {
    public void manufacture() {
        System.out.println("Manufacturing process started.");
        assembleParts();
        installEngine();
        paintVehicle();
        System.out.println("Manufacturing process completed.");
    }

    protected void assembleParts() {
        System.out.println("Assembling vehicle parts.");
    }

    protected void installEngine() {
        System.out.println("Installing engine.");
    }

    protected void paintVehicle() {
        System.out.println("Painting vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Starting car manufacturing process.");
        super.manufacture(); 
        addCarSpecificFeatures();
        System.out.println("Car manufacturing process completed.");
    }

    private void addCarSpecificFeatures() {
        System.out.println("Adding car-specific features.");
    }
}
public class Task3 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.manufacture();
    }
}
