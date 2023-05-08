package creational.factory.v2.factory;

import creational.factory.v2.CouponCommodityService;
import creational.factory.v2.ICommodity;

/**
 * @author zhangtian1
 */
public class CouponCommodity extends StoreFactory {
    @Override
    public ICommodity getCommodityService(Integer commodityType) {
        return new CouponCommodityService();
    }
}
