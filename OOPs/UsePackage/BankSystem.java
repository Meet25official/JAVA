import bank.Account;
import bank.Transaction;

public class BankSystem {
         public static void main(String[] args) {
        Account father = new Account("123456789", "AnilBhai", 100000);
        Account son = new Account("987654321", "Himesh Kumar", 50000);

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
