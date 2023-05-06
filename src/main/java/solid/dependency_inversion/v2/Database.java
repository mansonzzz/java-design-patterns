package solid.dependency_inversion.v2;

/**
 * @author zhangtian1
 */
public interface Database {

    void select();

    void insert();

    void update();

    void delete();

}
