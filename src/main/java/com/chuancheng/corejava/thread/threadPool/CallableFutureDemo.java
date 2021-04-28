package com.chuancheng.corejava.thread.threadPool;

import java.util.concurrent.*;

/**
 * @author maochengcheng
 * @date 2021/3/20 0020
 */
public class CallableFutureDemo implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("hello maomao");
        Thread.sleep(3000);
        return "maomao";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*CallableFutureDemo callableFutureDemo = new CallableFutureDemo();
        FutureTask futureTask = new FutureTask(callableFutureDemo);
        new Thread(futureTask).start();
        ///get方法属于阻塞方法
        System.out.println(futureTask.get());*/

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        CallableFutureDemo callableFutureDemo = new CallableFutureDemo();
        FutureTask future = (FutureTask) executorService.submit(callableFutureDemo);
        System.out.println(future.get());
    }
}
