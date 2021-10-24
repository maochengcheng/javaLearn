package com.chuancheng.corejava.design.principle.pattern.interpreter.calculate;

/**
 * @author: maochengcheng
 * @date: 2021/10/13
 * @function: 客户端测试
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("result:" + new Calculator("10 + 30").calulate());
        System.out.println("result:" + new Calculator("10 + 30 -20").calulate());
        System.out.println("result:" + new Calculator("100 * 2 + 400 * 1 + 66").calulate());
    }
}
