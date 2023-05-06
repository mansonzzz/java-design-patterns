package solid.open_close.v2;

import solid.open_close.v1.JavaCourse_V1;

import java.math.BigDecimal;

/**
 * @author zhangtian1
 */
public class JavaCourse_V2 extends JavaCourse_V1 {

    public JavaCourse_V2(Integer id, String name, BigDecimal price) {
        super(id, name, price);
    }

    @Override
    public BigDecimal getPrice() {
        return getOriginalPrice().multiply(BigDecimal.valueOf(0.8));
    }

    public BigDecimal getOriginalPrice() {
        return super.getPrice();
    }

}
