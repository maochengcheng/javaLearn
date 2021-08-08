package com.chuancheng.corejava.design.principle.pattern.decorator.battercake;

/**
 * @author maochengcheng
 * @date 2021/8/8 0008
 */
public class BaseBattercake extends Battercake{
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
