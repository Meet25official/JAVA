//5. Constructor with Validation:
// Write a 'BankAccount' class with fields for 'accountNumber' and 'balance'. The constructor should validate that the 'balance' is not negative. If it is, set the balance to 0 and print a warning message.

class BankAccount{
    private int accountNumber;
    private double balance;

    public BankAccount(int acco , double bal){
        accountNumber = acco;
        balance = bal;
    }

    void display(){
        System.out.println("The Account number is :- "+accountNumber);
        if(balance > 0){
            System.out.println("The Account balance is :- "+balance);
        }
        else{
            System.out.println("Your balance is invailid please resend money.");
        }
    }
}

public class Task5 {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount(121, 12000);
        obj.display();
    }
}