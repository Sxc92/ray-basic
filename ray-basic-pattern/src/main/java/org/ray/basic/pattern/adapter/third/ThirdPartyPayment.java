package org.ray.basic.pattern.adapter.third;

/**
 * @author 史偕成
 * @date 2024/06/16 15:00
 **/
public interface ThirdPartyPayment {

    /**
     * 支付
     *
     * @param money 支付金额
     */
    void processPayment(int money);
}
