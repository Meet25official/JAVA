// Scenario 18: Online Marketplace
// Create an online marketplace system with classes like "Product," "Seller," and "Buyer." Implement methods for sellers to list products, buyers to search for and purchase products, and manage transactions.

class Person {
    private String name;
    private int id;
    
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}

class Seller extends Person {
    public Seller(String name, int id) {
        super(name, id);
    }
    
    public Product listProduct(String productName, double price) {
        return new Product(productName, price, this);
    }
}

class Buyer extends Person {
    public Buyer(String name, int id) {
        super(name, id);
    }
    
    public void purchaseProduct(Product product) {
        if (product.isAvailable()) {
            Transaction transaction = new Transaction(this, product);
            transaction.completeTransaction();
        } else {
            System.out.println("Product is not available for purchase.");
        }
    }
}

class Product {
    private String productName;
    private double price;
    private Seller seller;
    private boolean available;
    
    public Product(String productName, double price, Seller seller) {
        this.productName = productName;
        this.price = price;
        this.seller = seller;
        this.available = true;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public double getPrice() {
        return price;
    }
    
    public Seller getSeller() {
        return seller;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    public void markAsSold() {
        this.available = false;
    }
    
    public String toString() {
        return "Product Name: " + productName + ", Price: $" + price + ", Seller: " + seller.getName() + ", Available: " + available;
    }
}

class Transaction {
    private Buyer buyer;
    private Product product;
    
    public Transaction(Buyer buyer, Product product) {
        this.buyer = buyer;
        this.product = product;
    }
    
    public void completeTransaction() {
        if (product.isAvailable()) {
            product.markAsSold();
            System.out.println("Transaction complete: " + buyer.getName() + " bought " + product.getProductName() + " from " + product.getSeller().getName() + " for $" + product.getPrice());
        } else {
            System.out.println("Transaction failed: Product is not available.");
        }
    }
}

public class Task18 {
    public static void main(String[] args) {
        Seller john = new Seller("John Doe", 1);
        Seller jane = new Seller("Jane Smith", 2);
        
        Buyer alice = new Buyer("Alice Johnson", 101);
        Buyer bob = new Buyer("Bob Brown", 102);
        
        Product laptop = john.listProduct("Laptop", 800.0);
        Product phone = jane.listProduct("Smartphone", 500.0);
        
        System.out.println(laptop);
        System.out.println(phone);
        
        alice.purchaseProduct(laptop); 
        bob.purchaseProduct(phone);    
        bob.purchaseProduct(laptop);   
        
        System.out.println(laptop);
        System.out.println(phone);
    }
}
