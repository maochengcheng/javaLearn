package com.chuancheng.corejava.design.principle.pattern.strategy.pay.payport;

import com.chuancheng.corejava.design.principle.pattern.strategy.pay.MsgResult;

/**
 * @author: maochengcheng
 * @date: 2021/9/15
 * @function: 抽象类
 */
public abstract class AbstractPayment {
    public abstract String getName();
    public MsgResult pay(String uid, double amount){
        if(queryBalance(uid) < amount){
            return new MsgResult(500,"支付失败","余额不足");
        }
        return new MsgResult(200,"支付成功","支付金额" + amount);
    }

    protected abstract double queryBalance(String uid);

}
