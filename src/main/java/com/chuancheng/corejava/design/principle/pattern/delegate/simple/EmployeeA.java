package com.chuancheng.corejava.design.principle.pattern.delegate.simple;
/**
 * @author: maochengcheng
 * @date: 2021/9/13
 * @function: 员工A
 */
public class EmployeeA implements IEmployee{
    protected  String goodAt = "编程";
    @Override
    public void doing(String task) {
        System.out.println("我是员工A ，擅长" + goodAt + ",我现在开始做" + task);
    }
}
