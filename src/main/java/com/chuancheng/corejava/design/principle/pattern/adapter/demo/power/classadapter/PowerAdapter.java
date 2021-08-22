package com.chuancheng.corejava.design.principle.pattern.adapter.demo.power.classadapter;

/**
 * @author: maochengcheng
 * @date: 2021/8/17
 * @function:
 */
public class PowerAdapter extends AC220 implements DC5{
    @Override
    public int output5V() {
        int adapterInput = super.outputAc220V();
        int adapterOut = adapterInput / 44;
        System.out.println("使用Adapter输入AC" + adapterInput + "V,输出DC" + adapterOut + "V");
        return adapterOut;
    }
}
