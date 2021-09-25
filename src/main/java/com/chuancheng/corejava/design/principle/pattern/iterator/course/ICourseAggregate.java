package com.chuancheng.corejava.design.principle.pattern.iterator.course;

/**
 * @author: maochengcheng
 * @date: 2021/9/18
 * @function: 集合接口
 */
public interface ICourseAggregate {
    void add(Course course);
    void remove(Course course);
    Iterator<Course> iterator();
}
