package Q2;

public class Company {
    public void deposit(Account account) {
        for (int i = 0; i < 100; i++) {
            account.addAmount(1000);
        }
    }
}
