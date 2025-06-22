//Scenario 3: E-commerce Product Search
//In an e-commerce product search application, create a base class called "Product" with a method called "search" that returns an instance of the "Product" class. Implement derived classes like "ElectronicsProduct" and "ClothingProduct" that override the "search" method and return their specific product objects.

class Product{
    Product search(){
        System.out.println("The Product have many types of Products.");
        return this;
    }
}

class ElectronicsProduct extends Product{
    private String name;
    private double price;

    public ElectronicsProduct(String name , double price){
        this.name = name;
        this.price = price;
    }

    @Override
    ElectronicsProduct search(){
        System.out.println("The name of Electronics Product is :- "+name+" and their price is :- "+price);
        return this;
    }
}


class ClothingProduct extends Product{
    private String name;
    private double price;

    public ClothingProduct(String name , double price){
        this.name = name;
        this.price = price;
    }

    @Override
    ClothingProduct search(){
        System.out.println("The name of Clothing Product is :- "+name+" and their price is :- "+price);
        return this;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Product obj = new Product();
        obj.search();

        ElectronicsProduct obj2 = new ElectronicsProduct("TV", 8500.0);
        obj2.search();

        ClothingProduct obj3 = new ClothingProduct("Paint", 899.0);
        obj3.search();
    }  
}