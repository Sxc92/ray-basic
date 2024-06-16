package org.ray.basic.pattern.facade.bizSystem;

/**
 * @author 史偕成
 * @date 2024/06/16 14:30
 **/
public class WmsSystemImpl implements WmsSystem {
    @Override
    public void calculateStock() {
        System.out.println("开始计算物料库存足不足。。。。。");
    }

    @Override
    public void deductionStock() {
        System.out.println("扣减库存成功。。。。。");
    }
}
