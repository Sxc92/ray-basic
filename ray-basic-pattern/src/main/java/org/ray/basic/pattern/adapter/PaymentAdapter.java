package org.ray.basic.pattern.adapter;

import lombok.RequiredArgsConstructor;
import org.ray.basic.pattern.adapter.third.ThirdPartyPayment;

/**
 * 适配器类
 *
 * @author 史偕成
 * @date 2024/06/16 15:04
 **/
@RequiredArgsConstructor
public class PaymentAdapter implements Payment {

    /**
     * 系统内部钱包金额上限
     */
    private final static int WALLET_UPPER_LIMIT = 10;

    private final ThirdPartyPayment thirdPartyPayment;

    private final InsidePayment insidePayment;

    @Override
    public void makePayment(int money) {
        if (money >= WALLET_UPPER_LIMIT) {
            insidePayment.makePayment(WALLET_UPPER_LIMIT);
            money = money - WALLET_UPPER_LIMIT;
        } else {
            insidePayment.makePayment(money);
        }
        if (money > 0) {
            thirdPartyPayment.processPayment(money);
        }
    }
}
