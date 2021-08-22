package com.chuancheng.corejava.design.principle.pattern.flyweight.general;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: maochengcheng
 * @date: 2021/8/16
 * @function:享元工厂
 */
public class FlyweightFactory {
    private static Map<String,IFlyweight> pool = new HashMap<String,IFlyweight>();

    public static IFlyweight getFlyweight(String intrinsicState){
        if(!pool.containsKey(intrinsicState)){
            IFlyweight flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState,flyweight);
        }
        return pool.get(intrinsicState);
    }

}
