import bank.*;

public class Bank {
    public static void main(String[] args) {
        BankAccount bro = new BankAccount("123456789", "bob", 10000);
        BankAccount bro2 = new BankAccount("987654321", "jeck", 5000);

        System.out.println("Initial balances: ");
        System.out.println(bro.getAccountHolder() + ": " + bro.getBalance());
        System.out.println(bro2.getAccountHolder() + ": " + bro2.getBalance());

        Transaction transaction = new Transaction();
        transaction.transfer(bro, bro2, 5000);

        System.out.println("Final balances after transfer: ");
        System.out.println(bro.getAccountHolder() + ": " + bro.getBalance());
        System.out.println(bro2.getAccountHolder() + ": " + bro2.getBalance());
    }
}
