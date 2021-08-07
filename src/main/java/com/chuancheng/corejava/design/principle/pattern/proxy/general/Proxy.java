package com.chuancheng.corejava.design.principle.pattern.proxy.general;

public class Proxy implements ISubject{

    private ISubject subject;

    public Proxy(ISubject subject) {
        this.subject = subject;
    }


    public void request() {
        before();
        subject.request();
        after();
    }

    private void before(){
        System.out.println("before");
    }

    private void after(){
        System.out.println("after");
    }
}
