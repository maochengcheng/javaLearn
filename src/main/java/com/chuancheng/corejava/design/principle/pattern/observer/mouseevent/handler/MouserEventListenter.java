package com.chuancheng.corejava.design.principle.pattern.observer.mouseevent.handler;

import com.chuancheng.corejava.design.principle.pattern.observer.mouseevent.core.Event;
import com.chuancheng.corejava.design.principle.pattern.observer.mouseevent.core.EventListener;

/**
 * @author: maochengcheng
 * @date: 2021/10/14
 * @function: 具体观察者
 */
public class MouserEventListenter implements EventListener {
    public void onClick(Event event){
        System.out.println("=================触发鼠标点击事件=====================\n" + event);
    }

    public void onMove(Event event){
        System.out.println("=================触发鼠标移动事件=====================\n" + event);
    }
}
