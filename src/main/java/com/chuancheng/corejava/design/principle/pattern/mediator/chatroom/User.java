package com.chuancheng.corejava.design.principle.pattern.mediator.chatroom;

/**
 * @author: maochengcheng
 * @date: 2021/10/13
 * @function: 用户
 */
public class User {
    private String name;

    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String msg){
        this.chatRoom.showMsg(this,msg);
    }
}
