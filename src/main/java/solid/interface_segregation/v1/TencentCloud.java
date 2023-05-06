package solid.interface_segregation.v1;

import java.util.List;

/**
 * @author zhangtian1
 */
public class TencentCloud implements CloudProvider {
    @Override
    public String storeFile(String name) {
        return "TencentCloud";
    }

    @Override
    public String getFile(String name) {
        return "TencentCloud";
    }

    /*
        TencentCloud 并不提供创建服务器的功能，但是由于实现了 CloudProvider 接口，所以必须实现该方法
        这就违反了接口隔离原则
     */
    @Override
    public String createServer(String region) {
        return null;
    }

    @Override
    public List<String> listServers(String region) {
        return null;
    }

    @Override
    public String getCDNAddress(String cdn) {
        return null;
    }
}
