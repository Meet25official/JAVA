// Scenario 4: Online Ordering System
// Design an interface called "OrderProcessor" with methods like "placeOrder" and "cancelOrder." Implement classes like "CreditCardProcessor" and "PayPalProcessor" that provide specific implementations for these interface methods.

interface OrderProcessor {
    void placeOrder(double amount);
    void cancelOrder(int orderId);
}

class CreditCardProcessor implements OrderProcessor {
    @Override
    public void placeOrder(double amount) {
        System.out.println("Placing order with Credit Card for amount: $" + amount);
    }

    @Override
    public void cancelOrder(int orderId) {
        System.out.println("Cancelling Credit Card order with ID: " + orderId);
    }
}

class PayPalProcessor implements OrderProcessor {
    @Override
    public void placeOrder(double amount) {
        System.out.println("Placing order with PayPal for amount: $" + amount);
    }

    @Override
    public void cancelOrder(int orderId) {
        System.out.println("Cancelling PayPal order with ID: " + orderId);
    }
}
public class Task4 {
    public static void main(String[] args) {
        OrderProcessor creditCardProcessor = new CreditCardProcessor();
        creditCardProcessor.placeOrder(150.00);
        creditCardProcessor.cancelOrder(101);

        OrderProcessor payPalProcessor = new PayPalProcessor();
        payPalProcessor.placeOrder(200.00);
        payPalProcessor.cancelOrder(102);
    }
}
