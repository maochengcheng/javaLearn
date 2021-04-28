package com.chuancheng.corejava.thread.extend;

/**
 * @author maochengcheng
 * @date 2021/3/20 0020
 */
public class TransferAcount01 implements Runnable{
    private Account fromAccount; //转出账户
    private Account toAccount; //转入账户
    private int amount;
    private Allocator allocator;

    public TransferAcount01(Account fromAccount, Account toAccount, int amount,Allocator allocator) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.allocator=allocator;
    }


    @Override
    public void run() {
        while(true) {
            if (allocator.apply(fromAccount, toAccount)) {//都会在这个地方获得临界资源
                try {
                    synchronized (fromAccount) {
                        synchronized (toAccount) {
                            if (fromAccount.getBalance() >= amount) {
                                fromAccount.debit(amount);
                                toAccount.credbit(amount);
                            }
                        }
                        System.out.println(fromAccount.getAccountName() + "----" + fromAccount.getBalance());
                        System.out.println(toAccount.getAccountName() + "----" + toAccount.getBalance());
                    }
                }finally{
                    allocator.free(fromAccount,toAccount);
                }
            }
        }
    }
}
