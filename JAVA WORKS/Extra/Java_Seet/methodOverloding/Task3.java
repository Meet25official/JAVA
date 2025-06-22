// Scenario 1: Payment Processing System
// In a payment processing system, implement method overloading for processing payments. Create different methods with different parameter combinations, such as processing a credit card payment, processing a bank transfer, and processing a cash payment.

class PaymentProcessor {
    public void processPayment(String creditCardNumber, String expirationDate, double amount) {
        System.out.println("Processing credit card payment");
        System.out.println("Card Number: " + creditCardNumber);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Amount: $" + amount);
    }

    public void processPayment(String bankAccountNumber, String bankRoutingNumber, double amount, String accountHolderName) {
        System.out.println("Processing bank transfer payment");
        System.out.println("Bank Account Number: " + bankAccountNumber);
        System.out.println("Bank Routing Number: " + bankRoutingNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Amount: $" + amount);
    }

    public void processPayment(double amount) {
        System.out.println("Processing cash payment");
        System.out.println("Amount: $" + amount);
    }

    
}

public class Task3 {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.processPayment("1234-5678-9876-5432", "12/26", 15000.75);
        paymentProcessor.processPayment("123456789", "987654321", 3000.50, "bob");
        paymentProcessor.processPayment(5000.00);
    }
}
