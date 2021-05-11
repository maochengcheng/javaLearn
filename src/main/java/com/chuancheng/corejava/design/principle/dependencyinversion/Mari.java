package com.chuancheng.corejava.design.principle.dependencyinversion;

/**
 * @author maochengcheng
 * @date 2021/4/29 0029
 */
public class Mari {
   /* public void studyJavaCourse(){
        System.out.println("学习java");
    }

    public void studyPythonCourse(){
        System.out.println("学习Python");
    }

    public void studyAICourse(){
        System.out.println("学习AI");
    }*/

   private ICourse iCourse;

    /*public Mari(ICourse iCourse) {
        this.iCourse = iCourse;
    }*/

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void stydy(){
        this.iCourse.study();
    }
}
