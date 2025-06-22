/*
In a banking application, an account should not allow transactions that would result in an overdraft (i.e., the account balance falls below zero). If a user tries to withdraw more money than they have in their account, you want to handle this situation gracefully.

Custom Exception:
We'll create a custom exception called InsufficientFundsException to represent this specific error condition.
*/

//Custom Exception Class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount > balance) {
            throw new InsufficientFundsException("Attempted to withdraw " + amount + " but only " + balance + " is available.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: " + balance);
    }
}

public class Custom_Exceptions {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(100);
            account.withdraw(150);
        } catch (InsufficientFundsException e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}