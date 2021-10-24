package com.chuancheng.corejava.design.principle.pattern.observer.mouseevent.core;

import java.lang.reflect.Method;

/**
 * @author: maochengcheng
 * @date: 2021/10/14
 * @function:事件实体
 */
public class Event {
    //事件源，动作由谁触发
    private Object source;
    //事件触发时间
    private long time;
    //事件触发要通知的对象（观察者）
    private EventListener target;
    //观察者回调函数
    private Method callback;
    //事件名称
    private String trigger;

    public Event(EventListener target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public long getTime() {
        return time;
    }

    public Event setTime(long time) {
        this.time = time;
        return this;
    }

    public EventListener getTarget() {
        return target;
    }

    public Event setTarget(EventListener target) {
        this.target = target;
        return this;
    }

    public Method getCallback() {
        return callback;
    }

    public Event setCallback(Method callback) {
        this.callback = callback;
        return this;
    }

    public String getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", time=" + time +
                ", target=" + target +
                ", callback=" + callback +
                ", trigger='" + trigger + '\'' +
                '}';
    }
}
