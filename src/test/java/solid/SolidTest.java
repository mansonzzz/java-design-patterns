package solid;

import org.junit.jupiter.api.Test;
import solid.iskov_substitution.v2.CashCard;
import solid.iskov_substitution.v2.CreditCard;
import solid.open_close.v2.JavaCourse_V2;
import solid.single_responsibility.Ostrich;
import solid.single_responsibility.Swallow;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhangtian1
 */
public class SolidTest {

    /*
     * 接口的单一职责
     * 实现类实现多个接口
     */
    @Test
    public void test001Single_Responsibility() {
        var swallow = new Swallow();
        String moveMethod = swallow.move();
        assertEquals("Fly", moveMethod);

        var ostrich = new Ostrich();
        moveMethod = ostrich.move();
        assertEquals("Walk", moveMethod);
    }

    @Test
    public void test002Open_Close() {
        var course = new JavaCourse_V2(1, "Java", new BigDecimal("100"));
        assertEquals(new BigDecimal("80").multiply(new BigDecimal("1.0")), course.getPrice());
        assertEquals(new BigDecimal("100"), course.getOriginalPrice());
    }

    @Test
    public void test003Liskov_Substitution() {
        var cashCard = new CashCard("0001", "2020-01-01");
        var withDrawlResult = cashCard.withDrawl("0001", new BigDecimal("100"));
        var rechargeResult = cashCard.recharge("0001", new BigDecimal("100"));

        assertEquals("0000", withDrawlResult);
        assertEquals("0000", rechargeResult);

        var creditCard = new CreditCard("0002", "2020-01-01");
        var loanResult = creditCard.loan("0002", new BigDecimal("101"));
        var repaymentResult = creditCard.repayment("0002", new BigDecimal("100"));

        assertEquals("0001", loanResult);
        assertEquals("0000", repaymentResult);
    }

}
