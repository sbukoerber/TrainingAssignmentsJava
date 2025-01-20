package Q2;

public class Assignment2 {
    public static void main(String[] args) {
        Account account = new Account();

        Bank bank = new Bank();
        Company company = new Company();

        Thread bankThread = new Thread(() -> bank.withdraw(account));
        Thread companyThread = new Thread(() -> company.deposit(account));

        bankThread.start();
        companyThread.start();

        try {
            bankThread.join();
            companyThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}
