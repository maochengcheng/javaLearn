package com.chuancheng.corejava.design.principle.pattern.factory.abstractfactory;

/**
 * @author maochengcheng
 * @date 2021/7/18 0018
 */
public abstract class CourseFactory {
    public void init(){
        System.out.println("初始化基础数据");
    }

    protected abstract  INote createNote();

    protected abstract IVideo createVideo();
}
