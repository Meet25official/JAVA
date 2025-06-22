// Scenario 2: Bank Account System
// In a bank account system, have a base class called "Account" with a method called "calculateInterest." Implement derived classes like "SavingsAccount" and "CurrentAccount" that override the "calculateInterest" method to provide interest calculation specific to each account type.

class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        return 0.0;
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * (interestRate / 100);
    }
}

class CurrentAccount extends Account {
    protected double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0.0;
    }
}
public class Task2 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(120000.00, 7.0); 
        CurrentAccount current = new CurrentAccount(100000.00, 10000.00); 

        System.out.println("Savings Account Interest: $" + savings.calculateInterest());
        System.out.println("Current Account Interest: $" + current.calculateInterest());
    }
}
