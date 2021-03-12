package com.chuancheng.corejava.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author maochengcheng
 * @date 2021/3/10 0010
 */
public class InterruptDemo2 {
    private static int i;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            while(true){
                //true标识被中断过
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("before:"+Thread.currentThread().isInterrupted());
                    Thread.interrupted(); //对中断标识复位false
                    System.out.println("after:"+Thread.currentThread().isInterrupted());
                }
            }
        });
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        thread.interrupt();
    }
}
