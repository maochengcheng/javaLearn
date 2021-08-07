package com.chuancheng.corejava.design.principle.pattern.builder.simple;

public class CourseBuilder {
    private Course course = new Course();

    public void addName(String name){
        course.setName(name);
    }

    public void addPpt(String ppt){
        course.setPpt(ppt);
    }
    public void addVideo(String video){
        course.setVideo(video);
    }
    public void addHomework(String homework){
        course.setHomework(homework);
    }

    public Course builder(){
        return course;
    }
}
