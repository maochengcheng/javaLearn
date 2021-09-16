package com.chuancheng.corejava.design.principle.pattern.delegate.simple;

/**
 * @author: maochengcheng
 * @date: 2021/9/13
 * @function: 测试类
 */
public class Test {
    public static void main(String[] args) {

        new Boss().command("海报图",new Leader());
        new Boss().command("爬虫",new Leader());
        new Boss().command("产品",new Leader());

    }
}
