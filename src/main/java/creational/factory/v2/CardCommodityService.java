package creational.factory.v2;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author zhangtian1
 */
@Slf4j
public class CardCommodityService implements ICommodity {
    @Override
    public String sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        log.info(">>> start send [card] to user({}) for commodity({}), bizId({}), extMap({})", uId, commodityId, bizId, extMap);
        return "CARD";
    }
}
