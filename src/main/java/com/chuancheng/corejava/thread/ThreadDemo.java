package com.chuancheng.corejava.thread;

/**
 * @author maochengcheng
 * @date 2021/3/2 0002
 */
public class ThreadDemo extends Thread{

    @Override
    public void run() {
        System.out.println("当前线程："+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();  //启动一个线程
    }
}
