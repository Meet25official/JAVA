// Scenario 3: Online Banking Application
// In an online banking application, encapsulate the "Account" class's balance and transaction history to protect the customer's financial information and ensure that interactions with the account are performed through controlled methods.

class Account {
    private double balance;
    private String[] transactionHistory;
    private int transactionCount;

    public Account(double initialBalance) {
        this.balance = initialBalance;
        this.transactionHistory = new String[100]; 
        this.transactionCount = 0;
        addTransaction("Initial balance: " + initialBalance);
    }

    private void addTransaction(String transaction) {
        if (transactionCount < transactionHistory.length) {
            transactionHistory[transactionCount++] = transaction;
        } else {
            System.out.println("Transaction history is full.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            addTransaction("Withdrew: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    public String[] getTransactionHistory() {
        String[] history = new String[transactionCount];
        for (int i = 0; i < transactionCount; i++) {
            history[i] = transactionHistory[i];
        }
        return history;
    }

    public void displayAccountDetails() {
        System.out.println("Current Balance: " + balance);
        System.out.println("Transaction History:");
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactionHistory[i]);
        }
    }
}
public class Task3 {
    public static void main(String[] args) {
        Account account = new Account(1000.0);

        account.deposit(500.0);
        account.withdraw(200.0);
        account.displayAccountDetails();
    }
}
