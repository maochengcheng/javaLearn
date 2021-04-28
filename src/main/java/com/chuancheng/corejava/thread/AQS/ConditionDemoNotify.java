package com.chuancheng.corejava.thread.AQS;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author maochengcheng
 * @date 2021/3/18 0018
 */
public class ConditionDemoNotify extends Thread{

    private Lock lock;
    private Condition condition;

    public ConditionDemoNotify(Lock lock, Condition condition) {
        this.lock = lock;
        this.condition = condition;
    }

    @Override
    public void run() {
        System.out.println("begin-ConditionDemoNotify");
        try {
            lock.lock();
            condition.signal();
            System.out.println("end-ConditionDemoNotify");
        } finally {
            lock.unlock();
        }
    }
}
