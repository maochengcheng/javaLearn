package com.chuancheng.corejava.thread.AQS;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author maochengcheng
 * @date 2021/3/18 0018
 */
public class DataImportThread extends Thread {

    private String path;

    private CyclicBarrier cyclicBarrier;

    public DataImportThread(String path, CyclicBarrier cyclicBarrier) {
        this.path = path;
        this.cyclicBarrier = cyclicBarrier;
    }

    public void run(){
        System.out.println("开始导入"+path+"");
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
