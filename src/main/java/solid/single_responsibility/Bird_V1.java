package solid.single_responsibility;

/**
 * @author zhangtian1
 */
public class Bird_V1 {

    /*
        如果存在更多的鸟，比如企鹅，那么move方法就会变得很复杂
     */
    public String move(String name) {
        if ("Swallow".equals(name)) {
            return "Fly";
        }
        if ("Ostrich".equals(name)) {
            return "Walk";
        }
        return "Unknown";
    }

}
