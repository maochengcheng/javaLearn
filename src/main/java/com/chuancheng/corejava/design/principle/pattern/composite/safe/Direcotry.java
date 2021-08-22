package com.chuancheng.corejava.design.principle.pattern.composite.safe;

/**
 * @author: maochengcheng
 * @date: 2021/8/16
 * @function:
 */
public abstract class Direcotry {
    public String name;

    public Direcotry(String name) {
        this.name = name;
    }

    public abstract void show();

}
