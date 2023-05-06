package solid.interface_segregation.v2;

/**
 * @author zhangtian1
 */
public interface CloudStorageProvider {

    String storeFile(String name);

    String getFile(String name);

}
