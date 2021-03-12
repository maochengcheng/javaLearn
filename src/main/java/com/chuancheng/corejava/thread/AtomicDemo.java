package com.chuancheng.corejava.thread;

/**
 * @author maochengcheng
 * @date 2021/3/11 0011
 */
public class AtomicDemo {
    public static int count= 0;
    public static void incr(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0;i<1000;i++){
            new Thread(AtomicDemo::incr).start();
        }
        Thread.sleep(4000);
        System.out.println("result:"+count);
    }
}
