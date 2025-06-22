/*
Tasks:

--> Problem Statement 1: Sales Data Aggregation

Context:
You are working for a retail company that has multiple stores. Each store records its sales data, which includes the sales amount and the date of the sale. Your task is to write a Java program that aggregates the sales data to provide insights such as total sales, average sales per day, and total sales for each store.

Requirements:
1. Create a `Store` class that contains a list of `Sale` objects. Each `Sale` object should have attributes such as `date` (of type `LocalDate`) and `amount` (of type `double`).
2. Write methods in the `Store` class to:
   - Calculate the total sales for the store.
   - Calculate the average sales per day for the store.
   - Group sales data by month and calculate the total sales for each month.
3. Write a `RetailCompany` class that contains a list of `Store` objects.
4. Write methods in the `RetailCompany` class to:
   - Calculate the total sales for the company.
   - Calculate the average sales per store.
   - Find the store with the highest total sales.

Example Usage:

Store store1 = new Store();
store1.addSale(new Sale(LocalDate.of(2023, 1, 1), 100.0));
store1.addSale(new Sale(LocalDate.of(2023, 1, 2), 150.0));

Store store2 = new Store();
store2.addSale(new Sale(LocalDate.of(2023, 1, 1), 200.0));
store2.addSale(new Sale(LocalDate.of(2023, 1, 2), 250.0));

RetailCompany company = new RetailCompany();
company.addStore(store1);
company.addStore(store2);

System.out.println("Total sales for the company: " + company.getTotalSales());
System.out.println("Average sales per store: " + company.getAverageSalesPerStore());
System.out.println("Store with the highest sales: " + company.getTopStore().getTotalSales());

 */
import java.time.LocalDate;

class Sales{
    private LocalDate date;
    private double amount;

    public Sales(LocalDate date , double amount){
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate(){
        return date;
    }

    public double getAmount(){
        return amount;
    }
}

class Strore{
    private Sales sale[];
    private int capacity;
    private int count;
    private Strore(int capacity){
        this.capacity = capacity;
        this.sale = new Sales[this.capacity];
        count = 0;
    }

    public void addSale(Sales sale1){
        if (count <= capacity) {
            sale[count] = sale1;
            count++;
        }
        else{
            System.out.println("The capacity is full!!!");
        }
    }


}

public class Task1 {
    public static void main(String[] args){
            
    }
}