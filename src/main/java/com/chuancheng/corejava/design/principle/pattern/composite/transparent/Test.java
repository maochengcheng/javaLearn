package com.chuancheng.corejava.design.principle.pattern.composite.transparent;

/**
 * @author: maochengcheng
 * @date: 2021/8/16
 * @function:
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("===============透明的组合模式====================");

        CourseComponet javaBase = new Course("Java入门课程",8000);
        CourseComponet ai = new Course("人工智能",5000);
        CourseComponet packageCourse = new CoursePackage("Java架构师课程",2);
        CourseComponet design = new Course("设计模式",3000);
        CourseComponet source = new Course("源码分析",3000);
        CourseComponet softSkil = new Course("软技能",2000);
        packageCourse.addChild(design);
        packageCourse.addChild(source);
        packageCourse.addChild(softSkil);

        CourseComponet catalog = new CoursePackage("传成课程目录",1);
        catalog.addChild(javaBase);
        catalog.addChild(ai);
        catalog.addChild(packageCourse);

        catalog.print();



    }
}
