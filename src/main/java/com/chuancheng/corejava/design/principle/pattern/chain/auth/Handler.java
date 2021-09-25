package com.chuancheng.corejava.design.principle.pattern.chain.auth;

/**
 * @author: maochengcheng
 * @date: 2021/9/17
 * @function: 抽象
 */
public abstract class Handler {
    public Handler next;
    public void next(Handler next){
        this.next = next ;
    }
    public abstract void doHandler(Member member);

}
