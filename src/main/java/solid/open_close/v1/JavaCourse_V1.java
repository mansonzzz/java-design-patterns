package solid.open_close.v1;

import lombok.*;
import solid.open_close.ICourse;

import java.math.BigDecimal;

/**
 * @author zhangtian1
 */
@Getter
@Setter
@AllArgsConstructor
public class JavaCourse_V1 implements ICourse {

    private Integer id;
    private String name;
    private BigDecimal price;


    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    /**
     * 如果到了促销日，需要给部分课程打折，那么就需要修改这个方法，这样就违反了开闭原则。
     */
    @Override
    public BigDecimal getPrice() {
        return price;
    }
}
