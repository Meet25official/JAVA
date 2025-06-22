// Scenario 2: Vehicle Service Center
// In a vehicle service center application, create classes like "Vehicle," "Car," and "Motorcycle" representing different types of vehicles. Use the instanceof operator to identify the type of vehicle and perform specific service operations based on the vehicle's type.

class Vehicle {
    private String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void service() {
        System.out.println("Performing general service for vehicle with license plate: " + licensePlate);
    }
}
class Car extends Vehicle {

    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public void service() {
        System.out.println("Performing car-specific service for vehicle with license plate: " + getLicensePlate());
    }
}
class Motorcycle extends Vehicle {

    public Motorcycle(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public void service() {
        System.out.println("Performing motorcycle-specific service for vehicle with license plate: " + getLicensePlate());
    }
}
class ServiceCenter {

    public void performService(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            ((Car) vehicle).service();
        } else if (vehicle instanceof Motorcycle) {
            ((Motorcycle) vehicle).service();
        } else {
            vehicle.service();
        }
    }
}
public class Task4 {
    public static void main(String[] args) {
        Vehicle car = new Car("ABC123");
        Vehicle motorcycle = new Motorcycle("XYZ789");

        ServiceCenter serviceCenter = new ServiceCenter();

        serviceCenter.performService(car);
        serviceCenter.performService(motorcycle);
    }
}
