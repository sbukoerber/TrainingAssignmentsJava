package Q2;

public class Account {
    private double balance;

    public synchronized void addAmount(double amount) {
        balance += amount;
    }

    public synchronized void subtractAmount(double amount) {
        balance -= amount;
    }

    // getter and setter for balance
    public double getBalance() {
        return balance;
    }
}
