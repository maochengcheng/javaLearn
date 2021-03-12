package com.chuancheng.corejava.thread;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author maochengcheng
 * @date 2021/3/9 0009
 */
public class WaitNotifyDemo {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        int size = 10;
        Producer producer = new Producer(queue,size);
        Consumer consumer = new Consumer(queue,size);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();
    }
}
