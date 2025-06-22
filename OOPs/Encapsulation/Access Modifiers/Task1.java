//Scenario 1: Banking System
//In a banking system, use the "private" access modifier for sensitive information like customer account balances to restrict direct access to this data.

class Bank{
    private int acc_no;
    private String name;
    private double balance;

    public Bank(int acc_no, String name , double balance){
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;
    }

    public void display(){
        System.out.println("The account number is :- "+acc_no);
        System.out.println("The Account Holder's name :- "+name);
        System.out.println("The Account balance :- "+balance);
    }
    public double getBalance(){
        return balance;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Bank obj = new Bank(123, "Himesh", 23456);
        // System.out.println(obj.balance);
        // System.out.println(obj.getBalance());
        obj.display();
    }
}