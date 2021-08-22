package com.chuancheng.corejava.design.principle.pattern.adapter.demo.power.objectadapter;



/**
 * @author: maochengcheng
 * @date: 2021/8/17
 * @function:
 */
public class Test {
    public static void main(String[] args) {
        DC5 adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
