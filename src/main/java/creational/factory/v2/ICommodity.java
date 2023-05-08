package creational.factory.v2;

import java.util.Map;

/**
 * @author zhangtian1
 */
public interface ICommodity {

    /**
     * 抽象出共有方法
     */
    String sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap);

}
