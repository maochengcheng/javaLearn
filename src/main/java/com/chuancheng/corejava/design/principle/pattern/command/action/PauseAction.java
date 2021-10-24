package com.chuancheng.corejava.design.principle.pattern.command.action;

import com.chuancheng.corejava.design.principle.pattern.command.IAction;
import com.chuancheng.corejava.design.principle.pattern.command.Player;

/**
 * @author: maochengcheng
 * @date: 2021/10/9
 * @function: 暂停
 */
public class PauseAction implements IAction {

    private Player player;

    public PauseAction(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.pause();
    }
}
