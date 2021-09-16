package com.chuancheng.corejava.design.principle.pattern.template.course;

/**
 * @author: maochengcheng
 * @date: 2021/9/13
 * @function:
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("==============架构师课程=================");
        JavaCourse java = new JavaCourse();
        java.createCourse();

        System.out.println("==============lua课程=================");
        LuaCourse lua = new LuaCourse();
        lua.createCourse();
    }
}
