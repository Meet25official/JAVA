// Scenario 1: E-commerce Product Search
// In an e-commerce product search application, create a base class called "Product" with a method called "search" that returns an instance of the "Product" class. Implement derived classes like "ElectronicsProduct" and "ClothingProduct" that override the "search" method and return their specific product objects.

class Product {
    protected String name;

    public Product(String name){
        this.name = name;
    }

    public Product search(){
        return this;
    }

    public String toString(){
        return "product: " + name;
    }
}

class ElectronicsProduct extends Product {
    public ElectronicsProduct(String name) {
        super(name);
    }

    public ElectronicsProduct search() {
        return this;
    }

    public String toString() {
        return "Electronics Product: " + name;
    }
}

class ClothingProduct extends Product {
    public ClothingProduct(String name) {
        super(name);
    }

    public ClothingProduct search() {
        return this;
    }

    public String toString() {
        return "Clothing Product: " + name;
    }
}
public class T1 {
    public static void main(String[] args) {
        Product genericProduct = new Product("Generic");
        ElectronicsProduct phone = new ElectronicsProduct("Smartphone");
        ClothingProduct shirt = new ClothingProduct("T-Shirt");

        System.out.println(genericProduct.search());
        System.out.println(phone.search());
        System.out.println(shirt.search());
    }
}


