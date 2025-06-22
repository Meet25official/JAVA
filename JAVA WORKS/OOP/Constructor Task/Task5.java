// 5. Constructor with Validation:
//    Write a 'BankAccount' class with fields for 'accountNumber' and 'balance'. The constructor should validate that the 'balance' is not negative. If it is, set the balance to 0 and print a warning message.

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(){
        accountNumber = null;
        balance = 0.0;
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Warning: Initial balance cannot be negative. Setting balance to 0.");
        }
    }
    
    void getBankAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}
public class Task5 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", 100000.0);

        System.out.println("Details of Account 1:");
        account1.getBankAccountDetails();
    }
}
