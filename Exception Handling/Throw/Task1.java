// 1. Custom Exception in Banking System: Develop a simplified banking system in Java that utilizes custom exceptions using the 'throw' keyword. Implement scenarios where 'throw' is used to handle insufficient balance or invalid transaction exceptions.

class InvalidBankBalance extends Exception {
    public InvalidBankBalance(String message) {
        super(message);
    }
}

class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! New balance: " + balance);
    }

    public void withdraw(double amount) throws InvalidBankBalance {
        if (amount > balance) {
            throw new InvalidBankBalance("Attempted to withdraw " + amount + " but only " + balance + " is available.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Bank myBank = new Bank(1000.0); 

        try {
            System.out.println("Current balance: " + myBank.getBalance());
            myBank.deposit(500.0); 
            myBank.withdraw(200.0); 
        } catch (InvalidBankBalance e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
