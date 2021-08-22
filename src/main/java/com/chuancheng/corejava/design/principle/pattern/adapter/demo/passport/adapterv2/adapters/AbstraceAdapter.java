package com.chuancheng.corejava.design.principle.pattern.adapter.demo.passport.adapterv2.adapters;

import com.chuancheng.corejava.design.principle.pattern.adapter.demo.passport.PassportService;
import com.chuancheng.corejava.design.principle.pattern.adapter.demo.passport.ResultMsg;

/**
 * @author: maochengcheng
 * @date: 2021/8/17
 * @function:
 */
public abstract class AbstraceAdapter extends PassportService implements ILoginAdapter{
    protected ResultMsg loginForRegister(String username, String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.register(username,password);
        return super.login(username,password);
    }
}
