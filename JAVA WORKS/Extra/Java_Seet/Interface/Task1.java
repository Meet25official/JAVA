// Scenario 1: Payment Gateway Integration
// Design an interface called "PaymentGateway" with methods like "processPayment" and "refundPayment." Implement classes like "PayPalGateway" and "StripeGateway" that provide specific implementations for these interface methods.

interface PaymentGateway {
    void processPayment(double amount);
    void refundPayment(double amount);
}

class PayPalGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding PayPal payment of $" + amount);
    }
}

class StripeGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding Stripe payment of $" + amount);
    }
}

public class Task1 {
    public static void main(String[] args) {
        PaymentGateway paypal = new PayPalGateway();
        paypal.processPayment(100.00);
        paypal.refundPayment(50.00);

        PaymentGateway stripe = new StripeGateway();
        stripe.processPayment(200.00);
        stripe.refundPayment(75.00);
    }
}
