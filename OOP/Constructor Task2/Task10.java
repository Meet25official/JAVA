// 10. Computer Class: Create a `Computer` class with a constructor to store information about a computer, including its brand, model, and price.

class Computer {
    private String brand;
    private String model;
    private double price;

    public Computer(String brand, String model, double price) {
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
}

public class Task10 {
    public static void main(String[] args) {
        Computer laptop = new Computer("Apple", "MacBook Pro", 1999.99);

        System.out.println("Computer Brand: " + laptop.getBrand());
        System.out.println("Computer Model: " + laptop.getModel());
        System.out.println("Computer Price: $" + laptop.getPrice());
    }
}
