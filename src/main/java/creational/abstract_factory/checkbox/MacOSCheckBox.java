package creational.abstract_factory.checkbox;

/**
 * @author zhangtian1
 */
public class MacOSCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("This is a MacOS checkbox!");
    }
}
