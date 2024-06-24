// 7. Parameterized Constructor with Default Values:
//    Design a 'Laptop' class with fields 'brand', 'model', and 'price'. Implement a constructor that takes 'brand' and 'model' as parameters and sets a default price. Also, implement another constructor that initializes all three fields.

class Laptop {
    private String brand;
    private String model;
    private double price;

    public Laptop() {
        brand = null;
        model = null;
        price = 0.0; 
    }

    public Laptop(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    void getLaptopDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}
public class Task7 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Lenovo", "ideapad S540", 72559.99);

        System.out.println("Details of Laptop 1:");
        laptop1.getLaptopDetails();
    }
}
