package solid.iskov_substitution.v1;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author zhangtian1
 * 复用了父类的核心逻辑功能，但是也破坏了原有方法
 * 信用卡类并不能直接承担储蓄卡的功能
 */
@Slf4j
public class CreditCard extends CashCard {

    @Override
    public String withDrawl(String orderId, BigDecimal amount) {
        log.info(">>> withDrawl CreditCard orderId: {}, amount: {}", orderId, amount);
        return "0001";
    }

    @Override
    public String recharge(String orderId, BigDecimal amount) {
        log.info(">>> recharge CreditCard orderId: {}, amount: {}", orderId, amount);
        return "0001";
    }

    @Override
    public List<String> tradeFlow() {
        return super.tradeFlow();
    }
}
