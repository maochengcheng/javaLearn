package com.chuancheng.corejava.design.principle.pattern.state;

/**
 * @author: maochengcheng
 * @date: 2021/10/9
 * @function: 登录
 */
public class LoginState extends UserState{
    @Override
    public void favorite() {
        System.out.println("收藏成功！");
    }

    @Override
    public void comment(String comment) {
        System.out.println("评论：" + comment);
    }
}
