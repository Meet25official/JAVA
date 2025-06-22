// Scenario 3: Banking System
// Develop an abstract class called "Account" with abstract methods like "deposit" and "withdraw." Implement derived classes like "SavingsAccount" and "CurrentAccount" that provide specific implementations for these abstract methods.

abstract class Account {
    protected double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    protected double initialRate;

    public SavingsAccount(double initialBalance, double initialRate) {
        super(initialBalance);
        this.initialRate = initialRate;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }
}

class CurrentAccount extends Account {
    protected double overdraftLimmit;

    public CurrentAccount(double initialBalance, double overdraftLimmit) {
        super(initialBalance);
        this.overdraftLimmit = overdraftLimmit;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        if(this.balance - amount >= -overdraftLimmit){
            this.balance -= amount;
        }
    }
}
public class Task3 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 0.05);
        savingsAccount.deposit(200);
        savingsAccount.withdraw(50);

        CurrentAccount currentAccount = new CurrentAccount(2000, 500);
        currentAccount.deposit(300);
        currentAccount.withdraw(2500);

        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
    }
}
