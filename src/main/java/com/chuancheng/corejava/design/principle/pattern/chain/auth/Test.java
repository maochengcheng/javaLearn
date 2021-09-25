package com.chuancheng.corejava.design.principle.pattern.chain.auth;

/**
 * @author: maochengcheng
 * @date: 2021/9/17
 * @function: 测试类
 */
public class Test {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("mcc","管理员");

        memberService.login("mcc","ces");
    }
}
