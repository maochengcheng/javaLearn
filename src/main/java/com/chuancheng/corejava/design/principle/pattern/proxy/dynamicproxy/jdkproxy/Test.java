package com.chuancheng.corejava.design.principle.pattern.proxy.dynamicproxy.jdkproxy;

public class Test {
    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson zhangsan = jdkMeipo.getInstance(new Zhangsan());
        zhangsan.flindlove();


        IPerson lisi = jdkMeipo.getInstance(new Lisi());
        lisi.flindlove();

    }
}
