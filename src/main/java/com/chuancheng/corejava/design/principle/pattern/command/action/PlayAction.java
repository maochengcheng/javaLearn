package com.chuancheng.corejava.design.principle.pattern.command.action;

import com.chuancheng.corejava.design.principle.pattern.command.IAction;
import com.chuancheng.corejava.design.principle.pattern.command.Player;

/**
 * @author: maochengcheng
 * @date: 2021/10/9
 * @function: 播放
 */
public class PlayAction implements IAction {

    private Player player;

    public PlayAction(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.play();
    }
}
