package solid;

import org.junit.jupiter.api.Test;
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
        var course = new JavaCourse_V2(1,"Java",new BigDecimal("100"));
        assertEquals(new BigDecimal("80").multiply(new BigDecimal("1.0")), course.getPrice());
        assertEquals(new BigDecimal("100"), course.getOriginalPrice());
    }

}
