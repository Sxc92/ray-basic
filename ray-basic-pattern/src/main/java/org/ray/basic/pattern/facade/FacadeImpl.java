package org.ray.basic.pattern.facade;

import lombok.RequiredArgsConstructor;
import org.ray.basic.pattern.facade.bizSystem.MesSystem;
import org.ray.basic.pattern.facade.bizSystem.WmsSystem;

/**
 * @author 史偕成
 * @date 2024/06/16 14:25
 **/
@RequiredArgsConstructor
public class FacadeImpl implements Facade {

    private final MesSystem mesSystem;

    private final WmsSystem wmsSystem;

    /**
     * 聚合业务接口，同一输出
     */
    @Override
    public void produceFacade() {
        wmsSystem.calculateStock();
        mesSystem.production();
        mesSystem.finishProduct();
        wmsSystem.deductionStock();
    }
}
