// 10. Using This and Super with Multiple Levels of Inheritance:
//     - Problem Statement: Create a multilevel inheritance hierarchy with classes 'Electronics', 'Computer', and 'Laptop'. The 'Electronics' class should have attributes 'brand' and 'price', and a method 'showDetails()'. The 'Computer' class should add 'processorType' and override 'showDetails()'. The 'Laptop' class should add 'batteryLife' and further override 'showDetails()'. Use constructors, 'this', and 'super' to demonstrate proper initialization and method calls.z

class Electronics {
    private String brand;
    private double price;

    public Electronics(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }
}

class Computer extends Electronics {
    private String processorType;

    public Computer(String brand, double price, String processorType) {
        super(brand, price); 
        this.processorType = processorType;
    }

    public void showDetails() {
        super.showDetails();  
        System.out.println("Processor Type: " + processorType);
    }
}

class Laptop extends Computer {
    private int batteryLife;

    public Laptop(String brand, double price, String processorType, int batteryLife) {
        super(brand, price, processorType);  
        this.batteryLife = batteryLife;
    }

    public void showDetails() {
        super.showDetails();  
        System.out.println("Battery Life: " + batteryLife + " hours");
    }
}

public class Task10 {
    public static void main(String[] args) {
        Electronics electronics = new Electronics("Sony", 999.99);
        Computer computer = new Computer("Dell", 1499.99, "Intel Core i7");
        Laptop laptop = new Laptop("Apple", 1999.99, "Intel Core i5", 10);

        electronics.showDetails();
        computer.showDetails();
        laptop.showDetails();
    }
}
