// Scenario 1: Vehicle Hierarchy
// Consider a vehicle hierarchy where you have a base class called "Vehicle" and derived classes like "Car," "Motorcycle," and "Truck." Define common attributes and behaviors in the base class and specific attributes and behaviors in the derived classes.


// Define the Vehicle class
class Vehicle {
    // Constructor for Vehicle class
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Fields of Vehicle class
    private String make;
    private String model;
    private int year;

    // Getters for Vehicle class
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, String color) {
        super(make, model, year);
        this.color = color;
    }

    private String color;

    public String getColor() {
        return color;
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String color, int cc) {
        super(make, model, year);
        this.color = color;
        this.cc = cc;
    }

    private String color;
    private int cc;

    public String getColor() {
        return color;
    }

    public int getCc() {
        return cc;
    }
}

class Truck extends Vehicle {
    public Truck(String make, String model, int year, String color, double bedLength) {
        super(make, model, year);
        this.color = color;
        this.bedLength = bedLength;
    }

    private String color;
    private double bedLength;

    public String getColor() {
        return color;
    }

    public double getBedLength() {
        return bedLength;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", 2020, "Red");
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR1000RR", 2020, "Black", 1000);
        Truck truck = new Truck("Ford", "F-150", 2020, "Blue", 6.5);
        System.out.println("Car: " + car.getMake() + " " + car.getModel() + " " + car.getYear() + " " + car.getColor());
        System.out.println("Motorcycle: " + motorcycle.getMake() + " " + motorcycle.getModel() + " " + motorcycle.getYear() + " " + motorcycle.getColor() + " " + motorcycle.getCc() + "cc");
        System.out.println("Truck: " + truck.getMake() + " " + truck.getModel() + " " + truck.getYear() + " " + truck.getColor() + " " + truck.getBedLength() + "ft");
    }
}
