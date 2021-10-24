package com.chuancheng.corejava.design.principle.pattern.visitor.kpi;

import java.util.Random;

/**
 * @author: maochengcheng
 * @date: 2021/10/15
 * @function: 元素-项目经理
 */
public class Manager extends Employee{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    //考核每年新产品数量
    public int getProducts(){
        return new Random().nextInt(10);
    }
}
