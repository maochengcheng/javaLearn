package com.chuancheng.corejava.thread;

/**
 * @author maochengcheng
 * @date 2021/3/2 0002
 */
public class RunableDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("当前线程："+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        Thread thread = new Thread(threadDemo);
        thread.start();
    }
}
