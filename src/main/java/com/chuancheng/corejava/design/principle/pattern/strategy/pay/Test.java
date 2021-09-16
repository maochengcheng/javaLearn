package com.chuancheng.corejava.design.principle.pattern.strategy.pay;

/**
 * @author: maochengcheng
 * @date: 2021/9/15
 * @function: 测试类
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order("1","20210915",300.00);
        System.out.println(order.pay());

        System.out.println(order.pay(PayStrategy.JD_PAY));
    }
}
