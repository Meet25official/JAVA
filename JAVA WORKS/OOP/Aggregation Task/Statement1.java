// --> Problem Statement 1: Sales Data Aggregation

// Context:
// You are working for a retail company that has multiple stores. Each store records its sales data, which includes the sales amount and the date of the sale. Your task is to write a Java program that aggregates the sales data to provide insights such as total sales, average sales per day, and total sales for each store.

// Requirements:
// 1. Create a `Store` class that contains a list of `Sale` objects. Each `Sale` object should have attributes such as `date` (of type `LocalDate`) and `amount` (of type `double`).
// 2. Write methods in the `Store` class to:
//    - Calculate the total sales for the store.
//    - Calculate the average sales per day for the store.
//    - Group sales data by month and calculate the total sales for each month.
// 3. Write a `RetailCompany` class that contains a list of `Store` objects.
// 4. Write methods in the `RetailCompany` class to:
//    - Calculate the total sales for the company.
//    - Calculate the average sales per store.
//    - Find the store with the highest total sales.

// Example Usage:

// Store store1 = new Store();
// store1.addSale(new Sale(LocalDate.of(2023, 1, 1), 100.0));
// store1.addSale(new Sale(LocalDate.of(2023, 1, 2), 150.0));

// Store store2 = new Store();
// store2.addSale(new Sale(LocalDate.of(2023, 1, 1), 200.0));
// store2.addSale(new Sale(LocalDate.of(2023, 1, 2), 250.0));

// RetailCompany company = new RetailCompany();
// company.addStore(store1);
// company.addStore(store2);

// System.out.println("Total sales for the company: " + company.getTotalSales());
// System.out.println("Average sales per store: " + company.getAverageSalesPerStore());
// System.out.println("Store with the highest sales: " + company.getTopStore().getTotalSales());

import java.time.LocalDate;

class Sale {
    private LocalDate date;
    private double amount;

    public Sale(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }
}

class Store {
    private Sale[] sales;
    private int size;

    public Store(int capacity) {
        this.sales = new Sale[capacity];
        this.size = 0;
    }

    public void addSale(Sale sale) {
        if (size < sales.length) {
            sales[size++] = sale;
        }
    }

    public double getTotalSales() {
        double totalSales = 0.0;
        for (int i = 0; i < size; i++) {
            totalSales += sales[i].getAmount();
        }
        return totalSales;
    }

    public double getAverageSalesPerDay() {
        if (size == 0) {
            return 0.0;
        }

        LocalDate[] uniqueDates = new LocalDate[sales.length];
        double totalSales = 0.0;
        int uniqueCount = 0;

        for (int i = 0; i < size; i++) {
            LocalDate saleDate = sales[i].getDate();
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueDates[j].isEqual(saleDate)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueDates[uniqueCount++] = saleDate;
            }
            totalSales += sales[i].getAmount();
        }

        return totalSales / uniqueCount;
    }

    public double[] getMonthlySales() {
        double[] monthlySales = new double[12]; 

        for (int i = 0; i < size; i++) {
            int monthValue = sales[i].getDate().getMonthValue();
            monthlySales[monthValue - 1] += sales[i].getAmount();
        }

        return monthlySales;
    }
}

class RetailCompany {
    private Store[] stores;
    private int size;

    public RetailCompany(int capacity) {
        this.stores = new Store[capacity];
        this.size = 0;
    }

    public void addStore(Store store) {
        if (size < stores.length) {
            stores[size++] = store;
        }
    }

    public double getTotalSales() {
        double totalSales = 0.0;
        for (int i = 0; i < size; i++) {
            totalSales += stores[i].getTotalSales();
        }
        return totalSales;
    }

    public double getAverageSalesPerStore() {
        if (size == 0) {
            return 0.0;
        }

        double totalSales = getTotalSales();
        return totalSales / size;
    }

    public Store getTopStore() {
        if (size == 0) {
            return null;
        }

        Store topStore = stores[0];
        double maxSales = topStore.getTotalSales();

        for (int i = 1; i < size; i++) {
            double storeSales = stores[i].getTotalSales();
            if (storeSales > maxSales) {
                maxSales = storeSales;
                topStore = stores[i];
            }
        }

        return topStore;
    }

    public Store[] getStores() {
        return stores;
    }
}

public class Statement1 {
    public static void main(String[] args) {
        Store store1 = new Store(10);
        store1.addSale(new Sale(LocalDate.of(2023, 1, 1), 100.0));
        store1.addSale(new Sale(LocalDate.of(2023, 1, 2), 150.0));

        Store store2 = new Store(10);
        store2.addSale(new Sale(LocalDate.of(2023, 1, 1), 200.0));
        store2.addSale(new Sale(LocalDate.of(2023, 1, 2), 250.0));

        RetailCompany company = new RetailCompany(10);
        company.addStore(store1);
        company.addStore(store2);

        System.out.println("Total sales for the company: " + company.getTotalSales());
        System.out.println("Average sales per store: " + company.getAverageSalesPerStore());

        Store topStore = company.getTopStore();
        if (topStore != null) {
            System.out.println("Store with the highest sales: " + topStore.getTotalSales());
        } else {
            System.out.println("No stores found.");
        }
        for (Store store : company.getStores()) {
            System.out.println("Monthly sales for Store: ");
            double[] monthlySales = store.getMonthlySales();
            for (int i = 0; i < monthlySales.length; i++) {
                if (monthlySales[i] > 0) {
                    System.out.println("Month " + (i + 1) + " Total Sales: " + monthlySales[i]);
                }
            }
        }
    }
}
