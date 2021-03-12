package com.chuancheng.corejava.thread;

/**
 * @author maochengcheng
 * @date 2021/3/11 0011
 */
public class VisableDemo {
    public static boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            int i= 0;
            while(!stop){
                i++;
            }
            System.out.println("result:"+i);
        });
        thread.start();
        System.out.println("begin start thread");
       Thread.sleep(1000);
       stop = true; // 主线程中修改stop的值，不会影响子线程
    }
}
