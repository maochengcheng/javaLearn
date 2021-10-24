package com.chuancheng.corejava.design.principle.pattern.observer.guava;

/**
 * @author: maochengcheng
 * @date: 2021/10/13
 * @function: 对象
 */
public class Pojo {
    private String name;

    public Pojo(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PojoEvent{" +
                "name='" + name + '\'' +
                '}';
    }
}
