package com.chuancheng.corejava.design.principle.pattern.iterator.course;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: maochengcheng
 * @date: 2021/9/18
 * @function: 集合实现
 */
public class CourseAggregateImpl implements ICourseAggregate{
    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    public void add(Course course) {
        courseList.add(course);
    }

    public void remove(Course course) {
        courseList.remove(course);
    }

    public Iterator<Course> iterator() {
        return new IteratorImpl<Course>(courseList);
    }
}
