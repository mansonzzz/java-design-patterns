package creational.abstract_factory.checkbox;

/**
 * @author zhangtian1
 */
public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("This is a Windows checkbox!");
    }
}
