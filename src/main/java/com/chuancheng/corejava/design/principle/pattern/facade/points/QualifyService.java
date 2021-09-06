package com.chuancheng.corejava.design.principle.pattern.facade.points;
/**
 * @author maochengcheng
 * @date 2021/8/8 0008
 * @function: 校验模板
 */
public class QualifyService {

    public boolean isAvailable(GiftInfo giftInfo){
        System.out.println("校验" + giftInfo.getName() + "积分通过,库存通过。");
        return true;
    }
}
