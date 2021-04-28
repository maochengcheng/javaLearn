package com.chuancheng.corejava.thread.AQS;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author maochengcheng
 * @date 2021/3/17 0017
 */
public class LockDemo {
   static Lock lock = new ReentrantLock(); //重入锁，可以解决死锁
    public static int count= 0;
    public static void incr(){
        try {
            lock.lock(); // 获得锁
            Thread.sleep(1);
            decr();
            count++;  //只会由一个线程来执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock(); //释放锁
        }

    }

    public static void decr(){
        lock.lock();   // 有需要争抢锁，线程A（不需要争抢锁，记录重入次数即可）
        count--;
        lock.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0;i<1000;i++){
            new Thread(LockDemo::incr).start();
        }
        Thread.sleep(4000);
        System.out.println("result:"+count);
    }
}
