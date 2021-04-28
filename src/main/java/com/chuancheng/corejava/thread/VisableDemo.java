package com.chuancheng.corejava.thread;

/**
 * @author maochengcheng
 * @date 2021/3/11 0011
 */
public class VisableDemo {
   // public static boolean stop = false;
    //volatile 可以解决可见性、有序性
    // 本质上来说：volatile实际上是通过内存屏障来防止指令重排序以及禁止cpu高速缓存来解决可见性问题。
    //而#Lock指令，它本意上是禁止高速缓存解决可见性问题，但实际上在这里，它表示的是一种内存屏障的功能。
   // 也就是说针对当前的硬件环境，JMM层面采用Lock指令作为内存屏障来解决可见性问题
    public volatile static boolean stop = false;

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
