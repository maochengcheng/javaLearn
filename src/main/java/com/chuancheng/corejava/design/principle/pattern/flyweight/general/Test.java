package com.chuancheng.corejava.design.principle.pattern.flyweight.general;

/**
 * @author: maochengcheng
 * @date: 2021/8/16
 * @function:
 */
public class Test {
    public static void main(String[] args) {
        IFlyweight flyweight = FlyweightFactory.getFlyweight("intrinsicSate1");
        flyweight.operation("intrinsicSate2");
    }
}
