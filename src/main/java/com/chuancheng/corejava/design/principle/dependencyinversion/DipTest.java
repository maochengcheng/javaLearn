package com.chuancheng.corejava.design.principle.dependencyinversion;

/**
 * @author maochengcheng
 * @date 2021/4/29 0029
 */
public class DipTest {
    public static void main(String[] args) {
        //简单粗暴，直接依赖细节
       /* Mari mari = new Mari();
        mari.studyJavaCourse();
        mari.studyPythonCourse();
        mari.studyAICourse();*/

       //依赖抽象
       /* Mari mari = new Mari();
        mari.stydy( new JavaCourse());
        mari.stydy( new PythonCourse());*/

        /*Mari mari1 = new Mari(new JavaCourse());
        mari1.stydy();
        Mari mari2 = new Mari(new PythonCourse());
        mari2.stydy();*/

        Mari mari = new Mari();
        mari.setiCourse(new JavaCourse());
        mari.stydy();

    }
}
