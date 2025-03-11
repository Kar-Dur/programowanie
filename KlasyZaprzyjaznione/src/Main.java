import bank.BankManager;

public class Main {
    public static void main(String[] args) {
        BankManager manager = new BankManager();
        var account = manager.createAccount("Jan Kowalski", 1500.00);
        manager.printAccountDetails(account);
    }
}