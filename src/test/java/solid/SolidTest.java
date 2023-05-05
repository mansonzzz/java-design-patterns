package solid;

import org.junit.jupiter.api.Test;
import solid.single_responsibility.Ostrich;
import solid.single_responsibility.Swallow;

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

}
