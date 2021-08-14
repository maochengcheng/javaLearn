package com.chuancheng.corejava.design.principle.pattern.proxy.test;

/**
 * @author: maochengcheng
 * @date: 2021/8/11
 * @function:
 */
public class Test {
    public static void main(String[] args) {
        JdkZhifuProxy jdkZhifuProxy = new JdkZhifuProxy();
        IPayment iPayment = jdkZhifuProxy.getIntance(new ZhiFuBao());
        iPayment.pay();
    }
}
