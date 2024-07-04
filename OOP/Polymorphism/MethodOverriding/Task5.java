// 5. Problem: Implement a banking system with multiple account types (savings, checking) and use method overriding to customize interest calculation for each account type.
//    - Example: Create `Account` classes for savings and checking accounts, both overriding an `calculateInterest` method.

class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public double calculateInterest() {
        return 0; 
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        double interestRate = 0.05; 
        return balance * interestRate;
    }
}

class CheckingAccount extends Account {
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return 0; 
    }
}

public class Task5 {
    public static void main(String[] args) {
        SavingsAccount savingsAcc = new SavingsAccount(1000);
        CheckingAccount checkingAcc = new CheckingAccount(2000);

        savingsAcc.deposit(500);
        checkingAcc.deposit(1000);

        System.out.println("Interest for savings account: $" + savingsAcc.calculateInterest());
        System.out.println("Interest for checking account: $" + checkingAcc.calculateInterest());

        savingsAcc.withdraw(200);
        checkingAcc.withdraw(500);

        System.out.println("Savings account balance: $" + savingsAcc.getBalance());
        System.out.println("Checking account balance: $" + checkingAcc.getBalance());
    }
}
