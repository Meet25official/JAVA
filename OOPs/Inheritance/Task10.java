//10. Using This and Super with Multiple Levels of Inheritance:
// - Problem Statement: Create a multilevel inheritance hierarchy with classes 'Electronics', 'Computer', and 'Laptop'. The 'Electronics' class should have attributes 'brand' and 'price', and a method 'showDetails()'. The 'Computer' class should add 'processorType' and override 'showDetails()'. The 'Laptop' class should add 'batteryLife' and further override 'showDetails()'. Use constructors, 'this', and 'super' to demonstrate proper initialization and method calls.

class Electronics{
    private String brand;
    private double price;

    public Electronics(String brand , double price){
        this.brand = brand;
        this.price = price;
    }

    public void showDetails(){
        System.out.println("The brand of this electronics device is :- "+brand);
        System.out.println("The price of this electronics device is :- "+price);
    }
}

class Computer extends Electronics{
    private String prosseserType;
    
    public Computer(String b , double p , String pr){
        super(b, p);
        prosseserType = pr;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("The processer of this computer is :- "+prosseserType);
    }
}

class Laptop extends Computer{
    private int batteryLife;

    public Laptop(String b , double p , String pr , int ba){
        super(b, p, pr);
        batteryLife = ba;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("The battery life is :- "+batteryLife+" years.");
    }
}

public class Task10 {
    public static void main(String[] args) {
        Laptop obj= new Laptop("Leanovo", 62000, "G7", 10);
        obj.showDetails();
    }
}
