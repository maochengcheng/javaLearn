package com.chuancheng.corejava.thread.extend;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author maochengcheng
 * @date 2021/3/20 0020
 */
public class TransferAcount02 implements Runnable {
    private Account fromAccount; //转出账户
    private Account toAccount; //转入账户
    private int amount;
    Lock fromLock = new ReentrantLock();
    Lock toLock = new ReentrantLock();


    public TransferAcount02(Account fromAccount, Account toAccount, int amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }


    @Override
    public void run() {
        while (true) {
            if (fromLock.tryLock()) {
                if (toLock.tryLock())
                    if (fromAccount.getBalance() >= amount) {
                        fromAccount.debit(amount);
                        toAccount.credbit(amount);
                    }
                System.out.println(fromAccount.getAccountName() + "----" + fromAccount.getBalance());
                System.out.println(toAccount.getAccountName() + "----" + toAccount.getBalance());
            }
        }
    }
}


