package com.chuancheng.corejava.design.principle.pattern.builder.simple;

import lombok.Data;

/**
 * create by maochengcheng
 */
@Data
public class Course {
    private String name;
    private String ppt;
    private String video;
    private String note;
    private String homework;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", ppt='" + ppt + '\'' +
                ", video='" + video + '\'' +
                ", note='" + note + '\'' +
                ", homework='" + homework + '\'' +
                '}';
    }
}
