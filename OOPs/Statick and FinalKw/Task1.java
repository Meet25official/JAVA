/*
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

class Car{
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean isRunning;
    private static int numberOfCars = 10;

    public Car(String brand, String model, int year , double price , boolean isRunning){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isRunning = isRunning;
    }

    public void start(){
        isRunning = true;
        System.out.println("The engine start and running :- "+isRunning);
    }
    public void stop(){
        isRunning = false;
        System.out.println("The engine stop and running :- "+isRunning);
    }
    public void displayCarInfo(){
        System.out.println("Brand :- "+brand);
        System.out.println("Modal : "+model);
        System.out.println("year :- "+year);
        System.out.println("price :- "+price);
        System.out.println("The number of cars is :- "+numberOfCars);
    }
}

public class Task1 {
    public static void main(String[] args) {
        Car obj = new Car("Suzuki", "Wagonr", 2015, 400000, true);
        obj.start();
        obj.stop();
    }
}
