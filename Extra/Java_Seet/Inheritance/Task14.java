// Scenario 14: Restaurant Ordering System
// Design a restaurant ordering system with classes like "Menu," "Order," and "Table." Implement methods for users to view the menu, place orders, and manage tables.

class RestaurantEntity {
    private String name;
    
    public RestaurantEntity(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}

class Menu extends RestaurantEntity {
    private String[] items;
    private int itemCount;
    private static final int MAX_ITEMS = 10;
    
    public Menu(String name) {
        super(name);
        this.items = new String[MAX_ITEMS];
        this.itemCount = 0;
    }
    
    public void addItem(String item) {
        if (itemCount < MAX_ITEMS) {
            items[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("Menu is full. Cannot add more items.");
        }
    }
    
    public void viewMenu() {
        System.out.println(getName() + " Menu:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(" - " + items[i]);
        }
    }
}

class Table extends RestaurantEntity {
    private int tableNumber;
    
    public Table(int tableNumber) {
        super("Table " + tableNumber);
        this.tableNumber = tableNumber;
    }
    
    public int getTableNumber() {
        return tableNumber;
    }
}

class Order extends RestaurantEntity {
    private String orderDetails;
    
    public Order(String orderDetails) {
        super("Order");
        this.orderDetails = orderDetails;
    }
    
    @Override
    public String toString() {
        return orderDetails;
    }
}
public class Task14 {
    public static void main(String[] args) {
        Menu menu = new Menu("Restaurant A");
        menu.addItem("Pizza");
        menu.addItem("Pasta");
        menu.addItem("Salad");
        
        menu.viewMenu();
        
        Table table1 = new Table(1);
        Table table2 = new Table(2);
        
        Order order1 = new Order("Pizza and Salad");
        Order order2 = new Order("Pasta");
        
        System.out.println(table1);
        System.out.println(table2);
        System.out.println(order1);
        System.out.println(order2);
    }
}
