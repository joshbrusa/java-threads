package src;

public class Main {
    public static void main(String[] args) {
        // create a new bank account with some amount
        BankAccount bankAccount = new BankAccount(0);

        // create multiple threads for deposit and withdrawal transactions
        DepositThread depositThread1 = new DepositThread(bankAccount, 100);
        DepositThread depositThread2 = new DepositThread(bankAccount, 100);
        WithdrawThread withdrawThread1 = new WithdrawThread(bankAccount, 100);
        WithdrawThread withdrawThread2 = new WithdrawThread(bankAccount, 200);

        // start the threads
        depositThread1.run();
        depositThread2.run();
        withdrawThread1.run();
        withdrawThread2.run();
    }
}
