package com.chuancheng.corejava.thread.extend;

import java.util.ArrayList;
import java.util.List;

/**
 * @author maochengcheng
 * @date 2021/3/20 0020
 */
public class Allocator {
    private List<Object> list = new ArrayList<>();

    /**
     * 申请资源的方法
     * @param from
     * @param to
     * @return
     */
    synchronized boolean apply(Object from ,Object to){
        if(list.contains(from) || list.contains(to)){
            return false;
        }else{
            list.add(from);
            list.add(to);
            return true;
        }
    }
    synchronized  void free(Object from ,Object to){
        list.remove(from);
        list.remove(to);
    }
}
