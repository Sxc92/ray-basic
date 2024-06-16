package org.ray.basic.pattern.facade.bizSystem;

/**
 * @author 史偕成
 * @date 2024/06/16 14:24
 **/
public interface WmsSystem {

    /**
     * 计算库存
     */
    void calculateStock();

    /**
     * 扣减库存
     */
    void deductionStock();
}
