package Q2;

public class Bank {
    public void withdraw(Account account) {
        for (int i = 0; i < 100; i++) {
            account.subtractAmount(1000);
        }
    }
}
