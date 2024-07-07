// Scenario 5: Bank Account Inheritance
// Create a bank account hierarchy with a base class called "Account" and derived classes like "SavingsAccount" and "CheckingAccount." The base class can define common attributes and methods, while the derived classes can have additional features specific to their account types.

class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into account " + accountNumber);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyMonthlyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Applied monthly interest to account " + accountNumber + ": $" + interest);
    }
}
class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from checking account " + accountNumber);
        } else {
            System.out.println("Insufficient funds (including overdraft) in checking account " + accountNumber);
        }
    }
}
public class Task5 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SAV-001", 1000.0, 2.5);
        savingsAccount.deposit(500.0);
        savingsAccount.applyMonthlyInterest();
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());

        CheckingAccount checkingAccount = new CheckingAccount("CHK-001", 2000.0, 500.0);
        checkingAccount.withdraw(1500.0);
        checkingAccount.withdraw(1000.0);
        System.out.println("Checking Account Balance: $" + checkingAccount.getBalance());
    }
}
