// 8. Overloading Constructors in Multilevel Inheritance:
//    - Problem Statement: Design a multilevel inheritance structure with classes 'Gadget', 'Phone', and 'Smartphone'. Each class should have multiple constructors to initialize different sets of attributes. Ensure constructor overloading and chaining using 'this' and 'super' keywords.

class Gadget {
    private String brand;
    private double price;

    public Gadget() {
        this.brand = "Unknown";
        this.price = 0.0;
    }

    public Gadget(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Phone extends Gadget {
    private String networkType;

    public Phone() {
        super();  
        this.networkType = "Unknown";
    }

    public Phone(String brand, double price, String networkType) {
        super(brand, price);  
        this.networkType = networkType;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }
}

class Smartphone extends Phone {
    private String operatingSystem;

    public Smartphone() {
        super(); 
        this.operatingSystem = "Unknown";
    }

    public Smartphone(String brand, double price, String networkType, String operatingSystem) {
        super(brand, price, networkType);  
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}

public class Task8 {
    public static void main(String[] args) {
        Gadget gadget1 = new Gadget("Vivo", 23999.99);
        Phone phone1 = new Phone("V19", 25999.99, "4G");
        Smartphone smartphone1 = new Smartphone("X Fold3 Pro", 159999.00, "5G", "Android");

        System.out.println("Gadget: " + gadget1.getBrand() + ", $" + gadget1.getPrice());
        System.out.println("Phone: " + phone1.getBrand() + ", $" + phone1.getPrice() + ", Network: " + phone1.getNetworkType());
        System.out.println("Smartphone: " + smartphone1.getBrand() + ", $" + smartphone1.getPrice() + ", Network: " + smartphone1.getNetworkType() + ", OS: " + smartphone1.getOperatingSystem());
    }
}
