package com.chuancheng.corejava.design.principle.pattern.builder.chain;

public class Test {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder()
                            .addName("设计模式")
                            .addPpt("PPt课件")
                            .addVideo("录播视频");
        System.out.println(builder.builder());
    }
}
