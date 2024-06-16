package org.ray.basic.pattern.facade;

/**
 * 外观模式（门面模式） 英文：Facade
 * 它提供了一个统一的接口，用来访问子系统中的一群接口，从而让子系统更容易使用
 *
 * @author 史偕成
 * @date 2024/06/15 12:12
 **/
public interface Facade {

    /**
     * 生产门面
     */
    void produceFacade();
}
