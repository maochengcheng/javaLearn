package com.chuancheng.corejava.design.principle.dependencyinversion;

/**
 * @author maochengcheng
 * @date 2021/4/29 0029
 */
public class JavaCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("学习java");
    }
}
