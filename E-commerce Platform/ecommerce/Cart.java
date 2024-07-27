package ecommerce;

public class Cart {
    private Product[] products;
    private int count;

    public Cart(int capacity) {
        this.products = new Product[capacity];
        this.count = 0;
    }

    public void addProduct(Product product) {
        if (count < products.length) {
            products[count] = product;
            count++;
        } else {
            System.out.println("Cart is full");
        }
    }

    public void removeProduct(Product product) {
        for (int i = 0; i < count; i++) {
            if (products[i].equals(product)) {
                products[i] = products[count - 1];
                products[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Product not found in cart");
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (int i = 0; i < count; i++) {
            total += products[i].getPrice() * products[i].getQuantity();
        }
        return total;
    }

    public Product[] getProducts() {
        Product[] currentProducts = new Product[count];
        System.arraycopy(products, 0, currentProducts, 0, count);
        return currentProducts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cart{products=[");
        for (int i = 0; i < count; i++) {
            sb.append(products[i]);
            if (i < count - 1) sb.append(", ");
        }
        sb.append("]}");
        return sb.toString();
    }
}
