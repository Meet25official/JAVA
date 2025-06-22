//Scenario 5: Bank Account Inheritance
//Create a bank account hierarchy with a base class called "Account" and derived classes like "SavingsAccount" and "CheckingAccount." The base class can define common attributes and methods, while the derived classes can have additional features specific to their account types.


class Account{
    private int acc_no;
    private String name;
    private double balance;

    public Account(int acc_no , String name , double balance){
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;
    }

    void display(){
        System.out.println("Account No :- "+acc_no);
        System.out.println("Account Holder's name :- "+name);
        System.out.println("Account Balance :- "+balance);
    }
}

class SavingsAccount extends Account{
    private float intrest;

    public SavingsAccount(int acc_no , String name , double balance,float intrest ){
        super(acc_no, name, balance);
        this.intrest = intrest;
    }

    void displaySaving(){
        super.display();
        System.out.println("The interest rate of the saving accout is :- "+intrest+"% per year");
    }
}

class CheckingAccount extends Account{
    private float intrest;

    public CheckingAccount(int acc_no , String name , double balance,float intrest ){
        super(acc_no, name, balance);
        this.intrest = intrest;
    }

    void displaycheking(){
        super.display();
        System.out.println("The interest rate of the Cheking accout is :- "+intrest+"% per year");
    }
}

public class Task5 {
    public static void main(String[] args) {
        SavingsAccount obj = new SavingsAccount(123, "Himesh", 100000.0, 7.6f);
        obj.displaySaving();
        CheckingAccount obj2 = new CheckingAccount(456, "Dhruv", 23000.0, 6.8f);
        obj2.displaycheking();

    }
}
