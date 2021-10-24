package com.chuancheng.corejava.design.principle.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: maochengcheng
 * @date: 2021/10/9
 * @function: controller
 */
public class Controller {
    public List<IAction> actions = new ArrayList<>();

    public void addAction(IAction action){
        actions.add(action);
    }

    public void execute(IAction action){
        action.execute();
    }

    public void executes(){
        for (IAction action: actions) {
            action.execute();
        }
        actions.clear();
    }
}
