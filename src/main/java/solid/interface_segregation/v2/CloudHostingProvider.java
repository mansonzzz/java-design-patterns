package solid.interface_segregation.v2;

import java.util.List;

/**
 * @author zhangtian1
 */
public interface CloudHostingProvider {

    String createServer(String region);

    List<String> listServers(String region);

}
