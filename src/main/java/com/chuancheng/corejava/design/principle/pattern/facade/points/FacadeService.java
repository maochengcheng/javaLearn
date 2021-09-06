package com.chuancheng.corejava.design.principle.pattern.facade.points;
/**
 * @author maochengcheng
 * @date 2021/8/8 0008
 * @function: 门面
 */
public class FacadeService {
    QualifyService qualifyService = new QualifyService();
    PaymentService paymentService = new PaymentService();
    ShippingService shippingService = new ShippingService();

    public void exchanage(GiftInfo giftInfo){
        if(qualifyService.isAvailable(giftInfo)){
            if(paymentService.pay(giftInfo)){
                String shippingNo = shippingService.delivery(giftInfo);
                System.out.println("物流系统下单成功，物流单号是：" + shippingNo);
            }
        }
    }
}
