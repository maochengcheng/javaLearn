package com.chuancheng.corejava.design.principle.pattern.factory.abstractfactory;
/**
 * @author maochengcheng
 * @date 2021/7/18 0018
 */
public class LuaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("Lua课程");
    }
}
