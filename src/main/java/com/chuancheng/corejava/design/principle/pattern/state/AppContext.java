package com.chuancheng.corejava.design.principle.pattern.state;

/**
 * @author: maochengcheng
 * @date: 2021/10/9
 * @function: 环境类上下文
 */
public class AppContext {

    public static final UserState STATE_LOGIN = new LoginState();
    public static final UserState STATE_UNLOGIN = new UnLoginState();

    private UserState currentState = STATE_UNLOGIN;

    {
        //初始化
        STATE_LOGIN.setContext(this);
        STATE_UNLOGIN.setContext(this);
    }

    public void setState(UserState state){
        this.currentState = state;
    }

    public UserState getState() {
        return this.currentState;
    }

    public void favorite(){
        this.currentState.favorite();
    }

    public void comment(String comment){
        this.currentState.comment(comment);
    }
}
