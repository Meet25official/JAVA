// Scenario 2: Online Shopping
// In an online shopping system, create a base class called "Product" with a method called "displayDetails" that shows general product information. Implement derived classes like "Electronics" and "Clothing" that override the "displayDetails" method and use the super keyword to display both general and specific product details.

class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }
}

class Electronics extends Product {
    private String brand;
    private int warrantyPeriod; 

    public Electronics(String name, double price, String brand, int warrantyPeriod) {
        super(name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Brand: " + brand);
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }
}

class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}
public class Task2 {
    public static void main(String[] args) {
        Product laptop = new Electronics("Laptop", 9999.99, "Dell", 12);
        Product tshirt = new Clothing("T-Shirt", 199.99, "M", "Cotton");

        laptop.displayDetails();
        System.out.println(); 
        tshirt.displayDetails();
    }
}
