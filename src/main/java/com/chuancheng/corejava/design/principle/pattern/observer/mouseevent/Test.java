package com.chuancheng.corejava.design.principle.pattern.observer.mouseevent;

import com.chuancheng.corejava.design.principle.pattern.observer.mouseevent.core.EventListener;
import com.chuancheng.corejava.design.principle.pattern.observer.mouseevent.handler.Mouse;
import com.chuancheng.corejava.design.principle.pattern.observer.mouseevent.handler.MouseEventType;
import com.chuancheng.corejava.design.principle.pattern.observer.mouseevent.handler.MouserEventListenter;

/**
 * @author: maochengcheng
 * @date: 2021/10/14
 * @function: 测试客户端
 */
public class Test {
    public static void main(String[] args) {
        EventListener listener = new MouserEventListenter();

        Mouse mouse = new Mouse();
        mouse.addListener(MouseEventType.On_ClICK,listener);
        mouse.addListener(MouseEventType.On_MOVE,listener);

        mouse.click();
        mouse.move();
    }
}
