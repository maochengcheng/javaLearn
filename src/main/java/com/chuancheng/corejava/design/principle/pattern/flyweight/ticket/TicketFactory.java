package com.chuancheng.corejava.design.principle.pattern.flyweight.ticket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: maochengcheng
 * @date: 2021/8/15 0015
 * @function:
 */
public class TicketFactory {
    private static Map<String,ITicket> pool = new ConcurrentHashMap();

    public static ITicket getTicket(String from,String to){
        String key = from + "->" + to;
        if(pool.containsKey(key)){
            System.out.println("从缓存中取数据");
            return pool.get(key);
        }
        System.out.println("首次查询，创建对象：" + key);
        ITicket ticket = new TrainTicket(from,to);
        pool.put(key,ticket);
        return ticket;
    }
}
