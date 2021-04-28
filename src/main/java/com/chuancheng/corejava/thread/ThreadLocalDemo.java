package com.chuancheng.corejava.thread;

/**
 * @author maochengcheng
 * @date 2021/3/17 0017
 */
public class ThreadLocalDemo {
    private static Integer num = 0;

    public static final ThreadLocal<Integer> local = new ThreadLocal<Integer>(){
        @Override
        protected java.lang.Integer initialValue() {
            return 0;
        }
    };
    public static void main(String[] args) {
        Thread[] threads = new Thread[5];
        //希望每个线程都拿到5
        for(int i=0;i<5;i++){
            threads[i] = new Thread(()->{
              //  num+=5;
               int  num = local.get(); //拿到初始值
                num+=5;
                local.set(num);
                System.out.println(Thread.currentThread().getName()+"->"+num);
            },"Thread-"+i);

        }
        for(Thread thread:threads){
            thread.start();
        }
    }
}
