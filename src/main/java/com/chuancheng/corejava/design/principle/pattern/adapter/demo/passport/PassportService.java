package com.chuancheng.corejava.design.principle.pattern.adapter.demo.passport;

import javax.xml.transform.Result;

/**
 * @author: maochengcheng
 * @date: 2021/8/17
 * @function:
 */
public class PassportService {
    /**
     * 注册
     * @param username
     * @param password
     * @return
     */
    public ResultMsg register(String username,String password){
        return new ResultMsg(200,"成功",null);
    }

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return null;
    }
}
