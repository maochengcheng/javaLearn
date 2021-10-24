package com.chuancheng.corejava.design.principle.pattern.observer.gper;

import java.util.Observable;

/**
 * @author: maochengcheng
 * @date: 2021/10/13
 * @function: gp社区
 */
public class GPer extends Observable {
    private String name = "GPer生态圈";
    private static final GPer gper = new GPer();

    public GPer() {

    }

    public String getName() {
        return name;
    }

    public static GPer getInstance(){
        return gper;
    }

    public void publicQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
