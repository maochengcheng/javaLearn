package com.chuancheng.corejava.design.principle.pattern.facade.general;

public class Test {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doA();
        facade.doB();
    }
}
