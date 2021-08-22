package com.chuancheng.corejava.design.principle.pattern.flyweight.jdk;

/**
 * @author: maochengcheng
 * @date: 2021/8/16
 * @function:
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(127);
        Integer b = 127;

        Integer c = Integer.valueOf(128);
        Integer d = 128;
        System.out.println(a == b); //true
        System.out.println(c == d); //false;
    }
}
