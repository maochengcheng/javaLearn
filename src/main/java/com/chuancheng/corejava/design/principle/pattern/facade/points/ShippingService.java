package com.chuancheng.corejava.design.principle.pattern.facade.points;

/**
 * @author maochengcheng
 * @date 2021/8/8 0008
 * @function: 物流系统
 */
public class ShippingService {
    public String delivery(GiftInfo giftInfo){
        System.out.println(giftInfo.getName() + "进入物流系统");
        String shippingNo = "666";
        return shippingNo;
    }
}
