package creational.factory;

import creational.factory.v2.factory.GoodsCommodity;
import creational.factory.v2.factory.StoreFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhangtian1
 */
public class FactoryTest {

    private static StoreFactory commodityService;

    /**
     * @see creational.factory.v2.factory.StoreFactory#getCommodityService(java.lang.Class)
     * 工厂方法 1
     * 直接由工厂类创建对象
     */
    @Test
    public void test001() throws Exception {
//        var factory = new StoreFactory();
//        var commodityService = factory.getCommodityService(CouponCommodityService.class);
//        var result = commodityService.sendCommodity("10001", "EGG001", "791098764902132", null);
//        assertEquals(result, "COUPON");
    }

    /**
     * @see creational.factory.v2.factory.CardCommodity
     * @see creational.factory.v2.factory.CouponCommodity
     * @see creational.factory.v2.factory.GoodsCommodity
     */
    @Test
    public void test002() {
        configure();
        var goodsResult = commodityService.sendCommodity(1, "10001", "EGG001", "791098764902132", null);
        assertEquals(goodsResult, "GOODS");
    }

    private void configure() {
        commodityService = new GoodsCommodity();
    }

}
