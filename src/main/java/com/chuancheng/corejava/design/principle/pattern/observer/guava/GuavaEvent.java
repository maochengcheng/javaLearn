package com.chuancheng.corejava.design.principle.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author: maochengcheng
 * @date: 2021/10/13
 * @function: 观察者
 */
public class GuavaEvent {
    /**
     *  注解几个，通知几个
     * @param str
     */
    @Subscribe
    public void observer(Object str){
        System.out.println("执行observer方法，传参为：" + str);
    }

    @Subscribe
    public void observer2(Object str){
        System.out.println("执行observer2方法，传参为：" + str);
    }

}
