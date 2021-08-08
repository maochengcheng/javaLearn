package com.chuancheng.corejava.design.principle.pattern.decorator.battercake;

/**
 * @author maochengcheng
 * @date 2021/8/8 0008
 */
public class BattercakeDecorator extends Battercake{

    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    protected String getMsg() {
        return this.battercake.getMsg();
    }


    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
