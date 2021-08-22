package com.chuancheng.corejava.design.principle.pattern.adapter.demo.passport.adapterv2.adapters;

import com.chuancheng.corejava.design.principle.pattern.adapter.demo.passport.ResultMsg;

/**
 * @author: maochengcheng
 * @date: 2021/8/17
 * @function:
 */
public interface ILoginAdapter {
    boolean support(Object object);
    ResultMsg login(String id,Object adapter);
}
