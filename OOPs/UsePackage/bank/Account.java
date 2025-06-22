//Scenario 1: Banking System
// Create a package called "bank" that contains classes like "Account," "Transaction," and "Customer" that are related to banking operations. Place these classes in the "bank" package to organize and group them together.


package bank;

public class Account {
    private String accountNo;
    private String accountHolder;
    private double balance;

    public Account(String accountNo, String accountHolder, double balance) {
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " Successful. New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount && (balance-amount) > 2000) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " Successful. New Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance. Withdrawal of " + amount + " Unsuccessful.");
        }
    }
}
