package creational.factory.v2.factory;

import creational.factory.v2.GoodsCommodityService;
import creational.factory.v2.ICommodity;

/**
 * @author zhangtian1
 */
public class GoodsCommodity extends StoreFactory {
    @Override
    public ICommodity getCommodityService(Integer commodityType) {
        return new GoodsCommodityService();
    }
}
