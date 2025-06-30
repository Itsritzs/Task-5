public class Main {
    public static void main(String[] args) {
        Account acc = new Account("John Doe");

        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(1000);  // Should show insufficient balance
        acc.deposit(-50);    // Should show invalid deposit
        acc.printTransactionHistory();
    }
}
