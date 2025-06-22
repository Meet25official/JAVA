// Scenario 7: Product Ratings
// In an e-commerce platform, create an array to store the ratings given by users for different products. Perform operations such as calculating the average rating for a product, identifying highly rated products, and allowing users to submit their ratings.

import java.util.Scanner;

class Product {
    String name;
    int[] ratings;
    int ratingCount;

    Product(String name, int maxRatings) {
        this.name = name;
        this.ratings = new int[maxRatings];
        this.ratingCount = 0;
    }

    void addRating(int rating) {
        if (ratingCount < ratings.length) {
            ratings[ratingCount++] = rating;
        } else {
            System.out.println("Cannot add more ratings.");
        }
    }

    double getAverageRating() {
        if (ratingCount == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < ratingCount; i++) {
            sum += ratings[i];
        }
        return (double) sum / ratingCount;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Average Rating: " + getAverageRating();
    }
}

public class Task7 {
    private static final int MAX_PRODUCTS = 10;
    private static final int MAX_RATINGS = 100;
    private static Product[] products = new Product[MAX_PRODUCTS];
    private static int productCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Product Ratings System");
            System.out.println("1. Add Product");
            System.out.println("2. Submit Rating");
            System.out.println("3. Calculate Average Rating");
            System.out.println("4. List Highly Rated Products");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    submitRating(scanner);
                    break;
                case 3:
                    calculateAverageRating(scanner);
                    break;
                case 4:
                    listHighlyRatedProducts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addProduct(Scanner scanner) {
        if (productCount == MAX_PRODUCTS) {
            System.out.println("Cannot add more products.");
            return;
        }
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        products[productCount++] = new Product(name, MAX_RATINGS);
        System.out.println("Product added successfully.");
    }

    private static void submitRating(Scanner scanner) {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        Product product = findProduct(name);
        if (product == null) {
            System.out.println("Product not found.");
            return;
        }
        System.out.print("Enter rating (1-5): ");
        int rating = scanner.nextInt();
        scanner.nextLine(); 
        if (rating < 1 || rating > 5) {
            System.out.println("Invalid rating. Please enter a value between 1 and 5.");
            return;
        }
        product.addRating(rating);
        System.out.println("Rating submitted successfully.");
    }

    private static void calculateAverageRating(Scanner scanner) {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        Product product = findProduct(name);
        if (product == null) {
            System.out.println("Product not found.");
            return;
        }
        System.out.println("Average rating for " + product.name + ": " + product.getAverageRating());
    }

    private static void listHighlyRatedProducts() {
        if (productCount == 0) {
            System.out.println("No products to display.");
            return;
        }
        System.out.println("Highly Rated Products (Average Rating >= 4.0):");
        boolean found = false;
        for (int i = 0; i < productCount; i++) {
            if (products[i].getAverageRating() >= 4.0) {
                System.out.println(products[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No highly rated products found.");
        }
    }

    private static Product findProduct(String name) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].name.equalsIgnoreCase(name)) {
                return products[i];
            }
        }
        return null;
    }
}
