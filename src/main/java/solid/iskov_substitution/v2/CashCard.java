package solid.iskov_substitution.v2;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author zhangtian1
 */
@Slf4j
public class CashCard extends Card {
    
    public CashCard(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }

    @Override
    boolean rule(BigDecimal amount) {
        return true;
    }

    public String withDrawl(String orderId, BigDecimal amount) {
        log.info(">>> withDrawl orderId: {}, amount: {}", orderId, amount);
        return super.negative(orderId, amount);
    }

    public String recharge(String orderId, BigDecimal amount) {
        log.info(">>> recharge orderId: {}, amount: {}", orderId, amount);
        return super.positive(orderId, amount);
    }

}
