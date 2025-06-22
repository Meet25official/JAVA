// Scenario 1: Vehicle Rental Management System
// In a vehicle rental management system, create a base class called "Vehicle" with a method called "rent" that performs the rental process. Implement derived classes like "Car" and "Motorcycle" that override the "rent" method with their specific rental processes.

class Vehicle {
    public void rent() {
        System.out.println("Processing vehicle rental...");
    }

    public void displayInfo() {
        System.out.println("Vehicle type: " + this.getClass().getSimpleName());
    }
}

class Car extends Vehicle {

    @Override
    public void rent() {
        System.out.println("Processing car rental...");
    }

    public void displayCarInfo() {
        System.out.println("This is a car.");
    }
}

class Motorcycle extends Vehicle {

    @Override
    public void rent() {
        System.out.println("Processing motorcycle rental...");
    }

    public void displayMotorcycleInfo() {
        System.out.println("This is a motorcycle.");
    }
}
public class Task3 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();

        myCar.displayInfo();
        myMotorcycle.displayInfo();

        myCar.rent();
        myMotorcycle.rent();
    }
}
