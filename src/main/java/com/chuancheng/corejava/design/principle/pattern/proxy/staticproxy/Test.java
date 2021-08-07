package com.chuancheng.corejava.design.principle.pattern.proxy.staticproxy;

public class Test {
    public static void main(String[] args) {
        Zhanglaosan zhanglaosan = new Zhanglaosan(new Zhangsan());
        zhanglaosan.findlove();
    }
}
