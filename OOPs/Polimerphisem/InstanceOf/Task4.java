//Scenario 4: Vehicle Service Center
//In a vehicle service center application, create classes like "Vehicle," "Car," and "Motorcycle" representing different types of vehicles. Use the instanceof operator to identify the type of vehicle and perform specific service operations based on the vehicle's type.

class Vehicle{
    private String type;
    private String name;
    private double price;
    
    public Vehicle(String type , String name , double price){
        this.type = type;
        this.name = name;
        this.price = price;
    }

    void display(){
        System.out.println("The type of this Vehical is :- "+type);
        System.out.println("The name of this Vehical is :- "+name);
        System.out.println("The price of this Vehical is :- "+price);
        System.out.println("------------------------------------------------------------");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Car extends Vehicle{
    public Car(String type , String name , double price){
        super(type, name, price);
    }

    public void displayCar(){
        System.out.println("The type of this Vehical is :- "+super.getType());
        System.out.println("The name of this car is :- "+super.getName());
        System.out.println("The price of this car is :- "+super.getPrice());
        System.out.println("------------------------------------------------------------");
    }
}

class Motorcycle extends Vehicle{
    public Motorcycle(String type , String name , double price){
        super(type, name, price);
    }

    public void displayMotor(){
        System.out.println("The type of this Vehical is :- "+super.getType());
        System.out.println("The name of this MotorCycle is :- "+super.getName());
        System.out.println("The price of this MotorCycle is :- "+super.getPrice());
        System.out.println("------------------------------------------------------------");
    }
}

public class Task4 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("Car", "Swift", 430000);
        Vehicle vehicle2 = new Motorcycle("MotorCycle", "Hero Honda", 50000);       //upcasting
        // System.out.println(vehicle1 instanceof Car);
        // vehicle1.display();
        // System.out.println(vehicle2 instanceof Motorcycle);
        // vehicle2.display();

        if (vehicle1 instanceof Car){
            Car obj1 = (Car) vehicle1;                        //downCasting
            obj1.display();
            obj1.displayCar();
        }
        
        if (vehicle2 instanceof Motorcycle){
            Motorcycle obj2 = (Motorcycle) vehicle2;
            obj2.display();
            obj2.displayMotor();
        }
    }
}