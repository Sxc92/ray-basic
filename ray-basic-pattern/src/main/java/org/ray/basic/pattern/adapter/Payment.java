package org.ray.basic.pattern.adapter;

/**
 * 系统内部支付方式
 *
 * @author 史偕成
 * @date 2024/06/16 14:58
 **/
public interface Payment {

    /**
     * 支付
     *
     * @param money 需要支付的金额
     */
    void makePayment(int money);
}
