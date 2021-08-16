package com.chuancheng.corejava.design.principle.pattern.flyweight.ticket;

/**
 * @author: maochengcheng
 * @date: 2021/8/15 0015
 * @function:
 */
public class Test {
    public static void main(String[] args) {
        ITicket ticket = TicketFactory.getTicket("上海","南京");
        ticket.showInfo("软座");
        ticket = TicketFactory.getTicket("上海","南京");
        ticket.showInfo("硬座");
        ticket = TicketFactory.getTicket("上海","淮安");
        ticket.showInfo("硬座");

    }
}
