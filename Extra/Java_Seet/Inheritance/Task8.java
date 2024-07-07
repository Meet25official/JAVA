// Scenario 8: Vehicle Rental System
// Implement a vehicle rental system where you have a base class called "Vehicle" and derived classes like "Car," "Motorcycle," and "Truck." Each derived class can have its own rental rates and additional features specific to that type of vehicle.


class Vehicle {
    String make;
    String model;
    int year;
    double dailyRate;

    public Vehicle(String make, String model, int year, double dailyRate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.dailyRate = dailyRate;
    }

    public String toString() {
        return year + " " + make + " " + model + " - $" + dailyRate + " per day";
    }
}

class Car extends Vehicle {
    int numSeats;

    public Car(String make, String model, int year, double dailyRate, int numSeats) {
        super(make, model, year, dailyRate);
        this.numSeats = numSeats;
    }

    public String toString() {
        return super.toString() + " - " + numSeats + " seats";
    }
}

class Motorcycle extends Vehicle {
    String type; 

    public Motorcycle(String make, String model, int year, double dailyRate, String type) {
        super(make, model, year, dailyRate);
        this.type = type;
    }

    public String toString() {
        return super.toString() + " - Type: " + type;
    }
}

class Truck extends Vehicle {
    double loadCapacity; 

    public Truck(String make, String model, int year, double dailyRate, double loadCapacity) {
        super(make, model, year, dailyRate);
        this.loadCapacity = loadCapacity;
    }

    public String toString() {
        return super.toString() + " - Load Capacity: " + loadCapacity + " tons";
    }
}
public class Task8 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 50.0, 5);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, 30.0, "Cruiser");
        Truck truck = new Truck("Ford", "F-150", 2020, 80.0, 1.5);

        System.out.println(car);
        System.out.println(motorcycle);
        System.out.println(truck);
    }
}