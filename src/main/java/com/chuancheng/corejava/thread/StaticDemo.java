package com.chuancheng.corejava.thread;

/**
 * @author maochengcheng
 * @date 2021/3/17 0017
 */
public class StaticDemo {
    private StaticDemo(){}
    private static StaticDemo instance = new StaticDemo();
    public static StaticDemo getInstance(){
        return instance;
    }
}
