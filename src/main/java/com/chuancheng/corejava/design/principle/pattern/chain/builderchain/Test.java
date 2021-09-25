package com.chuancheng.corejava.design.principle.pattern.chain.builderchain;

/**
 * @author: maochengcheng
 * @date: 2021/9/17
 * @function: 测试类
 */
public class Test {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();

        memberService.login("mcc","666");
    }
}
