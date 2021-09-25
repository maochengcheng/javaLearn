package com.chuancheng.corejava.design.principle.pattern.chain.builderchain;

/**
 * @author: maochengcheng
 * @date: 2021/9/17
 * @function: service
 */
public class MemberService {
    public void login(String loginName,String loginPass){

        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());
        builder.build().doHandler(new Member(loginName,loginPass));


    }
}
