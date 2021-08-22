package com.chuancheng.corejava.design.principle.pattern.adapter.demo.power.classadapter;

/**
 * @author: maochengcheng
 * @date: 2021/8/17
 * @function:
 */
public class Test {
    public static void main(String[] args) {
        DC5 adapter = new PowerAdapter();
        adapter.output5V();
    }
}
