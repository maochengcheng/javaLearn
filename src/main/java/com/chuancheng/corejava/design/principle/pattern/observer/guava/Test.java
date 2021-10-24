package com.chuancheng.corejava.design.principle.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @author: maochengcheng
 * @date: 2021/10/13
 * @function: 测试客户端
 */
public class Test {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        PojoEvent pojoEvent = new PojoEvent();
        eventBus.register(guavaEvent);
        eventBus.register(pojoEvent);
        eventBus.post("Mao");
        eventBus.post(new Pojo("chengcheng"));
    }
}
