package com.chuancheng.corejava.design.principle.pattern.chain.builderchain;

/**
 * @author: maochengcheng
 * @date: 2021/9/17
 * @function:
 */
public abstract class Handler<T> {
    public Handler next;
    public void next(Handler next){
        this.next = next ;
    }
    public abstract void doHandler(Member member);

    public static class Builder<T>{
        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> addHandler(Handler<T> handler){
            if(this.head == null){
                this.head = this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }

        public Handler<T> build(){
            return this.head;
        }
    }

}
