// Scenario 20: Car Rental System
// Design a car rental system with classes like "Car," "RentalAgency," and "Customer." Implement methods for customers to search for available cars, make reservations, and manage their rentals.

class Person {
    private String name;
    private int id;
    
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}

class Customer extends Person {
    public Customer(String name, int id) {
        super(name, id);
    }
    
    public void rentCar(RentalAgency agency, Car car) {
        agency.makeReservation(this, car);
    }
}

class Car {
    private String licensePlate;
    private String model;
    private boolean available;
    
    public Car(String licensePlate, String model) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.available = true;
    }
    
    public String getLicensePlate() {
        return licensePlate;
    }
    
    public String getModel() {
        return model;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public String toString() {
        return "License Plate: " + licensePlate + ", Model: " + model + ", Available: " + available;
    }
}

class Rental {
    private Customer customer;
    private Car car;
    
    public Rental(Customer customer, Car car) {
        this.customer = customer;
        this.car = car;
    }
    
    public void completeRental() {
        if (car.isAvailable()) {
            car.setAvailable(false);
            System.out.println("Rental complete: " + customer.getName() + " rented " + car.getModel() + " (License Plate: " + car.getLicensePlate() + ")");
        } else {
            System.out.println("Rental failed: Car is not available.");
        }
    }
}

class RentalAgency {
    private String name;
    private Car[] cars;
    private int carCount;
    
    public RentalAgency(String name, int capacity) {
        this.name = name;
        this.cars = new Car[capacity];
        this.carCount = 0;
    }
    
    public void addCar(Car car) {
        if (carCount < cars.length) {
            cars[carCount++] = car;
            System.out.println("Car added: " + car.getModel() + " (License Plate: " + car.getLicensePlate() + ")");
        } else {
            System.out.println("Cannot add more cars. Capacity reached.");
        }
    }
    
    public void showAvailableCars() {
        System.out.println("Available cars in " + name + ":");
        for (int i = 0; i < carCount; i++) {
            if (cars[i].isAvailable()) {
                System.out.println(cars[i]);
            }
        }
    }
    
    public void makeReservation(Customer customer, Car car) {
        Rental rental = new Rental(customer, car);
        rental.completeRental();
    }
}
public class Task20 {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency("SuperRentals", 5);
        
        Car car1 = new Car("AB1234", "Toyota Corolla");
        Car car2 = new Car("CD5678", "Honda Civic");
        
        agency.addCar(car1);
        agency.addCar(car2);
        
        agency.showAvailableCars();
        
        Customer alice = new Customer("Alice Johnson", 101);
        Customer bob = new Customer("Bob Smith", 102);
        
        alice.rentCar(agency, car1); 
        bob.rentCar(agency, car2);   
        bob.rentCar(agency, car1);  

        agency.showAvailableCars();
    }
}
