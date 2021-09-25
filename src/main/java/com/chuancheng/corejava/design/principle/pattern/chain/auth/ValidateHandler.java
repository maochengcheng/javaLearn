package com.chuancheng.corejava.design.principle.pattern.chain.auth;

import org.apache.commons.lang.StringUtils;

/**
 * @author: maochengcheng
 * @date: 2021/9/17
 * @function: 校验参数
 */
public class ValidateHandler extends Handler{
    public void doHandler(Member member) {
        if(StringUtils.isEmpty(member.getLoginName()) ||
                StringUtils.isEmpty(member.getLoginPass())){
            System.out.println("用户名或密码为空");
            return ;
        }
        System.out.println("用户名和密码不为空，可以进行下一步");
        next.doHandler(member);
    }
}
