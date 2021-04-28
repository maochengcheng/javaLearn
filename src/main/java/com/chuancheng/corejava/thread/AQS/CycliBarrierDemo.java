package com.chuancheng.corejava.thread.AQS;

import java.util.concurrent.CyclicBarrier;

/**
 * @author maochengcheng
 * @date 2021/3/18 0018
 */
public class CycliBarrierDemo extends  Thread {

    /**
     * 使用场景
     */
    @Override
    public void run() {
        System.out.println("开始进行数据汇总和分析");
    }

    /**
     * 1.parties  如果因为某种原因导致没有足够多的线程来调用await
     * 这个时候会导致所有线程都会被阻塞
     * 2. await(timeout init) 设置一个超时等待时间
     * 3.reset()重置计数，brokenBarrierException
     * @param args
     */
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier= new CyclicBarrier(3,new CycliBarrierDemo());
        new DataImportThread("path1",cyclicBarrier).start();
        new DataImportThread("path2",cyclicBarrier).start();
        new DataImportThread("path3",cyclicBarrier).start();
        cyclicBarrier.reset();
        //TODO 希望三个线程执行结束之后，再做一个汇总处理
    }
}
