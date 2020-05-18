package com.chuancheng.corejava.reflect.demo6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        A a = (A)context.getBean("a");
        B b = (B)context.getBean("b");
        C c = (C)context.getBean("c");
    }
}
