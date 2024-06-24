// 6. Car Class: Design a `Car` class with a constructor to set the car's make, model, and year of manufacture.

class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

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
public class Task6 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2023);

        System.out.println("Car Make: " + myCar.getMake());
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Car Year: " + myCar.getYear());
    }
}
