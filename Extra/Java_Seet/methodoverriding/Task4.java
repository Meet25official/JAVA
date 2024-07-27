// Scenario 2: Banking Application
// In a banking application, have a base class called "Account" with a method called "calculateInterest." Implement derived classes like "SavingsAccount" and "LoanAccount" that override the "calculateInterest" method to provide interest calculation specific to each account type.

class Account {
    protected double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double calculateInterest() {
        return 0.0;
    }
}

class SavingsAccount extends Account {
    protected double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}

class LoanAccount extends Account {
    protected double loanInterestRate;

    public LoanAccount(double balance, double loanInterestRate) {
        super(balance);
        this.loanInterestRate = loanInterestRate;
    }
    @Override
    public double calculateInterest(){
        return balance * loanInterestRate;
    }
}
public class Task4 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(0, 0)
    }
}
