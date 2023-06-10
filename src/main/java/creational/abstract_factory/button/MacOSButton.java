package creational.abstract_factory.button;

/**
 * @author zhangtian1
 */
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("This is a MacOS button!");
    }
}
