package com.chuancheng.corejava.design.principle.pattern.adapter.demo.passport.adapterv1;

/**
 * @author: maochengcheng
 * @date: 2021/8/17
 * @function:
 */
public class Test {
    public static void main(String[] args) {
        PassportForThirdAdapter adapter = new PassportForThirdAdapter();
        adapter.login("mcc","123456");
        adapter.loginForQQ("openid123214323432432");
        adapter.loginForWechat("openid324132413214");
    }
}
