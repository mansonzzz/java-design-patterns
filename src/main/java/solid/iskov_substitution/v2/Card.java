package solid.iskov_substitution.v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author zhangtian1
 */
@Slf4j
@Data
@AllArgsConstructor
public abstract class Card {

    private String cardNo;
    private String cardDate;

    abstract boolean rule(BigDecimal amount);

    public String positive(String orderId, BigDecimal amount) {
        log.info(">>> positive orderId: {}, amount: {}", orderId, amount);
        return "0000";
    }

    public String negative(String orderId, BigDecimal amount) {
        log.info(">>> negative orderId: {}, amount: {}", orderId, amount);
        return "0000";
    }

    public List<String> tradeFlow() {
        log.info(">>> tradeFlow");
        return List.of("0001, 100.00", "0002, 200.00", "0003, 300.00");
    }
}
