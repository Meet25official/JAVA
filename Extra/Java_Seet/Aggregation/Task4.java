// Scenario 4: Online Shopping Cart
// Design an online shopping cart system where a shopping cart contains multiple items. The shopping cart class contains a list of item objects, representing an aggregation relationship.
class Item {
    String name;
    double price;
    int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", price=" + price + ", quantity=" + quantity;
    }
}

class ShoppingCart {
    private Item[] items;
    private int count;

    public ShoppingCart(int size) {
        items = new Item[size];
        count = 0;
    }

    public void addItem(Item item) {
        if (count < items.length) {
            items[count++] = item;
        } else {
            System.out.println("Shopping cart is full, cannot add more items.");
        }
    }

    public void printItems() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < count; i++) {
            totalCost += items[i].price * items[i].quantity;
        }
        return totalCost;
    }
}
public class Task4 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(10);

        Item item1 = new Item("Laptop", 999.99, 1);
        Item item2 = new Item("Smartphone", 499.99, 2);
        Item item3 = new Item("Headphones", 79.99, 3);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        System.out.println("Items in the shopping cart:");
        cart.printItems();

        double totalCost = cart.calculateTotalCost();
        System.out.println("Total cost of items in the shopping cart: $" + totalCost);
    }
}
