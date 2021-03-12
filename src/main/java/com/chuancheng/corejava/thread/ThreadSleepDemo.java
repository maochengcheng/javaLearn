package com.chuancheng.corejava.thread;

/**
 * @author maochengcheng
 * @date 2021/3/6 0006
 */

/**
 * Thread.sleep的工作流程
 * 挂起线程并修改其运行状态
 * 用sleep()提供的参数来设置一个定时器
 * 当世界结束，定时器会触发，内核收到中断后修改线程的运行状态
 * 例如线程会被标志为就绪而进入就绪队列等待调度
 */

/**
 * 线程的调度算法
 * 操作系统中，cpu竞争有很多种策略。Unix系统使用的时间片算法，而Windows则属于抢占式。
 */
public class ThreadSleepDemo extends Thread{
    public static void main(String[] args) {

        new ThreadSleepDemo().start();
    }

    @Override
    public void run() {
        System.out.println("begin:"+System.currentTimeMillis());
        try {
            Thread.sleep(3000);
            System.out.println("end:"+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
