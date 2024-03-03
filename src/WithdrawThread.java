package src;

/**
 * A withdraw thread.
 */
public class WithdrawThread implements Runnable {
    private final BankAccount bankAccount;
    private final double amount;

    public WithdrawThread(BankAccount bankAccount, double amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    public void run() {
        bankAccount.withdraw(this.amount);
    }
}
