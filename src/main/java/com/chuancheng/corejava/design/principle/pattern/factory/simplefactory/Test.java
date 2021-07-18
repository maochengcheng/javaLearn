package com.chuancheng.corejava.design.principle.pattern.factory.simplefactory;

/**
 * 简单工程的优点
 * 直需传入一个正确的参数，就可以获取你所需要的对象，无须知道其创建的细节
 * 缺点
 * 工厂类的职责相对过重，增加新的产品时需要修改工厂类的判断逻辑，违背开闭原则
 * 不易于扩展过于复杂的产品结构
 */
public class Test {
    public static void main(String[] args) {
        ICourse course = new CourseFactory().create(LuaCourse.class);
        course.record();
    }
}
