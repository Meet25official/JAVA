// /Scenario 2: Sales Data Analysis
// In a retail business, create an array to store the daily sales data for different products. Perform operations such as calculating the total sales, finding the best-selling product, and generating a sales report for a specific period.

class Item{
    private String name;
    private int total;
    private double price;

    public Item(String name , int total , double price){
        this.name = name;
        this.total = total;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display(){
        System.out.println("The name of this Item is :- "+name);
        System.out.println("The price of this Item is :- "+price);
        System.out.println("The Total Sales of this Item is :- "+total);
        System.out.println("-------------------------------------------------------------");
    }
}

class Sales{
    Item items[];
    int count;

    public Sales(int capacity){
        items = new Item[capacity];
        count = 0;
    }

    public void addSales(String name , int total , double price){
        if (count < items.length){
            items[count++] = new Item(name, total, price);
            System.out.println("The Item added succesfuly.");
        }
        else{
            System.out.println("The capacity is Full.");
        }
    }

    public void totalSales(){
        double total = 0;
        for (int i = 0; i < count; i++) {
            total = items[i].getTotal();
        }
        System.out.println("The total sales of this Shope is :- "+total);
    }

    public void displayAll(){
        for (int i = 0; i < count; i++) {
            items[i].display();
        }
    }

    public void highestSales(){
        int target = 0;
        String pname = "";
        for(int i = 0; i < count; i++) {
           if(target < items[i].getTotal()){
                target = items[i].getTotal();
                pname = items[i].getName();
           } 
        }
        System.out.println("The Highest sales of Items name is :- "+pname);
        System.out.println("And this Item total sales is :- "+target);
    }
}

public class Task2 {
    public static void main(String[] args) {    
        Sales obj = new Sales(10);
        obj.addSales("TV", 34, 8500);
        obj.addSales("Shirt-Paint", 67, 1000);
        obj.addSales("T-Shirt", 23, 450);
        obj.addSales("Phone", 12, 20000);
        obj.addSales("Books", 97, 230);

        obj.displayAll();
        obj.highestSales();
        System.out.println("----------------------------------------------------------------");
        obj.totalSales();
    }
}