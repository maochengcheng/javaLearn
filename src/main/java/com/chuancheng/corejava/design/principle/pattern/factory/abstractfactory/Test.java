package com.chuancheng.corejava.design.principle.pattern.factory.abstractfactory;

/**
 * @author maochengcheng
 * @date 2021/7/18 0018
 *
 * 适用场景
 *
 * 客户端（应用层）不依赖于产品类实例如何被创建、实现等细节
 * 强调一系列相关的产品对象（属于同一产品族）一起使用创建对象需要大量重复的代码
 * 提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于具体实现
 *
 * 抽象工程模式的优点
 * 具体产品在应用层代码隔离，无需关注细节
 * 缺点
 * 规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口
 * 增加了系统的抽象性和理解难度
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();

    }
}
