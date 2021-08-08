package com.chuancheng.corejava.design.principle.pattern.decorator.battercake;

/**
 * @author maochengcheng
 * @date 2021/8/8 0008
 */
public class Test {
    public static void main(String[] args) {

        Battercake battercake;

        battercake = new BaseBattercake();

        battercake = new EggDecorator(battercake);

        battercake = new SauageDecorator(battercake);

        System.out.println(battercake.getMsg() +",总价 " + battercake.getPrice());
    }
}
