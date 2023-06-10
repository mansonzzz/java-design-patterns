package creational.abstract_factory.button;

/**
 * @author zhangtian1
 */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("This is a Windows button!");
    }
}
