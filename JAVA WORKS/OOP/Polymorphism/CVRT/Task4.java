// Scenario 4: Stock Market Analysis
// In a stock market analysis system, define a base class called "Stock" with a method called "getStockData" that returns an instance of the "Stock" class. Implement derived classes like "TechStock" and "PharmaStock" that override the "getStockData" method and return their specific stock data objects.

class Stock {
    public Stock getStockData(String symbol) {
        System.out.println("Getting stock data...");
        return new Stock();
    }

    public void displayStockInfo() {
        System.out.println("Displaying stock information...");
    }
}
class TechStock extends Stock {
    @Override
    public Stock getStockData(String symbol) {
        System.out.println("Getting tech stock data for " + symbol);
        return new TechStock();
    }

    public void displayTechStockInfo() {
        System.out.println("Displaying tech stock information...");
    }
}
class PharmaStock extends Stock {
    @Override
    public Stock getStockData(String symbol) {
        System.out.println("Getting pharma stock data for " + symbol);
        return new PharmaStock();
    }

    public void displayPharmaStockInfo() {
        System.out.println("Displaying pharma stock information...");
    }
}
public class Task4 {
    public static void main(String[] args) {
        Stock techStock = new TechStock().getStockData("AAPL");
        Stock pharmaStock = new PharmaStock().getStockData("JNJ");

        techStock.displayStockInfo();
        if (techStock instanceof TechStock) {
            ((TechStock) techStock).displayTechStockInfo();
        }

        pharmaStock.displayStockInfo();
        if (pharmaStock instanceof PharmaStock) {
            ((PharmaStock) pharmaStock).displayPharmaStockInfo();
        }
    }
}
