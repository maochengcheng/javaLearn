package com.chuancheng.corejava.design.principle.pattern.proxy.dynamicproxy.cglibproxy;

public class Test {
    public static void main(String[] args) {
        Zhangsan zhangsan = (Zhangsan)new CglibMeipo().getInstance(Zhangsan.class);
        zhangsan.flindlove();
    }
}
