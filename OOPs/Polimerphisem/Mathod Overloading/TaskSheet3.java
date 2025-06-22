//Scenario 1: Payment Processing System
// In a payment processing system, implement method overloading for processing payments. Create different methods with different parameter combinations, such as processing a credit card payment, processing a bank transfer, and processing a cash payment.

class Payment{
    public void payments(int cnum){
        System.out.println("The Credit Card number is :- "+cnum);
        System.out.println("The payment process completed succesfuly.");
    }

    public void payments(int accno , double balance){
        System.out.println("The account number is :- "+accno);
        System.out.println("The balance of this account is :- "+balance);
        System.out.println("The payment process completed succesfuly.");
    }

    public void payments(double amt){
        System.out.println("The payment amount is :- "+amt);
        System.out.println("The payment process completed succesfuly by the cash.");
    }
}

public class TaskSheet3{
    public static void main(String[] args) {
        Payment obj = new Payment();
        obj.payments(567);
        obj.payments(123, 80000);
        obj.payments(10000);
    }
}