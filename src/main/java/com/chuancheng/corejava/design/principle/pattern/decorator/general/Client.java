package com.chuancheng.corejava.design.principle.pattern.decorator.general;

public class Client {
    public static void main(String[] args) {
        Component c1 = new ConcreteComponent();//首先创建需要被装饰的原始对象（即要被装饰的对象）
        Decorator decoratorA = new ConcreteDecoratorA(c1);//给对象透明的增加功能A并调用
        decoratorA.operation();
        Decorator decoratorB = new ConcreteDecoratorB(c1);//给对象透明的增加功能B并调用
        decoratorB.operation();
        Decorator decoratorBandA = new ConcreteDecoratorB(decoratorA);//装饰器也可以装饰具体的装饰类
    }
}
