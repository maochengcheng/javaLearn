package com.chuancheng.corejava.thread.AQS;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author maochengcheng
 * @date 2021/3/18 0018
 */
public class ConditionDemoWait extends Thread{

    private Lock lock;
    private Condition condition;

    public ConditionDemoWait(Lock lock, Condition condition) {
        this.lock = lock;
        this.condition = condition;
    }

    @Override
    public void run() {
        System.out.println("begin-ConditionDemoWait");
        try {
            lock.lock();
            condition.await();
            System.out.println("end-ConditionDemoWait");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
