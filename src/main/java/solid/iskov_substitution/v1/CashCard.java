package solid.iskov_substitution.v1;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author zhangtian1
 */
@Slf4j
public class CashCard {


    public String withDrawl(String orderId, BigDecimal amount) {
        log.info(">>> withDrawl orderId: {}, amount: {}", orderId, amount);
        return "0000";
    }

    public String recharge(String orderId, BigDecimal amount) {
        log.info(">>> recharge orderId: {}, amount: {}", orderId, amount);
        return "0000";
    }

    public List<String> tradeFlow() {
        log.info(">>> tradeFlow");
        return List.of("0001, 100.00", "0002, 200.00", "0003, 300.00");
    }

}
