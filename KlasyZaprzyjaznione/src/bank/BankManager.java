package bank;

public class BankManager {
    public void printAccountDetails(BankAccount account) {
        System.out.println("Właściciel: " + account.getOwner());
        System.out.println("Saldo: " + account.getBalance() + " PLN");
    }

    public BankAccount createAccount(String owner, double balance) {
        return new BankAccount(owner, balance);
    }
}