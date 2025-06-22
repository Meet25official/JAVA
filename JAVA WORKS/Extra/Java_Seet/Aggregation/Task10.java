// Scenario 10: Bank Customer Account Management
// Design a bank account management system where a customer can have multiple bank accounts. The customer class contains a list of account objects, representing an aggregation relationship.

class BankAccount {
    String accountNumber;
    String accountType;
    double balance;

    public BankAccount(String accountNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    @Override
    public String toString() {
        return "accountNumber= " + accountNumber + ", accountType= " + accountType + ", balance= " + balance;
    }
}

class Customer {
    String name;
    String customerId;
    private BankAccount[] accounts;
    private int count;

    public Customer(String name, String customerId, int maxAccounts) {
        this.name = name;
        this.customerId = customerId;
        this.accounts = new BankAccount[maxAccounts];
        this.count = 0;
    }

    public void addAccount(BankAccount account) {
        if (count < accounts.length) {
            accounts[count++] = account;
        } else {
            System.out.println(name + " has reached the maximum number of bank accounts.");
        }
    }

    public void printAccounts() {
        System.out.println(name + "'s bank accounts:");
        for (int i = 0; i < count; i++) {
            System.out.println(accounts[i]);
        }
    }

    public double getTotalBalance() {
        double totalBalance = 0;
        for (int i = 0; i < count; i++) {
            totalBalance += accounts[i].balance;
        }
        return totalBalance;
    }
}
public class Task10 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Meet", "C001", 3);

        BankAccount account1 = new BankAccount("A123456789", "Checking", 150000.00);
        BankAccount account2 = new BankAccount("A987654321", "Savings", 2000000.00);

        customer1.addAccount(account1);
        customer1.addAccount(account2);

        customer1.printAccounts();

        System.out.println(customer1.name + "'s total balance: $" + customer1.getTotalBalance());
    }
}
