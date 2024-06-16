package org.ray.basic.pattern.adapter.third;

/**
 * @author 史偕成
 * @date 2024/06/16 15:01
 **/
public class WeChatPayment implements ThirdPartyPayment {
    @Override
    public void processPayment(int money) {
        System.out.println("使用微信支付成功，支付" + money + "¥");
    }
}
