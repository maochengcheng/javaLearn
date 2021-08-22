package com.chuancheng.corejava.design.principle.pattern.adapter.demo.passport.adapterv2;

/**
 * @author: maochengcheng
 * @date: 2021/8/17
 * @function:
 */
public class Test {
    public static void main(String[] args) {
        IpassportForThird adapter = new PassportForThirdAdapter();
        adapter.loginForQQ("1321321321");
    }
}
