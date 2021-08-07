package com.chuancheng.corejava.design.principle.pattern.builder.simple;

public class Test {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();

        builder.addName("设计模式");
        builder.addPpt("PPt课件");
        builder.addVideo("录播视频");
        System.out.println(builder.builder());
    }
}
