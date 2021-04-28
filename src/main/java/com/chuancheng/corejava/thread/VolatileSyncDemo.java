package com.chuancheng.corejava.thread;

/**
 * @author maochengcheng
 * @date 2021/3/17 0017
 */
public class VolatileSyncDemo {
    private volatile static VolatileSyncDemo instance = null;

    //DCL问题

    /**
     *  instance = new VolatileSyncDemo();
     *  =
     *  1.memory = allocate() 分配内存
     *  2.ctorInstance(memory)  对象初始化
     *  3.instance=memory   设置对象指向
     * @return
     */
    public static VolatileSyncDemo getInstance(){
        if(instance == null){
            synchronized(VolatileSyncDemo.class){
                if(instance ==null){
                    instance = new VolatileSyncDemo();
                }
            }
        }
        return instance;
    }
}
