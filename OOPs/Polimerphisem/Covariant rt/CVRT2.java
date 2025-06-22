class Vehicle {
    Vehicle startEngine() {
        System.out.println("Starting the engine of a generic vehicle.");
        return this;
    }
}

class Car extends Vehicle {
    @Override
    Car startEngine() {
        System.out.println("Starting the engine of a car.");
        return this;
    }
}

public class CVRT2 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.startEngine();

        Car c = new Car();
        c.startEngine();

        v = new Car();
        v.startEngine();
    }
}
