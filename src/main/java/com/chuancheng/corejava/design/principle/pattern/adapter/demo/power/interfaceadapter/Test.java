package com.chuancheng.corejava.design.principle.pattern.adapter.demo.power.interfaceadapter;

/**
 * @author: maochengcheng
 * @date: 2021/8/17
 * @function:
 */
public class Test {
    public static void main(String[] args) {
        DC adapter = new PowerAdapter(new AC220());
        adapter.output5V();
        adapter.output24V();
    }
}
