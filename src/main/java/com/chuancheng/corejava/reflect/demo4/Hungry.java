package com.chuancheng.corejava.reflect.demo4;

/**
 * @author maochengcheng
 * @date 2020/5/10 0010
 */
public class Hungry {
    private static final Hungry instance = new Hungry();

    private Hungry(){

    }

    public static Hungry getInstance(){
        return instance;
    }
}
