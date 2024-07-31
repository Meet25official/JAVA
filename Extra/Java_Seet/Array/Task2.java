// Scenario 2: Sales Data Analysis
// In a retail business, create an array to store the daily sales data for different products. Perform operations such as calculating the total sales, finding the best-selling product, and generating a sales report for a specific period.

class SalesDataAnalysis {
    private double[][] salesData; 
    private int numDays;
    private int numProducts;

    public SalesDataAnalysis(int numDays, int numProducts) {
        this.numDays = numDays;
        this.numProducts = numProducts;
        this.salesData = new double[numDays][numProducts];
    }

    public void recordSales(int day, int product, double salesAmount) {
        if (day >= 0 && day < numDays && product >= 0 && product < numProducts) {
            salesData[day][product] = salesAmount;
        } else {
            System.out.println("Invalid day or product index.");
        }
    }

    public double calculateTotalSales() {
        double totalSales = 0.0;
        for (int i = 0; i < numDays; i++) {
            for (int j = 0; j < numProducts; j++) {
                totalSales += salesData[i][j];
            }
        }
        return totalSales;
    }

    public int findBestSellingProduct() {
        double[] productTotals = new double[numProducts];
        for (int i = 0; i < numDays; i++) {
            for (int j = 0; j < numProducts; j++) {
                productTotals[j] += salesData[i][j];
            }
        }

        int bestSellingProduct = 0;
        double maxSales = productTotals[0];
        for (int i = 1; i < numProducts; i++) {
            if (productTotals[i] > maxSales) {
                maxSales = productTotals[i];
                bestSellingProduct = i;
            }
        }
        return bestSellingProduct;
    }

    public void generateSalesReport(int startDay, int endDay) {
        if (startDay >= 0 && endDay < numDays && startDay <= endDay) {
            System.out.println("Sales Report from Day " + startDay + " to Day " + endDay + ":");
            for (int i = startDay; i <= endDay; i++) {
                System.out.print("Day " + i + ": ");
                for (int j = 0; j < numProducts; j++) {
                    System.out.print("Product " + j + ": " + salesData[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid period specified.");
        }
    }
}
public class Task2 {
    public static void main(String[] args) {
        SalesDataAnalysis salesDataAnalysis = new SalesDataAnalysis(7, 3);

        salesDataAnalysis.recordSales(0, 0, 150.0);
        salesDataAnalysis.recordSales(0, 1, 200.0);
        salesDataAnalysis.recordSales(0, 2, 250.0);
        salesDataAnalysis.recordSales(1, 0, 300.0);
        salesDataAnalysis.recordSales(1, 1, 100.0);
        salesDataAnalysis.recordSales(1, 2, 400.0);
      
        double totalSales = salesDataAnalysis.calculateTotalSales();
        System.out.println("Total Sales: " + totalSales);

        int bestSellingProduct = salesDataAnalysis.findBestSellingProduct();
        System.out.println("Best-Selling Product: Product " + bestSellingProduct);

        salesDataAnalysis.generateSalesReport(0, 1);
    }
}