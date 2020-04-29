package com.chuancheng.corejava.reflect.demo3;

public class Boy extends Person {
    public int height;

    private int weight;

    public Boy(){}

    private Boy(int height){
        this.height = height;
    }

    public Boy(int height,int weight){
        this.height = height;
        this.weight = weight;
    }

    public static void playBasketball(){
        System.out.println("play basketball !");
    }

    private void  pickUpGirl(){
        System.out.println("追女孩");
    }
}
