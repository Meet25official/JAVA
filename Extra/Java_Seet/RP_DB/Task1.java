// Scenario 1: Vehicle Rental System
// In a vehicle rental system, create a base class called "Vehicle" with a method called "rent" that performs the rental process. Implement derived classes like "Car" and "Motorcycle" that override the "rent" method with their specific rental processes.

class Vehicle {
    public void rent() {
        System.out.println("Renting a vehicle...");
    }
}
class Car extends Vehicle {
    public void rent() {
        System.out.println("Renting a car...");
        System.out.println("Processing car rental requirements...");
        System.out.println("Car rented successfully!");
    }
}
class Motorcycle extends Vehicle {
    public void rent() {
        System.out.println("Renting a motorcycle...");
        System.out.println("Processing motorcycle rental requirements...");
        System.out.println("Motorcycle rented successfully!");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.rent();
        motorcycle.rent();
    }
}
