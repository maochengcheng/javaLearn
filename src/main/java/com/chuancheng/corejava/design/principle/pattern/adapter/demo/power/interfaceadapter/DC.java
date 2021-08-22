package com.chuancheng.corejava.design.principle.pattern.adapter.demo.power.interfaceadapter;

/**
 * @author: maochengcheng
 * @date: 2021/8/17
 * @function:
 */
public interface DC {
    int output5V();
    int output12V();
    int output24V();
    int output36V();
}
