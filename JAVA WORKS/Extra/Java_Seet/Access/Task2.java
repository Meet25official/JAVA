// Scenario 2: Online Store
// In an online store application, use the "public" access modifier for methods that provide services to customers, such as adding items to a shopping cart or processing payments.

class Item {
    private String name;
    private double price;
    
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private Item[] items;
    private int itemCount;
    
    public ShoppingCart() {
        this.items = new Item[10];  
        this.itemCount = 0;
    }
    
    public void addItem(Item item) {
        if (itemCount == items.length) {
            resize();
        }
        items[itemCount++] = item;
        System.out.println(item.getName() + " has been added to the cart.");
    }
    
    public void viewCart() {
        System.out.println("Items in your cart:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("- " + items[i].getName() + ": $" + items[i].getPrice());
        }
    }
    
    public double getTotalPrice() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }
        return total;
    }
    
    private void resize() {
        Item[] newItems = new Item[items.length * 2];
        System.arraycopy(items, 0, newItems, 0, items.length);
        items = newItems;
    }
}

class PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount);
        System.out.println("Payment of $" + amount + " has been processed successfully.");
    }
}
public class Task2 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        
        Item item1 = new Item("Laptop", 999.99);
        Item item2 = new Item("Headphones", 199.99);
        
        cart.addItem(item1);
        cart.addItem(item2);
        cart.viewCart();
        
        double total = cart.getTotalPrice();
        System.out.println("Total price: $" + total);
        paymentProcessor.processPayment(total);
    }
}
