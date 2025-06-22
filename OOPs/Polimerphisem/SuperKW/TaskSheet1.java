//Scenario 1: Car Manufacturing
//In a car manufacturing system, have a base class called "Vehicle" with a method called "manufacture" that handles common manufacturing steps. Implement a derived class called "Car" that overrides the "manufacture" method and uses the super keyword to invoke the base class implementation.

class Vehicle{
    public void manufacture(){
        System.out.println("The vehical manufacture is new system.");
    }
}

class Car extends Vehicle{
    @Override
    public void manufacture(){
        System.out.println("The car manufacture is ready.");
        super.manufacture();
    }
}

public class TaskSheet1 {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.manufacture();
    }
}