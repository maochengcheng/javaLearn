package com.chuancheng.corejava.design.principle.pattern.factory.abstractfactory;

/**
 * @author maochengcheng
 * @date 2021/7/18 0018
 */
public class LuaCourseFactory extends CourseFactory{
    @Override
    protected INote createNote() {
        super.init();
        return new LuaNote();
    }

    @Override
    protected IVideo createVideo() {
        super.init();
        return new LuaVideo();
    }
}
