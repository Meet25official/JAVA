/*
Problem Statement
Title: Analysis of Monthly Sales Data for a Food Delivery Service
Context:
A food delivery service operates in multiple cities and offers a variety of food items. The service tracks sales data including the city, food item, quantity sold, and revenue generated. The company wants to analyze this data to gain insights into their sales performance.
Objectives:
Calculate Total Sales: Determine the total quantity sold and total revenue generated for each food item across all cities.
City-wise Sales Analysis: Find out the total quantity sold and total revenue generated for each food item in each city.
Monthly Trends: Analyze monthly sales trends for each food item.
Requirements:
Use Java to process and analyze the sales data.
Implement data aggregation to summarize the information as required.
Input Data:
A list of sales records where each record contains:
    - City (String)
    - Food Item (String)
    - Quantity Sold (int)
    - Revenue Generated (double)
    - Sale Date (Date)
Output Data:
Total quantity sold and total revenue for each food item.
Total quantity sold and total revenue for each food item in each city.
Monthly sales trends for each food item.
*/

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class SalesRecord {
    String city;
    String foodItem;
    int quantitySold;
    double revenueGenerated;
    Date saleDate;

    public SalesRecord(String city, String foodItem, int quantitySold, double revenueGenerated, Date saleDate) {
        this.city = city;
        this.foodItem = foodItem;
        this.quantitySold = quantitySold;
        this.revenueGenerated = revenueGenerated;
        this.saleDate = saleDate;
    }
}

class SalesAnalysis {
    SalesRecord[] salesData; // Aggregation

    public SalesAnalysis(SalesRecord[] salesData) {
        this.salesData = salesData;
    }

    public void aggregateTotalSalesByFoodItem() {
        System.out.println("Total Sales by Food Item: ");

        String[] uniqueFoodItems = getUniqueFoodItems();
        for (String foodItem : uniqueFoodItems) {
            int totalQuantity = 0;
            double totalRevenue = 0.0;

            for (SalesRecord record : salesData) {
                if (record.foodItem.equals(foodItem)) {
                    totalQuantity += record.quantitySold;
                    totalRevenue += record.revenueGenerated;
                }
            }

            System.out.println(foodItem + " Quantity Sold: " + totalQuantity + ", Revenue Generated: Rs." + totalRevenue);
        }
    }

    private String[] getUniqueFoodItems() {
        String[] foodItems = new String[salesData.length];
        int count = 0;

        for (SalesRecord record : salesData) {
            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (foodItems[i] != null && foodItems[i].equals(record.foodItem)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                foodItems[count++] = record.foodItem;
            }
        }

        return Arrays.copyOf(foodItems, count);
    }

    public void aggregateCityWiseSalesByFoodItem() {
        System.out.println("\nCity-wise Sales by Food Item:");

        String[] uniqueCities = getUniqueCities();
        String[] uniqueFoodItems = getUniqueFoodItems();

        for (String city : uniqueCities) {
            System.out.println("\nCity: " + city);
            for (String foodItem : uniqueFoodItems) {
                int totalQuantity = 0;
                double totalRevenue = 0.0;

                for (SalesRecord record : salesData) {
                    if (record.city.equals(city) && record.foodItem.equals(foodItem)) {
                        totalQuantity += record.quantitySold;
                        totalRevenue += record.revenueGenerated;
                    }
                }
                System.out.println(foodItem + " Quantity Sold: " + totalQuantity + ", Revenue Generated: Rs." + totalRevenue);
            }
        }
    }

    private String[] getUniqueCities() {
        String[] cities = new String[salesData.length];
        int count = 0;

        for (SalesRecord record : salesData) {
            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (cities[i] != null && cities[i].equals(record.city)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                cities[count++] = record.city;
            }
        }
        return Arrays.copyOf(cities, count);
    }

    public void aggregateMonthlyTrendsByFoodItem() {
        System.out.println("\nMonthly Trends by Food Item:");

        String[] uniqueFoodItems = getUniqueFoodItems();

        for (String foodItem : uniqueFoodItems) {
            System.out.println("\nFood Item: " + foodItem);

            int[] monthlyQuantity = new int[12];
            double[] monthlyRevenue = new double[12];

            for (SalesRecord record : salesData) {
                if (record.foodItem.equals(foodItem)) {
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(record.saleDate);
                    int month = cal.get(Calendar.MONTH);

                    monthlyQuantity[month] += record.quantitySold;
                    monthlyRevenue[month] += record.revenueGenerated;
                }
            }

            for (int i = 0; i < 12; i++) {
                if (monthlyQuantity[i] > 0 || monthlyRevenue[i] > 0) {
                    System.out.println("Month " + (i + 1) + " Quantity Sold: " + monthlyQuantity[i] + ", Revenue Generated: Rs." + monthlyRevenue[i]);
                }
            }
        }
    }
}

public class Agg_1 {
    public static void main(String[] args) {
        SalesRecord[] salesData = {
                new SalesRecord("New York", "Pizza", 30, 4500.0, new GregorianCalendar(2023, Calendar.JANUARY, 10).getTime()),
                new SalesRecord("Los Angeles", "Burger", 20, 2000.0, new GregorianCalendar(2023, Calendar.JANUARY, 15).getTime()),
                new SalesRecord("New York", "Pizza", 50, 7500.0, new GregorianCalendar(2023, Calendar.FEBRUARY, 10).getTime()),
                new SalesRecord("Los Angeles", "Pizza", 25, 3705.0, new GregorianCalendar(2023, Calendar.JANUARY, 20).getTime()),
                new SalesRecord("New York", "Burger", 40, 4000.0, new GregorianCalendar(2023, Calendar.MARCH, 5).getTime())
        };

        SalesAnalysis analysis = new SalesAnalysis(salesData);
        analysis.aggregateTotalSalesByFoodItem();
        analysis.aggregateCityWiseSalesByFoodItem();
        analysis.aggregateMonthlyTrendsByFoodItem();
    }
}
