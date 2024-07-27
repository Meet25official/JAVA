// Scenario 2: Stock Market Analysis
// In a stock market analysis system, define a base class called "Stock" with a method called "getStockData" that returns an instance of the "Stock" class. Implement derived classes like "TechStock" and "PharmaStock" that override the "getStockData" method and return their specific stock data objects.

class Stock {
    private String symbol;
    private double price;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public Stock getStockData() {
        return this;
    }

    @Override
    public String toString() {
        return "Stock ----> Symbol=" + symbol + ", Price=" + price;
    }
}

class TechStock extends Stock {
    private String techCategory;

    public TechStock(String symbol, double price, String techCategory) {
        super(symbol, price);
        this.techCategory = techCategory;
    }

    @Override
    public TechStock getStockData() {
        return this;
    }

    @Override
    public String toString() {
        return "TechStock ----> Symbol=" + getSymbol() + ", Price=" + getPrice() + ", Tech Category=" + techCategory;
    }
}

class PharmaStock extends Stock {
    private String pharmaCategory;

    public PharmaStock(String symbol, double price, String pharmaCategory) {
        super(symbol, price);
        this.pharmaCategory = pharmaCategory;
    }

    @Override
    public PharmaStock getStockData() {
        return this;
    }

    @Override
    public String toString() {
        return "PharmaStock ----> Symbol=" + getSymbol() + ", Price=" + getPrice() + ", Pharma Category=" + pharmaCategory;
    }
}
public class T2 {
    public static void main(String[] args) {
        Stock techStock = new TechStock("AAPL", 150.00, "Consumer Electronics");
        Stock pharmaStock = new PharmaStock("PFE", 40.00, "Vaccines");

        System.out.println(techStock.getStockData());
        System.out.println(pharmaStock.getStockData());
    }
}
