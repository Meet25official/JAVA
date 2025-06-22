// Scenario 5: Inventory Management
// In an inventory management system, create an array to store the quantities of different products in stock. Perform operations such as updating stock levels, searching for products based on certain criteria, and generating an inventory report.

import java.util.Scanner;

class Product {
    String name;
    int quantity;
    double price;

    Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Quantity: " + quantity + ", Price: $" + price;
    }
}
public class Task5 {
    private static final int MAX_PRODUCTS = 100;
    private static Product[] products = new Product[MAX_PRODUCTS];
    private static int productCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Inventory Management System");
            System.out.println("1. Add New Product");
            System.out.println("2. Update Stock Levels");
            System.out.println("3. Search Product");
            System.out.println("4. Generate Inventory Report");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addNewProduct(scanner);
                    break;
                case 2:
                    updateStockLevels(scanner);
                    break;
                case 3:
                    searchProduct(scanner);
                    break;
                case 4:
                    generateInventoryReport();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addNewProduct(Scanner scanner) {
        if (productCount == MAX_PRODUCTS) {
            System.out.println("Inventory is full. Cannot add more products.");
            return;
        }
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); 

        products[productCount++] = new Product(name, quantity, price);
        System.out.println("Product added successfully.");
    }

    private static void updateStockLevels(Scanner scanner) {
        System.out.print("Enter product name to update: ");
        String name = scanner.nextLine();
        for (int i = 0; i < productCount; i++) {
            if (products[i].name.equalsIgnoreCase(name)) {
                System.out.print("Enter new quantity: ");
                int newQuantity = scanner.nextInt();
                scanner.nextLine(); 
                products[i].quantity = newQuantity;
                System.out.println("Stock level updated successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    private static void searchProduct(Scanner scanner) {
        System.out.print("Enter product name to search: ");
        String name = scanner.nextLine();
        for (int i = 0; i < productCount; i++) {
            if (products[i].name.equalsIgnoreCase(name)) {
                System.out.println("Product found: " + products[i]);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    private static void generateInventoryReport() {
        if (productCount == 0) {
            System.out.println("No products to display.");
            return;
        }
        System.out.println("Inventory Report:");
        for (int i = 0; i < productCount; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
    }
}
