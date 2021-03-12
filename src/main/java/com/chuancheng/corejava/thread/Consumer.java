package com.chuancheng.corejava.thread;

import java.util.Queue;

/**
 * @author maochengcheng
 * @date 2021/3/6 0006
 */
public class Consumer implements Runnable{
    private Queue<String> bags;
    private int size;

    public Consumer(Queue<String> bags,int size){
        this.bags=bags;
        this.size=size;
    }

    @Override
    public void run() {

        while(true){
            synchronized (bags){
                while(bags.isEmpty()){
                    System.out.println("bags为空");
                    try {
                        bags.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String bag=bags.remove();
                System.out.println("消费者消费："+bag);
                bags.notifyAll();
            }
        }
    }
}
