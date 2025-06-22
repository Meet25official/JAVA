// Scenario 6: Electronics Product Hierarchy
// Design an electronics product hierarchy with a base class called "Product" and derived classes like "Television," "Smartphone," and "Laptop." The base class can contain attributes like brand and price, while the derived classes can have specific features and functionalities.

class Product {
    String brand;
    double price;

    public Product(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }
}

class Television extends Product {
    String screenType;
    int screenSize;

    public Television(String brand, double price, String screenType, int screenSize) {
        super(brand, price);
        this.screenType = screenType;
        this.screenSize = screenSize;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Screen Type: " + screenType);
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}

class Smartphone extends Product {
    String operatingSystem;
    String processor;

    public Smartphone(String brand, double price, String operatingSystem, String processor) {
        super(brand, price);
        this.operatingSystem = operatingSystem;
        this.processor = processor;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Processor: " + processor);
    }
}

class Laptop extends Product {
    int ram;
    String storageType;
    double weight;

    public Laptop(String brand, double price, int ram, String storageType, double weight) {
        super(brand, price);
        this.ram = ram;
        this.storageType = storageType;
        this.weight = weight;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage Type: " + storageType);
        System.out.println("Weight: " + weight + " kg");
    }
}

public class Task6 {
    public static void main(String[] args) {
        Television tv = new Television("Samsung", 999.99, "LED", 55);
        Smartphone phone = new Smartphone("Apple", 699.99, "iOS", "A14 Bionic");
        Laptop laptop = new Laptop("Dell", 1199.99, 16, "SSD", 1.5);

        System.out.println("Television:");
        tv.displayDetails();
        System.out.println();

        System.out.println("Smartphone:");
        phone.displayDetails();
        System.out.println();

        System.out.println("Laptop:");
        laptop.displayDetails();
    }
}
