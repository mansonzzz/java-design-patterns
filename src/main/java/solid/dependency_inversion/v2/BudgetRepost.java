package solid.dependency_inversion.v2;

import lombok.Data;

/**
 * @author zhangtian1
 * 此时，BudgetRepost类不再依赖于具体的数据库实现，而是依赖于抽象的Database接口
 */
@Data
public class BudgetRepost {

    private Database database;

    public void open(String date) {
        database.select();
    }

    public void save() {
        database.update();
    }

}
