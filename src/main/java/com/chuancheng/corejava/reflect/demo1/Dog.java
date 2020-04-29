package com.chuancheng.corejava.reflect.demo1;

import java.lang.reflect.Method;

public class Dog {
    public String color;

    public void bark(){

    }

    public static void main(String[] args) throws Exception{
        Class clazz =Dog.class;

        //创建对象
        Dog dog = (Dog)clazz.newInstance();

        System.out.println(clazz.getSuperclass()); //父类
        System.out.println(clazz.getClassLoader()); //类的构造器
        System.out.println(clazz.getPackage());   // 包名
        System.out.println(clazz.getName());  // 类名

        Method method  = clazz.getDeclaredMethod("bark");
        method.invoke(clazz.newInstance());
    }
}
