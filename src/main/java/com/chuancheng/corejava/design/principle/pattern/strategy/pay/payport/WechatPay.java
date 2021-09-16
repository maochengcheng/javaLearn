package com.chuancheng.corejava.design.principle.pattern.strategy.pay.payport;

/**
 * @author: maochengcheng
 * @date: 2021/9/15
 * @function:
 */
public class WechatPay extends AbstractPayment{
    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 500;
    }
}
