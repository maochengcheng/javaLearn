package com.chuancheng.corejava.design.principle.pattern.delegate.simple;

/**
 * @author: maochengcheng
 * @date: 2021/9/13
 * @function: boss类
 */
public class Boss {
    public void command(String task,Leader leader) {
        leader.doing(task);
    }
}
