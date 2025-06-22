//Scenario 2: E-commerce Platform
//Design a package called "ecommerce" that includes classes like "Product," "Cart," and "Order" that are related to online shopping. Place these classes in the "ecommerce" package to encapsulate and manage them as a cohesive unit.\
package ecommerce;

public class Product {
    private String name;
    private double price;

    public Product(String name , double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display(){
        System.out.println("The name of this product :- "+name);
        System.out.println("The price of this product :- "+price);
    }
}