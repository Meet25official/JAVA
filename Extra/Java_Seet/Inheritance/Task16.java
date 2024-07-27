// Scenario 16: Bank Transaction System
// Develop a bank transaction system with classes like "Account," "Transaction," and "Customer." Implement methods for customers to make deposits, withdrawals, and view their account balances.

class BankEntity {
    private String name;
    
    public BankEntity(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        return name;
    }
}

class Customer extends BankEntity {
    private int customerId;
    
    public Customer(String name, int customerId) {
        super(name);
        this.customerId = customerId;
    }
    
    public int getCustomerId() {
        return customerId;
    }
}

class Account {
    private Customer customer;
    private double balance;
    
    public Account(Customer customer) {
        this.customer = customer;
        this.balance = 0.0;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
    
    public void viewBalance() {
        System.out.println("Account Balance: $" + balance);
    }
}

class Transaction {
    private Account account;
    private double amount;
    private String type; 

    public Transaction(Account account, double amount, String type) {
        this.account = account;
        this.amount = amount;
        this.type = type;
    }
    
    public void execute() {
        if ("Deposit".equals(type)) {
            account.deposit(amount);
        } else if ("Withdrawal".equals(type)) {
            account.withdraw(amount);
        } else {
            System.out.println("Invalid transaction type.");
        }
    }
    
    public String toString() {
        return type + " of $" + amount + " on account of " + account.getCustomer().getName();
    }
}
public class Task16 {
    public static void main(String[] args) {
        Customer a1 = new Customer("a1 ", 101);
        Customer b1 = new Customer("b1 ", 102);
        
        Account a1sAccount = new Account(a1);
        Account b1sAccount = new Account(b1);
        
        Transaction deposita1 = new Transaction(a1sAccount, 500.0, "Deposit");
        Transaction withdrawalb1 = new Transaction(b1sAccount, 200.0, "Withdrawal");
        
        deposita1.execute();
        withdrawalb1.execute();
        
        a1sAccount.viewBalance();
        b1sAccount.viewBalance();
    }
}
