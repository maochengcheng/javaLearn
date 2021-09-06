package com.chuancheng.corejava.design.principle.pattern.facade.points;

/**
 * @author maochengcheng
 * @date 2021/8/8 0008
 * @function: 扣分模块
 */
public class PaymentService {
    public boolean pay(GiftInfo giftInfo){
        System.out.println("扣减" + giftInfo.getName() + " 积分成功");
        return true;
    }
}
