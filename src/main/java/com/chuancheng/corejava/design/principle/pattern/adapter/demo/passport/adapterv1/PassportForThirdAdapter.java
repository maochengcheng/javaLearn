package com.chuancheng.corejava.design.principle.pattern.adapter.demo.passport.adapterv1;

import com.chuancheng.corejava.design.principle.pattern.adapter.demo.passport.PassportService;
import com.chuancheng.corejava.design.principle.pattern.adapter.demo.passport.ResultMsg;

/**
 * @author: maochengcheng
 * @date: 2021/8/17
 * @function:
 */
public class PassportForThirdAdapter extends PassportService implements IpassportForThird {

    @Override
    public ResultMsg loginForQQ(String openId) {
        return loginForRegister(openId,null);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return loginForRegister(openId,null);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return loginForRegister(token,null);
    }

    @Override
    public ResultMsg loginForTelphone(String phone, String code) {
        return loginForRegister(phone,null);
    }

    private ResultMsg loginForRegister(String username,String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.register(username,password);
        return super.login(username,password);
    }
}
