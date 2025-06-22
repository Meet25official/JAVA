// Scenario 9: Shopping Cart System
// Develop an abstract class called "CartItem" with abstract methods like "calculatePrice" and "displayDetails." Implement derived classes like "ElectronicsItem" and "ClothingItem" that provide specific implementations for these abstract methods.

abstract class CartItem {
    private String itemName;
    private int quantity;

    public CartItem(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    abstract double calculatePrice();
    abstract void displayDetails();

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }
}

class ElectronicsItem extends CartItem {
    private double unitPrice;

    public ElectronicsItem(String itemName, int quantity, double unitPrice) {
        super(itemName, quantity);
        this.unitPrice = unitPrice;
    }

    @Override
    double calculatePrice() {
        return getQuantity() * unitPrice;
    }

    @Override
    void displayDetails() {
        System.out.println("Electronics Item: " + getItemName());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Total Price: $" + calculatePrice());
    }
}

class ClothingItem extends CartItem {
    private double unitPrice;
    private String size;

    public ClothingItem(String itemName, int quantity, double unitPrice, String size) {
        super(itemName, quantity);
        this.unitPrice = unitPrice;
        this.size = size;
    }

    @Override
    double calculatePrice() {
        return getQuantity() * unitPrice;
    }

    @Override
    void displayDetails() {
        System.out.println("Clothing Item: " + getItemName());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Size: " + size);
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Total Price: $" + calculatePrice());
    }
}
public class Task9 {
    public static void main(String[] args) {
        CartItem electronicsItem = new ElectronicsItem("Laptop", 2, 999.99);
        electronicsItem.displayDetails();

        CartItem clothingItem = new ClothingItem("T-Shirt", 3, 19.99, "L");
        clothingItem.displayDetails();
    }
}
