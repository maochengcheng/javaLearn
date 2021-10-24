package com.chuancheng.corejava.design.principle.pattern.observer.mouseevent.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: maochengcheng
 * @date: 2021/10/14
 * @function: 抽象的被观察者
 */
public abstract class EventContext {

    protected Map<String,Event> events = new HashMap<>();

    public void addListener(String eventType, EventListener target, Method callback){
        events.put(eventType,new Event(target,callback));
    }

    public void addListener(String eventType, EventListener target){
        try{
            this.addListener(eventType,target,target.getClass().getMethod("on" + toUpperFirstCase(eventType),Event.class));
        }catch(NoSuchMethodException e){
            return;
        }

    }

    protected String toUpperFirstCase(String eventType){
        char [] chars = eventType.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }

    private void trigger(Event event){
        event.setSource(this);
        event.setTime(System.currentTimeMillis());

        try {
            if (event.getCallback() != null) {
                event.getCallback().invoke(event.getTarget(), event);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void trigger(String eventType){
        if(!this.events.containsKey(eventType)){return;}
        trigger(this.events.get(eventType).setTrigger(eventType));
    }
}
