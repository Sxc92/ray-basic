package org.ray.basic.pattern.adapter;

/**
 * @author 史偕成
 * @date 2024/06/16 14:59
 **/
public class InsidePayment implements Payment {
    @Override
    public void makePayment(int money) {
        System.out.println("使用内部支付渠道进行支付。。。。支付：" + money + "¥");
    }
}
