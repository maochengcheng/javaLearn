package com.chuancheng.corejava.design.principle.pattern.facade.points;

/**
 * @author maochengcheng
 * @date 2021/8/8 0008
 */
public class Test {
    public static void main(String[] args) {

        FacadeService facadeService = new FacadeService();

        GiftInfo giftInfo = new GiftInfo("<<>Spring 5核心原理>>");
        facadeService.exchanage(giftInfo);


    }
}
