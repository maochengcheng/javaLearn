package com.chuancheng.corejava.design.principle.pattern.composite.safe;

/**
 * @author: maochengcheng
 * @date: 2021/8/16
 * @function:
 */
public class File extends Direcotry{

    public File(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);

    }
}
