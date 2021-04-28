package com.chuancheng.corejava.thread.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author maochengcheng
 * @date 2021/3/19 0019
 */
public class ThreadPoolDemo implements Runnable {

    public static void main(String[] args) {
       // ExecutorService executorService = Executors.newFixedThreadPool(3);
        //监控（自定义线程池）
        ExecutorService executorService = ExecutorsSelf.newFixedThreadPool(3);

//        ThreadPoolExecutor executorService =(ThreadPoolExecutor)ExecutorsSelf.newFixedThreadPool(3);
//       executorService.prestartAllCoreThreads(); //可以提前预热所有核心线程

        for (int i = 0; i <10 ; i++) {
            executorService.execute(new ThreadPoolDemo());
        }
        executorService.shutdown();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
