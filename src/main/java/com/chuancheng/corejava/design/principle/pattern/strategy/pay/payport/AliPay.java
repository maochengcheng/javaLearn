package com.chuancheng.corejava.design.principle.pattern.strategy.pay.payport;

/**
 * @author: maochengcheng
 * @date: 2021/9/15
 * @function:
 */
public class AliPay extends AbstractPayment{
    public String getName() {
        return "支付宝支付";
    }

    protected double queryBalance(String uid) {
        return 500;
    }
}
