package src;

/**
 * A deposit thread.
 */
public class DepositThread implements Runnable {
    private final BankAccount bankAccount;
    private final double amount;

    public DepositThread(BankAccount bankAccount, double amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    public void run() {
        bankAccount.deposit(this.amount);
    }
}
