package com.chuancheng.corejava.design.principle.pattern.adapter.demo.power.classadapter;

/**
 * @author: maochengcheng
 * @date: 2021/8/17
 * @function:
 */
public class AC220 {
    public int outputAc220V(){
        int output = 220;
        System.out.println("输出电压" +output + "v");
        return output;
    }
}
