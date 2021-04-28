package com.chuancheng.corejava.thread.AQS;

import java.util.concurrent.CountDownLatch;

/**
 * @author maochengcheng
 * @date 2021/3/18 0018
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        new Thread(()->{
            countDownLatch.countDown(); // 倒计时 3-1=2
            //修改state=state-1 通过cas设置到state这个字段上
        }).start();
        new Thread(()->{
            countDownLatch.countDown();// 倒计时 1-1=1
        }).start();
        new Thread(()->{
            countDownLatch.countDown();// 倒计时 1-1=0 -> 触发唤醒操作
        }).start();

        countDownLatch.await(); //阻塞主线程
        System.out.println("线程执行完毕");
    }
}
