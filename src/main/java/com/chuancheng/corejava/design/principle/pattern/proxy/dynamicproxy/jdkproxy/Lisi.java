package com.chuancheng.corejava.design.principle.pattern.proxy.dynamicproxy.jdkproxy;



public class Lisi implements IPerson {

    @Override
    public void flindlove() {
        System.out.println("李四要求：黑穷丑");
    }

    @Override
    public void buyInsure() {
        System.out.println("20万");
    }
}
