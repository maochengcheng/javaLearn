package com.chuancheng.corejava.design.principle.pattern.adapter.demo.passport.adapterv2;

import com.chuancheng.corejava.design.principle.pattern.adapter.demo.passport.ResultMsg;

/**
 * @author: maochengcheng
 * @date: 2021/8/17
 * @function:
 */
public interface IpassportForThird {
    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String phone,String code);
}
