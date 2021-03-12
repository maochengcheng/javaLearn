package com.chuancheng.corejava.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author maochengcheng
 * @date 2021/3/10 0010
 */
public class StopDemo {

    static volatile boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new StopThread());
        t1.start();
        TimeUnit.SECONDS.sleep(2);
        stop = true ;

    }
    static class StopThread implements Runnable{

        @Override
        public void run() {
            while (!stop){
                System.out.println("持续运行");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
