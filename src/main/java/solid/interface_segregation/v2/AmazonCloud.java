package solid.interface_segregation.v2;

import java.util.List;

/**
 * @author zhangtian1
 */
public class AmazonCloud implements CloudHostingProvider, CloudStorageProvider, CDNProvider {

    @Override
    public String storeFile(String name) {
        return "AmazonCloud";
    }

    @Override
    public String getFile(String name) {
        return "AmazonCloud";
    }

    @Override
    public String createServer(String region) {
        return "AmazonCloud";
    }

    @Override
    public List<String> listServers(String region) {
        return List.of("AmazonCloud");
    }

    @Override
    public String getCDNAddress(String cdn) {
        return "AmazonCloud";
    }
    
}
