package com.chuancheng.corejava.design.principle.pattern.bridge.message;

/**
 * @author: maochengcheng
 * @date: 2021/8/18
 * @function:
 */
public class Test {
    public static void main(String[] args) {
        IMessage message = new SmsMessage();
        AbstractMessage abstractMessage = new NormalMessage(message);
        abstractMessage.sendMessage("加班申请","毛毛");

        message = new EmailMessage();
        abstractMessage = new UrgencyMessage(message);
        abstractMessage.sendMessage("加班申请","毛毛");
    }
}
