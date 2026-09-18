import java.util.concurrent.locks.ReentrantLock;

import Array.DSA.oops.Ba;

class BankAccount{
    private int Balance = 1000;
    private ReentrantLock lock = new ReentrantLock();

    void withdraw(int amount){
        lock.lock();
        
        try {
            if(Balance > 0 && amount <= Balance){
              Balance = Balance - amount;
            }
            
        } finally{
            lock.unlock();
        }
        

    }

    void deposit(int amount){
        lock.lock();

        try {
            if(Balance>=0){
                Balance = Balance + amount;
            }
            
        } finally {
            lock.unlock();
        }

    }

}

public class Bank{
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        Thread t1 = new Thread(() -> {
            b.deposit(500);
        });

        Thread t2 = new Thread(() -> {
            b.withdraw(200);
        });

        Thread t3 = new Thread(() -> {
            b.deposit(500);
        });

        Thread t4 = new Thread(() -> {
            b.withdraw(600);
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
}