package com.chuancheng.corejava.design.principle.pattern.bridge.message;

/**
 * @author: maochengcheng
 * @date: 2021/8/18
 * @function:
 */
public abstract class AbstractMessage {
    private IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }

    void sendMessage(String message,String toUser){
        this.message.send(message,toUser);
    }
}
