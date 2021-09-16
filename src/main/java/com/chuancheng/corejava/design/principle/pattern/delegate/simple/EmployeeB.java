package com.chuancheng.corejava.design.principle.pattern.delegate.simple;
/**
 * @author: maochengcheng
 * @date: 2021/9/13
 * @function: 员工B
 */
public class EmployeeB implements IEmployee{
    protected  String goodAt = "ui";
    @Override
    public void doing(String task) {
        System.out.println("我是员工B ，擅长" + goodAt + ",我现在开始做" + task);
    }
}
