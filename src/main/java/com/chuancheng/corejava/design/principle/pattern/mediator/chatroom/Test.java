package com.chuancheng.corejava.design.principle.pattern.mediator.chatroom;

/**
 * @author: maochengcheng
 * @date: 2021/10/13
 * @function: 测试
 */
public class Test {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User tom = new User("Tom",chatRoom);
        User mao = new User("Mao",chatRoom);

        tom.sendMessage("hi,I am Tom");
        mao.sendMessage("Hello! My name is Mao");
    }
}
