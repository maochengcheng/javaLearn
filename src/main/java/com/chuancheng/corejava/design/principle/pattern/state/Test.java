package com.chuancheng.corejava.design.principle.pattern.state;

/**
 * @author: maochengcheng
 * @date: 2021/10/9
 * @function: 测试类
 */
public class Test {
    public static void main(String[] args) {
        AppContext context = new AppContext();
        context.favorite();
        context.comment("好文章，36个赞");
    }
}
