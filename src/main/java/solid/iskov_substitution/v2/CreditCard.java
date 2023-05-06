package solid.iskov_substitution.v2;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author zhangtian1
 */
@Slf4j
public class CreditCard extends CashCard {


    public CreditCard(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }

    private boolean creditRule(BigDecimal amount) {
        return amount.compareTo(new BigDecimal("100")) <= 0;
    }

    public String loan(String orderId, BigDecimal amount) {
        var rule = creditRule(amount);
        if (!rule) {
            return "0001";
        }
        log.info(">>> loan orderId: {}, amount: {}", orderId, amount);
        return super.negative(orderId, amount);
    }

    public String repayment(String orderId, BigDecimal amount) {
        log.info(">>> repayment orderId: {}, amount: {}", orderId, amount);
        return super.positive(orderId, amount);
    }

}
