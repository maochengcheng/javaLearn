package com.chuancheng.corejava.design.principle.pattern.strategy.pay;

import com.chuancheng.corejava.design.principle.pattern.strategy.pay.payport.AbstractPayment;

/**
 * @author: maochengcheng
 * @date: 2021/9/15
 * @function:
 */
public class Order {
    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public MsgResult pay(){
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public MsgResult pay(String payKey){
        AbstractPayment payment = PayStrategy.get(payKey);
        System.out.println("欢迎试用" + payment.getName());
        System.out.println("本次交易金额" + amount + ",开始扣款");
        return payment.pay(uid,amount);

    }
}
