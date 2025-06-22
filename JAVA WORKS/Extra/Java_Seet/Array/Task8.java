// Scenario 8: Stock Portfolio Management
// In a stock portfolio management system, create an array to store the number of shares and prices of different stocks in a portfolio. Perform operations such as calculating the total portfolio value, identifying the best-performing stocks, and generating performance reports.

import java.util.Scanner;

class Stock {
    String name;
    int shares;
    double price;

    Stock(String name, int shares, double price) {
        this.name = name;
        this.shares = shares;
        this.price = price;
    }

    double getValue() {
        return shares * price;
    }

    @Override
    public String toString() {
        return "Stock: " + name + ", Shares: " + shares + ", Price: $" + price + ", Value: $" + getValue();
    }
}

public class Task8 {
    private static final int MAX_STOCKS = 10;
    private static Stock[] portfolio = new Stock[MAX_STOCKS];
    private static int stockCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Stock Portfolio Management System");
            System.out.println("1. Add Stock");
            System.out.println("2. Calculate Total Portfolio Value");
            System.out.println("3. Identify Best Performing Stock");
            System.out.println("4. Generate Performance Report");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStock(scanner);
                    break;
                case 2:
                    calculateTotalPortfolioValue();
                    break;
                case 3:
                    identifyBestPerformingStock();
                    break;
                case 4:
                    generatePerformanceReport();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStock(Scanner scanner) {
        if (stockCount == MAX_STOCKS) {
            System.out.println("Cannot add more stocks.");
            return;
        }
        System.out.print("Enter stock name: ");
        String name = scanner.nextLine();
        System.out.print("Enter number of shares: ");
        int shares = scanner.nextInt();
        System.out.print("Enter price per share: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        portfolio[stockCount++] = new Stock(name, shares, price);
        System.out.println("Stock added successfully.");
    }

    private static void calculateTotalPortfolioValue() {
        double totalValue = 0;
        for (int i = 0; i < stockCount; i++) {
            totalValue += portfolio[i].getValue();
        }
        System.out.println("Total Portfolio Value: $" + totalValue);
    }

    private static void identifyBestPerformingStock() {
        if (stockCount == 0) {
            System.out.println("No stocks in the portfolio.");
            return;
        }
        Stock bestStock = portfolio[0];
        for (int i = 1; i < stockCount; i++) {
            if (portfolio[i].getValue() > bestStock.getValue()) {
                bestStock = portfolio[i];
            }
        }
        System.out.println("Best Performing Stock: " + bestStock);
    }

    private static void generatePerformanceReport() {
        if (stockCount == 0) {
            System.out.println("No stocks to display.");
            return;
        }
        System.out.println("Performance Report:");
        for (int i = 0; i < stockCount; i++) {
            System.out.println((i + 1) + ". " + portfolio[i]);
        }
    }
}
