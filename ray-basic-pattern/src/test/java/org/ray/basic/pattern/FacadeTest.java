package org.ray.basic.pattern;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.ray.basic.pattern.facade.Facade;
import org.ray.basic.pattern.facade.FacadeImpl;
import org.ray.basic.pattern.facade.bizSystem.MesSystem;
import org.ray.basic.pattern.facade.bizSystem.MesSystemImpl;
import org.ray.basic.pattern.facade.bizSystem.WmsSystem;
import org.ray.basic.pattern.facade.bizSystem.WmsSystemImpl;

/**
 * @author 史偕成
 * @date 2024/06/16 14:28
 **/

public class FacadeTest {

    private static Facade facade;

    /**
     * 在每一个测试方法前执行
     */
    @BeforeAll
    public static void before() {
        MesSystem mesSystem = new MesSystemImpl();
        WmsSystem wmsSystem = new WmsSystemImpl();
        facade = new FacadeImpl(mesSystem, wmsSystem);
    }

    /**
     * 测试门面模式
     */
    @Test
    public void run() {
        facade.produceFacade();
    }
}
