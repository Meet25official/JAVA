//Scenario 2: Bank Account System
//In a bank account system, have a base class called "Account" with a method called "calculateInterest." Implement derived classes like "SavingsAccount" and "CurrentAccount" that override the "calculateInterest" method to provide interest calculation specific to each account type.

class Account{
    public void calculateInterest(){
        System.out.println("The account have calculateInterest :- ");
    }
}

class SavingsAccount extends Account{
    @Override
    public void calculateInterest(){
        System.out.println("The interest in saving account is 7%");
    }
}

class CurrentAccount extends Account{
    @Override
    public void calculateInterest(){
        System.out.println("The interest in current account is 8%");
    }
}

public class TaskSheet2 {
    public static void main(String[] args) {
        SavingsAccount obj = new SavingsAccount();
        CurrentAccount obj2 = new CurrentAccount();
        obj.calculateInterest();
        obj2.calculateInterest();
    }  
}
