package com.chuancheng.corejava.design.principle.pattern.mediator.chatroom;

/**
 * @author: maochengcheng
 * @date: 2021/10/13
 * @function: 聊天室
 */
public class ChatRoom {

    public void showMsg(User user,String msg){
        System.out.println("[" + user.getName() + "] : " + msg);
    }
}
