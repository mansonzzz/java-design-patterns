package solid.interface_segregation.v2;

/**
 * @author zhangtian1
 * 仅需要实现必要接口
 */
public class TencentCloud implements CloudStorageProvider {

    @Override
    public String storeFile(String name) {
        return "TencentCloud";
    }

    @Override
    public String getFile(String name) {
        return "TencentCloud";
    }

}
