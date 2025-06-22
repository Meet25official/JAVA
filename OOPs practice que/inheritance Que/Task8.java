//Scenario 8: Vehicle Rental System
//Implement a vehicle rental system where you have a base class called "Vehicle" and derived classes like "Car," "Motorcycle," and "Truck." Each derived class can have its own rental rates and additional features specific to that type of vehicle.

class Vehicle{
    private String type;
    private double rental;

    public Vehicle(String type , double rental){
        this.type = type;
        this.rental = rental;
    }
    public double getRental(){
        return rental;
    }

    public String getType() {
        return type;
    }
}

class Car extends Vehicle{
    private String brand;

    public Car(String type , String brand , double rental){
        super(type,rental);
        this.brand = brand;
    }

    public void displayCar(){
        System.out.println("The brand of this car is :- "+brand);
        System.out.println("The rental price of this car for one month is :- "+super.getRental());
    }
}

class Motorcycle extends Vehicle{
    private int milage;

    public Motorcycle(String type , int milage , double rental){
        super(type,rental);
        this.milage = milage;
    }

    public void displayMotor(){
        System.out.println("The Milage of this MotorCycle is :- "+milage+" (in Km/L)");
        System.out.println("The rental price of this Motorcycle for one month is :- "+super.getRental());
    }
}

class Truck extends Vehicle{
    private float weightcap;

    public Truck(String type , float weightcap , double rental){
        super(type,rental);
        this.weightcap = weightcap;
    }

    public void displayTruck(){
        System.out.println("The Weigth Capacity of this Truck is :- "+weightcap+" kg");
        System.out.println("The rental price of this Truck for one month is :- "+super.getRental());
    }
}

public class Task8 {
    public static void main(String[] args) {
        Car obj1 = new Car("Car", "Suzuki", 20000.0);
        Motorcycle obj2 = new Motorcycle("Motorcycle", 56, 10000.0);
        Truck obj3 = new Truck("Truck", 1000f, 23000.0);
        obj1.displayCar();
        obj2.displayMotor();
        obj3.displayTruck();
    }   
}