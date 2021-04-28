package com.chuancheng.corejava.thread.extend;

/**
 * @author maochengcheng
 * @date 2021/3/20 0020
 */
public class TransferAcount implements Runnable{
    private Account fromAccount; //转出账户
    private Account toAccount; //转入账户
    private int amout;

    public TransferAcount(Account fromAccount, Account toAccount, int amout) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amout = amout;
    }


    @Override
    public void run() {
        while(true){
            synchronized(fromAccount){
                synchronized (toAccount){
                    if(fromAccount.getBalance()>=amout){
                        fromAccount.debit(amout);
                        toAccount.credbit(amout);
                    }
                }
                System.out.println(fromAccount.getAccountName()+"----"+fromAccount.getBalance());
                System.out.println(toAccount.getAccountName()+"----"+toAccount.getBalance());
            }
        }
    }
}
