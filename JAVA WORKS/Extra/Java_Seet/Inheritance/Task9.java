// Scenario 9: Online Shopping Cart
// Design an online shopping cart system with a base class called "CartItem" and derived classes like "ElectronicsItem," "ClothingItem," and "BookItem." Each derived class can have its own attributes and behaviors related to that type of item.

class CartItem {
    private String name;
    private double price;
    private int quantity;
    private static final int MAX_ITEMS = 10; 
    private static CartItem[] items = new CartItem[MAX_ITEMS];
    private static int itemCount = 0;

    public CartItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        if (itemCount < MAX_ITEMS) {
            items[itemCount++] = this;
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    public double calculateTotalPrice() {
        return price * quantity;
    }

    public String toString() {
        return name + " - $" + price + " x " + quantity;
    }

    public static void displayCart() {
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i]);
        }
    }

    public static double calculateTotalPriceOfCart() {
        double totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].calculateTotalPrice();
        }
        return totalPrice;
    }
}
class ElectronicsItem extends CartItem {
    private String manufacturer;

    public ElectronicsItem(String name, double price, int quantity, String manufacturer) {
        super(name, price, quantity);
        this.manufacturer = manufacturer;
    }

    public String toString() {
        return super.toString() + " [Manufacturer: " + manufacturer + "]";
    }
}
class ClothingItem extends CartItem {
    private String size;
    private String material;

    public ClothingItem(String name, double price, int quantity, String size, String material) {
        super(name, price, quantity);
        this.size = size;
        this.material = material;
    }

    public String toString() {
        return super.toString() + " [Size: " + size + ", Material: " + material + "]";
    }
}
class BookItem extends CartItem {
    private String author;
    private int pages;

    public BookItem(String name, double price, int quantity, String author, int pages) {
        super(name, price, quantity);
        this.author = author;
        this.pages = pages;
    }

    public String toString() {
        return super.toString() + " [Author: " + author + ", Pages: " + pages + "]";
    }
}
public class Task9 {
    public static void main(String[] args) {
        ElectronicsItem laptop = new ElectronicsItem("Laptop", 999.99, 1, "HP");
        ClothingItem shirt = new ClothingItem("T-Shirt", 19.99, 2, "M", "Cotton");
        BookItem book = new BookItem("Java Programming", 49.99, 1, "John Doe", 500);

        CartItem.displayCart();

        System.out.println("Total Price: $" + CartItem.calculateTotalPriceOfCart());
    }
}
