package com.chuancheng.corejava.thread;

/**
 * @author maochengcheng
 * @date 2021/3/11 0011
 */
public class SyncDemo {

    //对象锁（同一个对象有效）this  普通同步方法，锁是当前实例对象
    public synchronized void demo(){

    }

    public void demo1(){
        //TODO
        synchronized (this){ //对象锁

        }
    }
    //类级别的锁 SyncDemo.class   静态同步方法，锁是当前类的Class对象
    public synchronized  static void demo3(){

    }
    public void demo4(){
        synchronized (SyncDemo.class){

        }
    }
    // 对于同步方法块，锁是Synchonized括号里配置的对象

    public static void main(String[] args) {
        SyncDemo syncDemo = new SyncDemo();
        SyncDemo syncDemo1 = new SyncDemo();
        //demo无法实现两个线程的互斥
        //如果访问demo3的话，那么下面两个线程会存在互斥
        new Thread(()->{
            syncDemo.demo();
        }).start();

        new Thread(()->{
            syncDemo1.demo();
        }).start();
    }


}
