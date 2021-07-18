package com.chuancheng.corejava.design.principle.pattern.factory.factorymethod;

/**
 * @author maochengcheng
 * @date 2021/7/18 0018
 *
 * 适用场景
 * 创建对象需要大量重复的代码。
 * 客户端（应用层）不依赖于产品类实例如何被创建、实现等细节。
 * 一个类通过其子类来指定创建哪个对象。
 */
public class Test {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse course = factory.create();
        course.record();
    }
}
