package com.chuancheng.corejava.thread;

/**
 * @author maochengcheng
 * @date 2021/3/10 0010
 */
public class InterruptDemo {
    private static int i ;
    //interrupt(jvm)
    //while
    //线程处于阻塞状态下的情况下（中断才有意义）
    //Thread.join
    //wait
    //Thread.sleep
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            //Thread.currentThread().isInterrupted() 默认是false
//            while(!Thread.currentThread().isInterrupted()){
//                i++;
//            }

            //正常的任务处理
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                //抛出异常来响应客户端的中断请求
                e.printStackTrace();
            }
        });
        thread.start();
        //interrupt 这个属性由false-true
        thread.interrupt();
    }

}
