package com.chuancheng.corejava.design.principle.pattern.strategy.pay;

import com.chuancheng.corejava.design.principle.pattern.strategy.pay.payport.AbstractPayment;
import com.chuancheng.corejava.design.principle.pattern.strategy.pay.payport.AliPay;
import com.chuancheng.corejava.design.principle.pattern.strategy.pay.payport.JdPay;
import com.chuancheng.corejava.design.principle.pattern.strategy.pay.payport.WechatPay;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: maochengcheng
 * @date: 2021/9/15
 * @function: 支付配置
 */
public class PayStrategy {
    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static Map<String, AbstractPayment> payStrategy = new HashMap<>();

    static{
        payStrategy.put(ALI_PAY,new AliPay());
        payStrategy.put(JD_PAY,new JdPay());
        payStrategy.put(WECHAT_PAY,new WechatPay());
    }

    public static AbstractPayment get(String payKey){
        if(payStrategy.containsKey(payKey)){
            return payStrategy.get(payKey);
        }
       return payStrategy.get(DEFAULT_PAY);
    }

}
