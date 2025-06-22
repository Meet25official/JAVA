//Scenario 1: Vehicle Hierarchy
//Consider a vehicle hierarchy where you have a base class called "Vehicle" and derived classes like "Car," "Motorcycle," and "Truck." Define common attributes and behaviors in the base class and specific attributes and behaviors in the derived classes.

class Vehical{
    private String types;
    private int numofwheel;

    public Vehical(String types , int numofwheel){
        this.types = types;
        this.numofwheel = numofwheel;
    }

    public void displayV(){
        System.out.println("The type of this Vehical is:- "+types);
        System.out.println("The number of wheel to this Vehical is:- "+numofwheel);
    }
}

class Car extends Vehical{
    private int numofseats;

    public Car(String t , int n, int numofseats){
        super(t, n);
        this.numofseats = numofseats;
    }

    public void displayCar(){
        super.displayV();
        System.out.println("The total seats of the car is :- "+numofseats);
    }
}

class Motorcycle extends Vehical{
    private int milage;

    public Motorcycle(String t , int n, int milage){
        super(t, n);
        this.milage = milage;
    }

    public void displayMotor(){
        super.displayV();
        System.out.println("The milage of the motorcycle is :- "+milage+" km/l");
    }
}

class Truck extends Vehical{
    private int weightcap;

    public Truck(String t , int n, int weightcap){
        super(t, n);
        this.weightcap = weightcap;
    }

    public void displayTruck(){
        super.displayV();
        System.out.println("The weghting capacity of the car is :- "+weightcap+" tons");
    }
}


public class Task1 {
    public static void main(String[] args) {
        Car obj1 = new Car("car", 4, 7);
        Motorcycle obj2 = new Motorcycle("MotorCycle", 2, 60);
        Truck obj3 = new Truck("Truck", 8, 500);
        obj1.displayCar();
        obj2.displayMotor();
        obj3.displayTruck();
    }
}
