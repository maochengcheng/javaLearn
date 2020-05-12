package com.chuancheng.corejava.reflect.demo6;

public class A {
    public A(){
        System.out.println("A 无参构造器被调用了。");
    }

    public static B createBobj(){
        System.out.println("A的静态方法 createBobj 被调用了！");
        return new B();
    }

    public C createCobj(){
        System.out.println("A 的实例方法createCobj 被调用了！");
        return new C();
    }
}
