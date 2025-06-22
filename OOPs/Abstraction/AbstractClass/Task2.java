//Scenario 2: Vehicle Manufacturing
//Design an abstract class called "Vehicle" with abstract methods like "assemble" and "paint." Implement derived classes like "Car" and "Motorcycle" that provide specific implementations for these abstract methods.

abstract class Vehical{
    private String brand;
    private String name;
    private double price;

    public Vehical(String brand , String name , double price){
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    abstract void assemble();
    abstract void paint();

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Car extends Vehical{
    public Car(String brand , String name , double price){
        super(brand, name, price);
    }
    
    @Override
    void assemble(){
        System.out.println("The car brand is :- "+super.getBrand());
        System.out.println("The car name is :- "+super.getName());
        System.out.println("The Car price is :- "+super.getPrice());
    }
    @Override
    void paint(){
        System.out.println("The Car paint color is red.");
    }
}


class Motorcycle extends Vehical{
    public Motorcycle(String brand , String name , double price){
        super(brand, name, price);
    }
    
    @Override
    void assemble(){
        System.out.println("The MotorCylce brand is :- "+super.getBrand());
        System.out.println("The MotorCycle name is :- "+super.getName());
        System.out.println("The MotorCycle price is :- "+super.getPrice());
    }
    @Override
    void paint(){
        System.out.println("The MotorCycle paint color is Blue.");
    }
}


public class Task2 {
    public static void main(String[] args) {
        Car obj1 = new Car("Suzuki", "Swift", 450000);
        Motorcycle obj2 = new Motorcycle("Honda", "Hero", 50000);
        obj1.assemble();
        obj1.paint();
        obj2.assemble();
        obj2.paint();
    }
}