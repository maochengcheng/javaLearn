package com.chuancheng.corejava.design.principle.pattern.bridge.message;

/**
 * @author: maochengcheng
 * @date: 2021/8/18
 * @function:
 */
public interface IMessage {
    //发送消息
    void send(String message,String toUser);
}
