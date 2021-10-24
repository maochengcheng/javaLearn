package com.chuancheng.corejava.design.principle.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author: maochengcheng
 * @date: 2021/10/13
 * @function: 观察者2
 */
public class PojoEvent {
    /**
     *  注解几个，通知几个
     * @param arg
     */
    @Subscribe
    public void observer(Object arg){
        if(arg instanceof Pojo){
            System.out.println("执行PojoEvent.observer方法，传参为：" + arg);
        }
    }

}
