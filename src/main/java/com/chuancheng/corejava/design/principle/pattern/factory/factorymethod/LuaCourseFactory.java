package com.chuancheng.corejava.design.principle.pattern.factory.factorymethod;

/**
 * @author maochengcheng
 * @date 2021/7/18 0018
 */
public class LuaCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new LuaCourse();
    }
}
