// Scenario 2: Vehicle Manufacturing
// Design an abstract class called "Vehicle" with abstract methods like "assemble" and "paint." Implement derived classes like "Car" and "Motorcycle" that provide specific implementations for these abstract methods.

abstract class Vehicle {
    abstract void assemble();
    abstract void paint();
}

class Car extends Vehicle {
    public void assemble(){
        System.out.println("Assembling Car....");
    }
    public void paint(){
        System.out.println("Painting Car....");
    }
}

class Motorcycle extends Vehicle {
    public void assemble(){
        System.out.println("Assembling Motorcycle....");
    }
    public void paint(){
        System.out.println("Painting Motorcycle....");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.assemble();
        car.paint();

        motorcycle.assemble();
        motorcycle.paint();
    }    
}
