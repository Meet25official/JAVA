//Scenario 1: Vehicle Rental System
//In a vehicle rental system, create a base class called "Vehicle" with a method called "rent" that performs the rental process. Implement derived classes like "Car" and "Motorcycle" that override the "rent" method with their specific rental processes.

class Vehical{
    private String brand;
    private String name;
    private double rent;
    
    public Vehical(String brand , String name , double rent){
        this.brand = brand;
        this.name = name;
        this.rent = rent;
    }

    public void rent(){
        System.out.println("The brand of this vehical is :- "+brand );
        System.out.println("The name of this Vehical is :- "+name);
        System.out.println("The rent of this vehical is :- "+rent);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }
    
}

class Car extends Vehical{
    public Car(String brand , String name , double rent){
        super(brand, name, rent);
    }

    @Override
    public void rent(){
        System.out.println("This details is only for car :- ");
        System.out.println("The brand of this car is :- "+super.getBrand());
        System.out.println("The name of this car is :- "+super.getName());
        System.out.println("The rent of this car is :- "+super.getRent());
    }
}

class Motorcycle extends Vehical{
    public Motorcycle(String brand , String name , double rent){
        super(brand, name, rent);
    }

    @Override
    public void rent(){
        System.out.println("This details is only for MotorCycle :- ");
        System.out.println("The brand of this MotorCycle is :- "+super.getBrand());
        System.out.println("The name of this MotorCycle is :- "+super.getName());
        System.out.println("The rent of this MotorCycle is :- "+super.getRent());
    }
}

public class Task1 {
    public static void main(String[] args){
        Car car = new Car("Suzuki", "Swift", 2000);
        Motorcycle motorcycle = new Motorcycle("Honda", "Achiver", 500);

        car.rent();
        motorcycle.rent();
    }
}