package com.chuancheng.corejava.design.principle.pattern.adapter.demo.power.objectadapter;

/**
 * @author: maochengcheng
 * @date: 2021/8/17
 * @function:
 */
public class PowerAdapter implements DC5 {
    private  AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int adapterInput = ac220.outputAc220V();
        int adapterOut = adapterInput / 44;
        System.out.println("使用Adapter输入AC" + adapterInput + "V,输出DC" + adapterOut + "V");
        return adapterOut;
    }
}
