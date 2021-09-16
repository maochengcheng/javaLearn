package com.chuancheng.corejava.design.principle.pattern.bridge.course;

/**
 * @author: maochengcheng
 * @date: 2021/9/13
 * @function: 测试方法
 */
public class Test {
    public static void main(String[] args) {
        INote note = new JavaNote();
        IVideo video = new JavaVideo();
        AbstractCourse abstractCourse = new JavaCourse();
        abstractCourse.setNote(note);
        abstractCourse.setVideo(video);
        abstractCourse.toString();
    }
}
