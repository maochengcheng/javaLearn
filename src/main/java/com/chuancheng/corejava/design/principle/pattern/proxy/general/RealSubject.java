package com.chuancheng.corejava.design.principle.pattern.proxy.general;

public class RealSubject implements ISubject{
    @Override
    public void request() {
        System.out.println("realSubject");
    }
}
