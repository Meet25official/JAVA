import mybank.BankAccount;
import mybank.Transaction;

public class Bank {
    public static void main(String[] args) {
        BankAccount father = new BankAccount("123456789", "Kuber", 100000);
        BankAccount son = new BankAccount("987654321", "Tusharth", 50000);

        System.out.println("Initial balances: ");
        System.out.println(father.getAccountHolder() + ": " + father.getBalance());
        System.out.println(son.getAccountHolder() + ": " + son.getBalance());

        Transaction transaction = new Transaction();
        transaction.transfer(father, son, 50000);

        System.out.println("Final balances after transfer: ");
        System.out.println(father.getAccountHolder() + ": " + father.getBalance());
        System.out.println(son.getAccountHolder() + ": " + son.getBalance());
    }
}