//Scenario 3: Banking System
//Develop an abstract class called "Account" with abstract methods like "deposit" and "withdraw." Implement derived classes like "SavingsAccount" and "CurrentAccount" that provide specific implementations for these abstract methods.

abstract class Account{
    private int acc_no;
    private String name;
    private double balance;

    public Account(int acc_no , String name , double balance){
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;
    }
    
    abstract void deposit(double amount);
    abstract void withdraw(double amt);

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends Account{
    private String type;
    
    public SavingsAccount(int acc_no , String name , double balance, String type){
        super(acc_no, name, balance);
        this.type = type;
    }
    double bal = super.getBalance();
    public void displaySav(){
        System.out.println("The account number is :- "+super.getAcc_no());
        System.out.println("The account's Holder name is :- "+super.getName());
        System.out.println("The account balance is :- "+super.getBalance());
        System.out.println("The type of this account is :- "+type);
    }

    @Override
    public void deposit(double amt1){
        bal += amt1;
        System.out.println("Your deposite amount is :- "+amt1);
        System.out.println("The total balace of this account is :- "+bal);
    }

    @Override
    public void withdraw(double amt2){
        bal -= amt2;
        System.out.println("Your wtihdraw amount is :- "+amt2);
        System.out.println("The total balance of this account is :- "+bal);
        System.out.println("--------------------------------------------------------------------------");
    }
}

class CurrentAccount extends Account{
    private String type;
    public CurrentAccount(int acc_no , String name , double balance, String type){
        super(acc_no, name, balance);
        this.type = type;
    }
    double bal2 = super.getBalance();
    public void displayCur(){
        System.out.println("The account number is :- "+super.getAcc_no());
        System.out.println("The account's Holder name is :- "+super.getName());
        System.out.println("The account balance is :- "+super.getBalance());
        System.out.println("The type of this account is :- "+type);
    }

    @Override
    public void deposit(double amt1){
        bal2 += amt1;
        System.out.println("Your deposite amount is :- "+amt1);
        System.out.println("The total balace of this account is :- "+bal2);
    }

    @Override
    public void withdraw(double amt2){
        bal2 -= amt2;
        System.out.println("Your wtihdraw amount is :- "+amt2);
        System.out.println("The total balance of this account is :- "+bal2);
        System.out.println("--------------------------------------------------------------------------");
    }
}
public class Task3 {
    public static void main(String[] args) {
        SavingsAccount obj1 = new SavingsAccount(123, "Himesh", 100000, "Saving");
        CurrentAccount obj2 = new CurrentAccount(456, "Dhruv", 200000, "Current");
        obj1.displaySav();
        obj1.deposit(50000.0);
        obj1.withdraw(75000.0);
        obj2.displayCur();
        obj2.deposit(20000.0);
        obj2.withdraw(40000.0);
    }
}