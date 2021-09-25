package com.chuancheng.corejava.design.principle.pattern.iterator.course;

/**
 * @author: maochengcheng
 * @date: 2021/9/18
 * @function: 测试
 */
public class Test {
    public static void main(String[] args) {
        Course java = new Course("java");
        Course lua = new Course("lua");
        Course php = new Course("php");

        ICourseAggregate aggregate = new CourseAggregateImpl();
        aggregate.add(java);
        aggregate.add(lua);
        aggregate.add(php);

        System.out.println("=================课程列表===============");
        printCourse(aggregate);

        System.out.println("=================新课程列表===============");
        aggregate.remove(php);
        printCourse(aggregate);
    }

    private static void printCourse(ICourseAggregate aggregate) {
        Iterator<Course> i = aggregate.iterator();
        while(i.hasNext()){
            System.out.println("<" + i.next().getName() +">");
        }
    }
}
