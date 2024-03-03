package src;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Our bank account class.
 */
class BankAccount {
    private double balance;
    private final Lock lock;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }

    /**
     * Deposits some amount.
     */
    public void deposit(double amount) {
        lock.lock();
        try {
            this.balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", balance: " + balance);
        } finally {
            lock.unlock();
        }
    }

    /**
     * Withdraws some amount.
     */
    public void withdraw(double amount) {
        lock.lock();
        try {
            if (this.balance >= amount) {
                this.balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " insufficient funds for withdrawal");
            }
        } finally {
            lock.unlock();
        }
    }
}
