// 4. Constructor Chaining with Single Inheritance:
//    - Problem Statement: Design a single inheritance relationship with classes 'Appliance' and 'WashingMachine'. The 'Appliance' class should have attributes 'power' and 'brand', and a constructor to initialize these attributes. The 'WashingMachine' class should add 'capacity' and utilize constructor chaining to initialize all attributes using 'this' and 'super'.

class Appliance {
    protected int power;
    protected String brand;
    
    public Appliance(int power, String brand) {
        this.power = power;
        this.brand = brand;
    }
}

class WashingMachine extends Appliance {
    protected int capacity;
    
    public WashingMachine(int power, String brand, int capacity) {
        super(power, brand); 
        this.capacity = capacity;
    }
}

public class Task4 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine(1500, "Samsung", 8);
        
        System.out.println("Washing Machine Details:");
        System.out.println("Brand: " + wm.brand);
        System.out.println("Power: " + wm.power + " watts");
        System.out.println("Capacity: " + wm.capacity + " kg");
    }
}
