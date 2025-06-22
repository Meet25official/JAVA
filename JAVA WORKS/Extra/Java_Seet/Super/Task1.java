// Scenario 1: Car Manufacturing
// In a car manufacturing system, have a base class called "Vehicle" with a method called "manufacture" that handles common manufacturing steps. Implement a derived class called "Car" that overrides the "manufacture" method and uses the super keyword to invoke the base class implementation.

class Vehicle {
    public void manufacture() {
        System.out.println("Performing common manufacturing steps:");
        System.out.println("  - Assembling chassis");
        System.out.println("  - Installing engine");
        System.out.println("  - Adding wheels");
    }
}
class Car extends Vehicle {
    public void manufacture() {
        super.manufacture(); 
        System.out.println("  - Installing car-specific features:");
        System.out.println("    - Adding seats");
        System.out.println("    - Installing infotainment system");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.manufacture();
    }
}

