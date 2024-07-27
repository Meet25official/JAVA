package ecommerce;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("1", "Laptop", 1000.00, 1);
        Product product2 = new Product("2", "Mouse", 25.00, 2);

        Cart cart = new Cart(10); 
        cart.addProduct(product1);
        cart.addProduct(product2);

        Order order = new Order("101", cart);

        System.out.println(order);
        System.out.println("Total Price: $" + cart.getTotalPrice());
    }
}

