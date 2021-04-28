package com.chuancheng.corejava.thread.extend;

/**
 * @author maochengcheng
 * @date 2021/3/20 0020
 */
public class TestMain {
    /**
     * 死锁发生的条件
     * 1.互斥，共享资源x和y 只能被一个线程占用
     * 2.占有且等待，线程T1已经取得共享资源x，在等待共享资源y的时候，不释放共享资源x
     * 3.不可抢占，其他线程不能强行抢占线程T1占有的资源
     * 4.循环等待，线程T1等待线程T2占有的资源，线程T2等待线程T1占有的资源，就是循环等待
     * @param args
     */
    public static void main(String[] args) {
        Account fromAccount = new Account("张三",10000);
        Account toAccount = new Account("李四",20000);
      /*  Thread a = new Thread(new TransferAcount(fromAccount,toAccount,1));
        Thread b = new Thread(new TransferAcount(toAccount,fromAccount,2));*/

        /*Allocator allocator = new Allocator();//统一分配锁
        Thread a = new Thread(new TransferAcount01(fromAccount,toAccount,1,allocator));
        Thread b = new Thread(new TransferAcount01(toAccount,fromAccount,2,allocator));*/

       /* Thread a = new Thread(new TransferAcount02(fromAccount,toAccount,1));
        Thread b = new Thread(new TransferAcount02(toAccount,fromAccount,2));*/

        Thread a = new Thread(new TransferAcount03(fromAccount,toAccount,1));
        Thread b = new Thread(new TransferAcount03(toAccount,fromAccount,2));
        a.start();
        b.start();
    }
}
