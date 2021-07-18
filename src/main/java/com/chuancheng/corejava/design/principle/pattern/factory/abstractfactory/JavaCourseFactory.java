package com.chuancheng.corejava.design.principle.pattern.factory.abstractfactory;

/**
 * @author maochengcheng
 * @date 2021/7/18 0018
 */
public class JavaCourseFactory extends CourseFactory{
    @Override
    protected INote createNote() {
        super.init();
        return new JavaNote();
    }

    @Override
    protected IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }
}
