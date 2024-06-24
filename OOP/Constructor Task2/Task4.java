// 4. Bank Account Class: Create a `BankAccount` class with a constructor to initialize an account with an account number and balance.

class BankAccount {
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
}
public class Task4 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 1000.0);
        
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());
    }
}
