// 8. Inheritance and Constructors:
//    Create a 'Vehicle' class with fields 'make' and 'year'. Provide a default constructor and a parameterized constructor. Then, create a 'Car' class that inherits from 'Vehicle' and adds a 'model' field. Implement constructors in the 'Car' class that call the appropriate constructors in the 'Vehicle' class.

class Vehicle {
    private String make;
    private int year;

    public Vehicle() {
        make = null;
        year = 0;
    }

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }
}

class Car extends Vehicle {
    private String model;

    public Car() {
        super();
        this.model = "";
    }

    public Car(String make, int year, String model) {
        super(make, year);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

public class Task8 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Toyota", 2020);

        System.out.println("Details of Vehicle 1:");
        System.out.println("Make: " + vehicle1.getMake());
        System.out.println("Year: " + vehicle1.getYear());

        Car car1 = new Car("Ford", 2018, "Mustang");

        System.out.println("\nDetails of Car 1:");
        System.out.println("Make: " + car1.getMake());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Model: " + car1.getModel());
    }
}
