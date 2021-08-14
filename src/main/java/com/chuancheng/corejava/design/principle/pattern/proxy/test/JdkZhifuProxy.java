package com.chuancheng.corejava.design.principle.pattern.proxy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: maochengcheng
 * @date: 2021/8/11
 * @function:
 */
public class JdkZhifuProxy implements InvocationHandler {

    private IPayment target;

    public IPayment getIntance(IPayment target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return (IPayment) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        check_data();
       Object result = method.invoke(this.target,args);
        pay_notify();
        return result;
    }

    private void check_data(){
        System.out.println("检测数据是否有误");
    }

    private void pay_notify(){
        System.out.println("收付款成功提醒");
    }

}
