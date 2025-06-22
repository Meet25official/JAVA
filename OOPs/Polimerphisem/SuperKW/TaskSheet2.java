//Scenario 2: Online Shopping
//In an online shopping system, create a base class called "Product" with a method called "displayDetails" that shows general product information. Implement derived classes like "Electronics" and "Clothing" that override the "displayDetails" method and use the super keyword to display both general and specific product details.

class Product{
    String name;
    double price;

    Product(String name , double price){
        this.name = name;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Electronics extends Product{

    Electronics(String name , double price){
        super(name, price);
    }

    @Override
    public void displayDetails(){
        System.out.println("Electronic Product");
        super.displayDetails();
    }
}

class Clothing extends Product{

    Clothing(String name , double price){
        super(name, price);
    }

    @Override
    public void displayDetails(){
        System.out.println("The product is Clothing Items :- ");
        super.displayDetails();
    }
}
public class TaskSheet2 {
    public static void main(String[] args) {
        Electronics obj = new Electronics("Bulb",230);
        Clothing obj2 = new Clothing("Pant" , 999);
        obj.displayDetails();
        obj2.displayDetails();
    }  
}
