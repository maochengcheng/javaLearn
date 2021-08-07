package com.chuancheng.corejava.design.principle.pattern.singleton.threadlocal;

public class ThreadLocatlSingleton {
    private static final ThreadLocal<ThreadLocatlSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocatlSingleton>(){

                @Override
                protected ThreadLocatlSingleton initialValue() {
                    return new ThreadLocatlSingleton();
                }
            };

    private ThreadLocatlSingleton(){}

    public static ThreadLocatlSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
