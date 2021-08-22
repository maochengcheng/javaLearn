package com.chuancheng.corejava.design.principle.pattern.flyweight.general;

/**
 * @author: maochengcheng
 * @date: 2021/8/15 0015
 * @function:具体享元角色
 */
public class ConcreteFlyweight implements IFlyweight{
    private String intrinsicSate;

    public ConcreteFlyweight(String intrinsicSate) {
        this.intrinsicSate = intrinsicSate;
    }

    @Override
    public void operation(String extrinsicSate) {
        System.out.println("Object address: " + System.identityHashCode(this));
        System.out.println("IntrinsicSate: " + this.intrinsicSate);
        System.out.println("ExtrinsicSate: " + extrinsicSate);

    }
}
