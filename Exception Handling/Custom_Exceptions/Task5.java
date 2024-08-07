// 5. E-Commerce Platform: Product Out of Stock Exception

// Problem Statement:
// In an e-commerce platform, handle cases where a product is out of stock. Create a custom exception `ProductOutOfStockException` to represent this situation.

class ProductOutOfStockException extends Exception {
    public ProductOutOfStockException(String message) {
        super(message);
    }
}
class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock() {
        stock--;
    }
}

class ECommercePlatform {
    private Product[] products;

    public ECommercePlatform() {
        products = new Product[] {
            new Product("ProductA", 100),
            new Product("ProductB", 0)
        };
    }

    public void purchaseProduct(String productName) throws ProductOutOfStockException {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                if (product.getStock() > 0) {
                    product.reduceStock();
                    System.out.println("Product " + productName + " purchased successfully.");
                } else {
                    throw new ProductOutOfStockException("Product " + productName + " is out of stock.");
                }
                return;
            }
        }
        throw new ProductOutOfStockException("Product " + productName + " is not found.");
    }
}
public class Task5 {
    public static void main(String[] args) {
        ECommercePlatform platform = new ECommercePlatform();
        String productName = "ProductB";

        try {
            platform.purchaseProduct(productName);
        } catch (ProductOutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
