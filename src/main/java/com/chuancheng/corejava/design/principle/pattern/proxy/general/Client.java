package com.chuancheng.corejava.design.principle.pattern.proxy.general;

public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }

}
