package com.chuancheng.corejava.thread;

import java.util.concurrent.*;

/**
 * @author maochengcheng
 * @date 2021/3/2 0002
 */
public class CallableDemo implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("当前线程："+Thread.currentThread().getName());

        return "Hello mcc";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> future = executorService.submit(new CallableDemo());
        //future.get是一个阻塞方法
        System.out.println(Thread.currentThread().getName()+"-"+future.get());
    }
}
