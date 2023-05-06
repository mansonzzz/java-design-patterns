package solid.interface_segregation.v1;

import java.util.List;

/**
 * @author zhangtian1
 */
public interface CloudProvider {

    String storeFile(String name);

    String getFile(String name);

    String createServer(String region);

    List<String> listServers(String region);

    String getCDNAddress(String cdn);

}
