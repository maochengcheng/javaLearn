package com.chuancheng.corejava.design.principle.pattern.state;

/**
 * @author: maochengcheng
 * @date: 2021/10/9
 * @function: 接口
 */
public abstract class UserState {
    protected AppContext context;

    public void setContext(AppContext context) {
        this.context = context;
    }

    public abstract void favorite();

    public abstract void comment(String comment);
}
