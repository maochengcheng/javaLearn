package com.chuancheng.corejava.design.principle.pattern.adapter.demo.passport.adapterv2.adapters;

import com.chuancheng.corejava.design.principle.pattern.adapter.demo.passport.PassportService;
import com.chuancheng.corejava.design.principle.pattern.adapter.demo.passport.ResultMsg;

/**
 * @author: maochengcheng
 * @date: 2021/8/17
 * @function:
 */
public class LoginForTokenAdapter extends AbstraceAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegister(id,null);
    }

}
