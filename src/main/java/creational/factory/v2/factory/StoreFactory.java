package creational.factory.v2.factory;

import creational.factory.v2.ICommodity;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author zhangtian1
 */
public abstract class StoreFactory {

    public ICommodity getCommodityService(Class<? extends ICommodity> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        if (clazz == null) {
            return null;
        }
        return clazz.getDeclaredConstructor().newInstance();
    }

    public String sendCommodity(Integer commodityType, String uId, String commodityId, String bizId, Map<String, String> extMap) {
        var commodityService = getCommodityService(commodityType);
        return commodityService.sendCommodity(uId, commodityId, bizId, extMap);
    }

    public abstract ICommodity getCommodityService(Integer commodityType);

}
