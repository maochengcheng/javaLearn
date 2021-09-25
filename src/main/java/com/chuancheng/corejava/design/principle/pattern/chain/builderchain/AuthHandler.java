package com.chuancheng.corejava.design.principle.pattern.chain.builderchain;

/**
 * @author: maochengcheng
 * @date: 2021/9/17
 * @function: 校验权限
 */
public class AuthHandler extends Handler {

    public void doHandler(Member member) {
        if(!"管理员".equals(member.getRoleName())){
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        System.out.println("运行操作");
    }
}
