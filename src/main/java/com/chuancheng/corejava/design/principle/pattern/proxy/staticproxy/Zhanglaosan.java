package com.chuancheng.corejava.design.principle.pattern.proxy.staticproxy;

public class Zhanglaosan implements IPerson{

    private Zhangsan zhangsan;

    public Zhanglaosan(Zhangsan zhangsan) {
        this.zhangsan = zhangsan;
    }

    @Override
    public void findlove() {
        System.out.println("开始物色");
        zhangsan.findlove();
        System.out.println("开始交往");
    }
}
