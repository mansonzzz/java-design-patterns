```java
// 伪代码

import java.util.Objects;

public class PrizeController {
    public AwardRes awardToUser(AwardReq req) {
        if (Objects.equals(req.getType(), 1)) {
            var couponService = new CouponService();
            // ... 执行操作
        } else if (Objects.equals(req.getType(), 2)) {
            var goodsService = new GoodsService();
            // ... 执行操作
        } else if (Objects.equals(req.getType(), 3)) {
            var cardService = new CardService();
            // ... 执行操作
        } else {
            var errorService = new ErrorService();
            // ... 执行操作
        }
    }
}
```

> 使用这种方式，每次新增一种类型的奖品，都需要修改代码，违反了开闭原则。