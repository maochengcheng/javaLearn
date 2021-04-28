package com.chuancheng.corejava.thread.extend;

/**
 * @author maochengcheng
 * @date 2021/3/20 0020
 */
public class Account {
    private String accountName;
    private int balance;

    public Account(String accountName, int balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void debit(int amout){
        this.balance-=amout;
    }

    public void credbit(int amout){
        this.balance+=amout;
    }
}
