package com.chuancheng.corejava.design.principle.pattern.chain.auth;



/**
 * @author: maochengcheng
 * @date: 2021/9/17
 * @function: service
 */
public class MemberService {
    public void login(String loginName,String loginPass){
        Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();

        validateHandler.next(loginHandler);
        loginHandler.next(authHandler);
        validateHandler.doHandler(new Member(loginName,loginPass));
    }
}
