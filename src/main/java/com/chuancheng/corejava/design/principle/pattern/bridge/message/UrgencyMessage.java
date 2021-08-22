package com.chuancheng.corejava.design.principle.pattern.bridge.message;

/**
 * @author: maochengcheng
 * @date: 2021/8/18
 * @function:
 */
public class UrgencyMessage extends AbstractMessage{
    public UrgencyMessage(IMessage message) {
        super(message);
    }

    void sendMessage(String message, String toUser){
        message = "[加急]" + message;
        super.sendMessage(message,toUser);
    }

    public Object watch(String messageId){
        return null;
    }
}
