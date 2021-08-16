package com.chuancheng.corejava.design.principle.pattern.flyweight.ticket;

import java.util.Random;

/**
 * @author: maochengcheng
 * @date: 2021/8/15 0015
 * @function:
 */
public class TrainTicket implements ITicket{
    private String from;
    private String to;
    private int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String type) {
        this.price = new Random().nextInt(500);
        System.out.println(from + "->" + to + " bonk:" + price);

    }
}
