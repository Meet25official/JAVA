//Scenario 4: Stock Market Analysis
//In a stock market analysis system, define a base class called "Stock" with a method called "getStockData" that returns an instance of the "Stock" class. Implement derived classes like "TechStock" and "PharmaStock" that override the "getStockData" method and return their specific stock data objects.

class Stock{
    Stock getStockData(){
        System.out.println("The stokes have many types :- ");
        return this;
    }
}

class TechStock extends Stock{
    private String name;
    private double price;
    private int quntity;

    public TechStock(String name , double price , int quntity){
        this.name = name;
        this.price = price;
        this.quntity = quntity;
    }

    @Override
    TechStock getStockData(){
        System.out.println("There are Techincal Company limited Stocks :- ");
        System.out.println("The name of this company is :- "+name);
        System.out.println("The price of this stocks is :- "+price);
        System.out.println("The quntity of this stocks is :- "+quntity);
        return this;
    }
}

class PharmaStock extends Stock{
    private String name;
    private double price;
    private int quntity;

    public PharmaStock(String name , double price , int quntity){
        this.name = name;
        this.price = price;
        this.quntity = quntity;
    }

    @Override
    PharmaStock getStockData(){
        System.out.println("There are Pharma or medical Company limited Stocks :- ");
        System.out.println("The name of this company is :- "+name);
        System.out.println("The price of this stocks is :- "+price);
        System.out.println("The quntity of this stocks is :- "+quntity);
        return this;
    }
}


public class Task4 {
    public static void main(String[] args) {
        Stock obj = new Stock();
        obj.getStockData();

        TechStock obj2 = new TechStock("Reliance Pvt Ltd", 1300.0, 20);
        obj2.getStockData();

        PharmaStock obj3 = new PharmaStock("Torrent Pvt Ltd", 1500.0, 45);
        obj3.getStockData();
    }  
}
