package com.chuancheng.corejava.design.principle.pattern.facade.general;

public class Facade {
    private SubSystemA a = new SubSystemA();
    private SubSystemB b = new SubSystemB();

    //对外接口
    public void doA(){
        this.a.doA();
    }

    //对外接口
    public void doB(){
        this.b.doB();
    }
}
