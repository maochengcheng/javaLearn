package com.chuancheng.corejava.design.principle.pattern.singleton.threadlocal;

public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocatlSingleton.getInstance());
        System.out.println(ThreadLocatlSingleton.getInstance());
        System.out.println(ThreadLocatlSingleton.getInstance());
        System.out.println(ThreadLocatlSingleton.getInstance());
        System.out.println(ThreadLocatlSingleton.getInstance());
    }
}
