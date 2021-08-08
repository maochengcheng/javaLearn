package com.chuancheng.corejava.design.principle.pattern.decorator.battercake;

/**
 * @author maochengcheng
 * @date 2021/8/8 0008
 */
public class EggDecorator extends BattercakeDecorator{


    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    protected String getMsg() {
        return super.getMsg() + "1个鸡蛋";
    }


    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
