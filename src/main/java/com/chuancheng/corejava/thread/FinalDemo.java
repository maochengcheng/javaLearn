package com.chuancheng.corejava.thread;

import java.util.HashMap;
import java.util.Map;

/**
 * @author maochengcheng
 * @date 2021/3/17 0017
 */
public class FinalDemo {
    private final Map<String,String> states;

    public FinalDemo(){
        states = new HashMap<>();
        states.put("mcc","mcc");
    }

}
