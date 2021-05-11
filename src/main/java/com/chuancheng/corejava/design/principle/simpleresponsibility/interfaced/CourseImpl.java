package com.chuancheng.corejava.design.principle.simpleresponsibility.interfaced;

/**
 * @author maochengcheng
 * @date 2021/4/29 0029
 */
public class CourseImpl implements ICourseInfo,ICourseManager{
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
