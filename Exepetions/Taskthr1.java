//1. Custom Exception in Banking System: Develop a simplified banking system in Java that utilizes custom exceptions using the 'throw' keyword. Implement scenarios where 'throw' is used to handle insufficient balance or invalid transaction exceptions.



class InvalidBankBalance extends Exception{
    public InvalidBankBalance(String messege){
        super(messege);
    }
}

class Bank{
    private int accno;
    private String name;
    private double balance;

    public Bank(int accno , String name , double balance){
        this.accno = accno;
        this.name = name; 
        this.balance = balance;
    }

    public void handling(double amt) throws InvalidBankBalance{
        if ((balance - amt) >= 1000){
            System.out.println("The Account number is :- "+accno);
            System.out.println("The Account's Holder name is :- "+name);
            System.out.println("The Account new balance is :- "+balance);
            System.out.println("The debited amount is :- "+amt+" and new balance is :- "+(balance - amt));
        }
        else{
            throw new InvalidBankBalance("Your debited amount is greter than your bank balance.");
        }
    }
}

public class Taskthr1 {
    public static void main(String[] args) {
        Bank obj = new Bank(123, "Himehs", 30000);
        try {
            obj.handling(29001);
        } catch (InvalidBankBalance e) {
            e.printStackTrace();
        }
    }  
}