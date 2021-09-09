package com.chuancheng.corejava.design.principle.pattern.decorator.battercake;

/**
 * @author maochengcheng
 * @date 2021/8/8 0008
 */
public class SauageDecorator extends BattercakeDecorator{


    public SauageDecorator(Battercake battercake) {
        super(battercake);
    }

    protected String getMsg() {
        return super.getMsg() + " 1根香肠";
    }


    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
