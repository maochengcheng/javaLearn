package com.chuancheng.corejava.design.principle.pattern.command;

/**
 * @author: maochengcheng
 * @date: 2021/10/9
 * @function: 播放器
 */
public class Player {

    public void play(){
        System.out.println("播放");
    }

    public void pause(){
        System.out.println("暂停");
    }

    public void speed(){
        System.out.println("加速");
    }

    public void stop(){
        System.out.println("停止");
    }

}
