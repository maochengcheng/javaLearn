package com.chuancheng.corejava.design.principle.pattern.strategy.pay;

/**
 * @author: maochengcheng
 * @date: 2021/9/15
 * @function:
 */
public class MsgResult {
    private int code;
    private Object data;
    private String msg;

    public MsgResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "MsgResult{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
