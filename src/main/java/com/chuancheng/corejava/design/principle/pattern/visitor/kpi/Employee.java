package com.chuancheng.corejava.design.principle.pattern.visitor.kpi;

import java.util.Random;

/**
 * @author: maochengcheng
 * @date: 2021/10/15
 * @function:元素 员工类
 */
public abstract class Employee {
    public String name;
    public int kpi; // 员工KPI

    public Employee(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    //接收访问这访问
    public abstract void accept(IVisitor visitor);
}
