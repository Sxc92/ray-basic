package org.ray.basic.pattern;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.ray.basic.pattern.adapter.InsidePayment;
import org.ray.basic.pattern.adapter.Payment;
import org.ray.basic.pattern.adapter.PaymentAdapter;
import org.ray.basic.pattern.adapter.third.AlipayPayment;
import org.ray.basic.pattern.adapter.third.ThirdPartyPayment;

/**
 * 适配器模式
 *
 * @author 史偕成
 * @date 2024/06/16 15:12
 **/
public class AdapterTest {
    private static Payment payment;

    @BeforeAll
    public static void before() {
        ThirdPartyPayment thirdPay = new AlipayPayment();
        payment = new PaymentAdapter(thirdPay, new InsidePayment());
    }

    @Test
    public void test() {
        payment.makePayment(100);
    }
}
