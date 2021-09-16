package com.chuancheng.corejava.design.principle.pattern.template.course;

/**
 * @author: maochengcheng
 * @date: 2021/9/13
 * @function:
 */
public class JavaCourse extends AbastractCourse{

    private boolean needCheckHomework = false;
    @Override
    protected boolean needCheckHomework() {
        return true;
    }
    @Override
    protected void checkHomework() {
        System.out.println("检查java作业");
    }
}
