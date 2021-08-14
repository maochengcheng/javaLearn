package com.chuancheng.corejava.design.principle.pattern.proxy.test;

/**
 * @author: maochengcheng
 * @date: 2021/8/11
 * @function:
 */
public class WeiXinZhiFu implements IPayment{
    @Override
    public void pay() {
        System.out.println("用微信付款");

    }

    @Override
    public void Collection() {
        System.out.println("用微信收款");
    }
}
