package creational.factory.v2.factory;

import creational.factory.v2.CardCommodityService;
import creational.factory.v2.ICommodity;

/**
 * @author zhangtian1
 */
public class CardCommodity extends StoreFactory {
    @Override
    public ICommodity getCommodityService(Integer commodityType) {
        return new CardCommodityService();
    }
}
