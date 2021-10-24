package com.chuancheng.corejava.design.principle.pattern.observer.mouseevent.handler;

import com.chuancheng.corejava.design.principle.pattern.observer.mouseevent.core.EventContext;

/**
 * @author: maochengcheng
 * @date: 2021/10/14
 * @function: 具体的被观察者
 */
public class Mouse extends EventContext {
    public void click(){
        System.out.println("调用单击方法");
        this.trigger(MouseEventType.On_ClICK);
    }

    public void move(){
        System.out.println("调用移动方法");
        this.trigger(MouseEventType.On_MOVE);
    }
}
