package com.chuancheng.corejava.design.principle.pattern.factory.factorymethod;

public class LuaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("Lua课程");
    }
}
