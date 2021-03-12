package com.chuancheng.corejava.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author maochengcheng
 * @date 2021/3/3 0003
 */
public class ThreadStatusDemo {
    public static void main(String[] args) {
        //Time_Waiting
        new Thread(()->{
            while(true){
                try {
                    TimeUnit.SECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Time_Waiting_Demo").start();
        //WAITING
        new Thread(()->{
            while(true){
                synchronized(ThreadStatusDemo.class){
                    try{
                        ThreadStatusDemo.class.wait(); //等待阻塞
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        },"Waiting").start();
        new Thread(new BlockedDemo(),"Blocked-Demo-01").start();
        new Thread(new BlockedDemo(),"Blocked-Demo-02").start();
    }

    static class BlockedDemo extends Thread{
        public void run(){
            synchronized (BlockedDemo.class){
                while(true){
                    try {
                        TimeUnit.SECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
