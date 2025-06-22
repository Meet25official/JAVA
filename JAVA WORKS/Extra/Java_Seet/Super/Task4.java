// Scenario 2: Online Retail System
// In an online retail system, create a base class called "Product" with a method called "displayDetails" that shows general product information. Implement derived classes like "ElectronicsProduct" and "ClothingProduct" that override the "displayDetails" method and use the super keyword to display both general and specific product details.

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: $" + price);
    }
}

class ElectronicsProduct extends Product {
    private String brand;
    private String model;

    public ElectronicsProduct(String name, double price, String brand, String model) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class ClothingProduct extends Product {
    private String size;
    private String material;

    public ClothingProduct(String name, double price, String size, String material) {
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

public class Task4 {
    public static void main(String[] args) {
        Product laptop = new ElectronicsProduct("Laptop", 9999.99, "Dell", "Inspiron 15");
        Product tshirt = new ClothingProduct("T-Shirt", 199.99, "M", "Cotton");

        System.out.println("Electronics Product Details:");
        laptop.displayDetails();
        
        System.out.println("\nClothing Product Details:");
        tshirt.displayDetails();
    }
}
