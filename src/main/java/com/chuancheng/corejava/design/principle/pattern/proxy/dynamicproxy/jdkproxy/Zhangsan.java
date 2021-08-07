package com.chuancheng.corejava.design.principle.pattern.proxy.dynamicproxy.jdkproxy;



public class Zhangsan implements IPerson {

    @Override
    public void flindlove() {
        System.out.println("张三要求：白富美");
    }

    @Override
    public void buyInsure() {
        System.out.println("100万");
    }
}
