// Scenario 3: E-commerce Product Search
// In an e-commerce product search application, create a base class called "Product" with a method called "search" that returns an instance of the "Product" class. Implement derived classes like "ElectronicsProduct" and "ClothingProduct" that override the "search" method and return their specific product objects.

class Product {
    public Product search(String query) {
        System.out.println("Searching for product...");
        return new Product();
    }

    public void displayProductInfo() {
        System.out.println("Displaying product information...");
    }
}
class ElectronicsProduct extends Product {
    @Override
    public Product search(String query) {
        System.out.println("Searching for electronics product...");
        return new ElectronicsProduct();
    }

    public void displayElectronicsProductInfo() {
        System.out.println("Displaying electronics product information...");
    }
}
class ClothingProduct extends Product {
    @Override
    public Product search(String query) {
        System.out.println("Searching for clothing product...");
        return new ClothingProduct();
    }

    public void displayClothingProductInfo() {
        System.out.println("Displaying clothing product information...");
    }
}
public class Task3 {
    public static void main(String[] args) {
        Product electronicsProduct = new ElectronicsProduct().search("TV");
        Product clothingProduct = new ClothingProduct().search("T-shirt");

        electronicsProduct.displayProductInfo();
        if (electronicsProduct instanceof ElectronicsProduct) {
            ((ElectronicsProduct) electronicsProduct).displayElectronicsProductInfo();
        }

        clothingProduct.displayProductInfo();
        if (clothingProduct instanceof ClothingProduct) {
            ((ClothingProduct) clothingProduct).displayClothingProductInfo();
        }
    }
}
