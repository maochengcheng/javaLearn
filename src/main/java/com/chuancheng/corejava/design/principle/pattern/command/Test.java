package com.chuancheng.corejava.design.principle.pattern.command;


import com.chuancheng.corejava.design.principle.pattern.command.action.PauseAction;
import com.chuancheng.corejava.design.principle.pattern.command.action.PlayAction;
import com.chuancheng.corejava.design.principle.pattern.command.action.SpeedAction;
import com.chuancheng.corejava.design.principle.pattern.command.action.StopAction;

/**
 * @author: maochengcheng
 * @date: 2021/10/9
 * @function: 测试
 */
public class Test {
    public static void main(String[] args) {
        Player player = new Player();
        Controller controller = new Controller();
        controller.execute(new PlayAction(player));

        System.out.println("==============宏操作===================");
        controller.addAction(new PlayAction(player));
        controller.addAction(new PauseAction(player));
        controller.addAction(new SpeedAction(player));
        controller.addAction(new StopAction(player));
        controller.executes();
    }
}
