//Scenario 3: Online Banking Application
// In an online banking application, encapsulate the "Account" class's balance and transaction history to protect the customer's financial information and ensure that interactions with the account are performed through controlled methods.

class Account{
    protected String name;
    protected int accno;
    protected double balance;
    
    public Account(String name , int accno , double balance){
        this.name = name;
        this.accno = accno;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}

public class Task3 {
    public static void main(String[] args) {
        Account obj = new Account("Himesh Patel", 123, 56789);
        System.out.println("The account name is :- "+obj.getName());
        System.out.println("The account number is :- "+obj.getAccno());
        System.out.println("The account balance is :- "+obj.getBalance());
    }
}
