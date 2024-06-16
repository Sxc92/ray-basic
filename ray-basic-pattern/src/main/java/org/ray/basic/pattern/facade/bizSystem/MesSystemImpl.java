package org.ray.basic.pattern.facade.bizSystem;

/**
 * @author 史偕成
 * @date 2024/06/16 14:29
 **/
public class MesSystemImpl implements MesSystem {
    @Override
    public void production() {
        System.out.println("生产开始了。。。。。");
    }

    @Override
    public void finishProduct() {
        System.out.println("生产完成了。。。。。");
    }
}
