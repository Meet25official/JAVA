/*
Static is used to refer the common property of all objects.
Anything that will be declared as static will be common for all the objects of that class.
Task:
Problem Statement: Car Fleet Management
You are tasked with developing a car fleet management system. The system needs to keep track of various pieces of information for each car in the fleet, such as the make, model, year, price, and whether the car is currently in use. Additionally, the system should maintain a count of the total number of cars in the fleet.
Design and implement a `Car` class to represent individual cars in the fleet. The `Car` class should have the following features:
- Attributes:
  - `make` (String): The make or brand of the car.
  - `model` (String): The model of the car.
  - `year` (int): The manufacturing year of the car.
  - `price` (double): The price of the car.
  - `isRunning` (boolean): A flag indicating whether the car is currently running or not.
- Static Attribute:
  - `numberOfCars` (int): A static variable to keep track of the total number of cars in the fleet.
- Methods:
  - A constructor to initialize the car's attributes.
  - `start()` and `stop()` methods to change the `isRunning` status.
  - `displayCarInfo()` method to display car information.
  - A `getNumberOfCars()` static method to retrieve the total number of cars in the fleet.
You need to implement the `Car` class and use it to create, manage, and display information for multiple cars in the fleet. Ensure that the `numberOfCars` variable is properly incremented when new cars are added to the fleet and that it can be accessed without creating an instance of the `Car` class.
*/

class Car {
    private String make;
    private String model;
    private int year;
    private double price;
    private boolean isRunning;
    private static int numberOfCars = 0;

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isRunning = false; 
        numberOfCars++; 
    }

    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(make + " " + model + " has been started.");
        } else {
            System.out.println(make + " " + model + " is already running.");
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println(make + " " + model + " has been stopped.");
        } else {
            System.out.println(make + " " + model + " is already stopped.");
        }
    }

    public void displayCarInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturing Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Is Running: " + (isRunning ? "Yes" : "No"));
        System.out.println();
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }
}
    
public class Task {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020, 25000.0);
        Car car2 = new Car("Honda", "Civic", 2021, 22000.0);
        Car car3 = new Car("Ford", "F-150", 2019, 35000.0);

        car1.displayCarInfo();
        car2.displayCarInfo();
        car3.displayCarInfo();

        car1.start();
        car2.start();
        car1.stop();
        car3.start();

        System.out.println("Total Number of Cars: " + Car.getNumberOfCars());
    }
}
