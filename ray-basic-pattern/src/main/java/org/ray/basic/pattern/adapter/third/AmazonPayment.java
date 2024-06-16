package org.ray.basic.pattern.adapter.third;

import org.ray.basic.pattern.adapter.Payment;

/**
 * @author 史偕成
 * @date 2024/06/16 15:03
 **/
public class AmazonPayment implements ThirdPartyPayment {
    @Override
    public void processPayment(int money) {
        System.out.println("使用亚马逊支付成功，支付：" + money + "¥");
    }
}
