//Scenario 10: Bank Customer Account Management
//Design a bank account management system where a customer can have multiple bank accounts. The customer class contains a list of account objects, representing an aggregation relationship.

import java.util.Scanner;

class Bank{
    private int acc_no;
    private String name;
    private double balance;

    public Bank(int acc_no , String name, double balance){
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;
    }

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

    public void display(){
        System.out.println("Account No.     :- "+acc_no);
        System.out.println("Holder's  name  :- "+name);
        System.out.println("Account Balance :- "+balance);
    }
}

class Accounts{
    Bank banks[];
    int count;

    public Accounts(int capacity){
        banks = new Bank[capacity];
        count = 0;
    }

    public void addAccounts(int acc_no , String name , double balance){
        if(count < banks.length){
            banks[count++] = new Bank(acc_no , name , balance);
            System.out.println("Account added succesfull");
        }else{
            System.out.println("The capacity is full.");
        }
    }

    public void removeAccounts(int acc_no){
        for (int i = 0; i < count; i++) {
            if (banks[i].getAcc_no() == acc_no){
                for(int j = i; j< count-1 ; j++){
                    banks[j] = banks[j+1];
                }
                count--;
                System.out.println("Account removed succecfully.");
                return;
            }
            else{
                System.out.println("The Account is not available in this library.");
            }
        }
    }

    public void updateAccounts(int acc_no){
        for (int i = 0; i < count; i++) {
            if (banks[i].getAcc_no() == acc_no){
                int choice;
                do{
                    Scanner sc = new Scanner(System.in);
                    System.out.println("1------------>Account Number");
                    System.out.println("2------------>Account's Name");
                    System.out.println("3------------>Account's Balance");  
                    System.out.println("0------------>exit");
                    System.out.println("Enter your choice :- ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1: System.out.println("Enter the new Account Number :- ");
                                sc.nextLine();
                                int ac = sc.nextInt();
                                banks[i].setAcc_no(ac);
                                break;
                        case 2: System.out.println("Enter the new Account's Name :- ");
                                sc.nextLine();
                                String n = sc.nextLine();
                                banks[i].setName(n);
                                break;
                        case 3: System.out.println("Enter the new Account's Balance :- ");
                                sc.nextLine();
                                double bal = sc.nextDouble();
                                banks[i].setBalance(bal);
                                sc.close();
                                break;    
                        case 0: break;            
                        default:System.out.println("Invailid Choice!!!");
                            break;
                    }
                } while (choice != 0);
                System.out.println("The Account updated succesfully.");
                return;
            }
        }
    }

    public void displayAllAccounts(){
        for (int i = 0; i < count; i++) {
            banks[i].display();
            System.out.println("------------------------------------------------------");
        }
    }

}

public class Task10 {
    public static void main(String[] args) {
        Accounts obj = new Accounts(10);
            obj.addAccounts(1 , "Himesh" , 100000);
            obj.addAccounts(2 , "Shrey" , 200000);
            obj.addAccounts(3 , "Dhruv" , 300000);
            obj.addAccounts(4 , "Mohak" , 400000);
            obj.addAccounts(5 , "Meet" ,500000);
            obj.displayAllAccounts();
            obj.removeAccounts(3);
            obj.displayAllAccounts();
            obj.updateAccounts(2);
            obj.displayAllAccounts();
    }
}