package com.chuancheng.corejava.design.principle.pattern.bridge.message;

/**
 * @author: maochengcheng
 * @date: 2021/8/18
 * @function:
 */
public class NormalMessage extends AbstractMessage{
    public NormalMessage(IMessage message) {
        super(message);
    }
}
