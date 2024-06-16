package org.ray.basic.pattern.adapter.third;

/**
 * @author 史偕成
 * @date 2024/06/16 15:02
 **/
public class AlipayPayment implements ThirdPartyPayment {
    @Override
    public void processPayment(int money) {
        System.out.println("使用支付宝支付成功，支付：" + money + "¥");
    }
}
