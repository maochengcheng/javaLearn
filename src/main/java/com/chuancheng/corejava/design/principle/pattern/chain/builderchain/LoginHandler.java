package com.chuancheng.corejava.design.principle.pattern.chain.builderchain;

/**
 * @author: maochengcheng
 * @date: 2021/9/17
 * @function: 登录
 */
public class LoginHandler extends Handler {
    public void doHandler(Member member) {
        System.out.println("登录成功");
        member.setRoleName("管理员");
        next.doHandler(member);
    }
}
