package solid.dependency_inversion.v1;

import lombok.Data;

/**
 * @author zhangtian1
 * 此时，如果更换了底层的数据库，那么BudgetRepost类就需要修改
 */
@Data
public class BudgetRepost {

    private MySQLDatabase database;

    public void open(String date) {
        database.select();
    }

    public void save() {
        database.update();
    }

}
