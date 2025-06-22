//Scenario 1: Payment Gateway Integration
//Design an interface called "PaymentGateway" with methods like "processPayment" and "refundPayment." Implement classes like "PayPalGateway" and "StripeGateway" that provide specific implementations for these interface methods.

interface PaymentGateway{
    void processPayment();
    void refundPayment();
}

class PayPalGateway implements PaymentGateway{
    private String username;
    private double balance;
    private double deposite;
    private double withdraw;

    public PayPalGateway(String username , double balance , double deposite , double withdraw){
        this.username = username;
        this.balance = balance;
        this.deposite = deposite;
        this.withdraw = withdraw;
    }
    @Override
    public void processPayment(){
        System.out.println("You deposite "+deposite+"Rupee in your account.");
        System.out.println("You withdraw "+withdraw+"Rupee in your account.");
        System.out.println("The final balance is :- "+(balance + deposite - withdraw));
    }

    @Override
    public void refundPayment(){
        System.out.println("This is Pay Pal Process :- ");
        System.out.println("The username is :- "+username);
        System.out.println("The process is canceled we will refund in just 5 minites");
        System.out.println("The  final balance is :- "+balance);
        System.out.println("------------------------------------------------------------------");
    }
}

class StripeGateway implements PaymentGateway{
    private String username;
    private double balance;
    private double deposite;
    private double withdraw;

    public StripeGateway(String username , double balance , double deposite , double withdraw){
        this.username = username;
        this.balance = balance;
        this.deposite = deposite;
        this.withdraw = withdraw;
    }
    @Override
    public void processPayment(){
        System.out.println("You deposite "+deposite+"Rupee in your account.");
        System.out.println("You withdraw "+withdraw+"Rupee in your account.");
        System.out.println("The final balance is :- "+(balance + deposite - withdraw));
    }

    @Override
    public void refundPayment(){
        System.out.println("This is Stripe Gate Way Process :- ");
        System.out.println("The username is :- "+username);
        System.out.println("The process is canceled we will refund in just 5 minites");
        System.out.println("The  final balance is :- "+balance);
        System.out.println("------------------------------------------------------------------");
    }
}
public class Task1 {
    public static void main(String[] args) {
        PayPalGateway obj1 = new PayPalGateway("Himesh0704", 100000, 10000, 20000);
        StripeGateway obj2 = new StripeGateway("Dhruv0312", 200000, 20000, 40000);
        obj1.processPayment();
        obj1.refundPayment();
        obj2.processPayment();
        obj2.refundPayment();        
    }
}