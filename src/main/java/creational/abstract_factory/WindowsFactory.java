package creational.abstract_factory;

import creational.abstract_factory.button.Button;
import creational.abstract_factory.button.WindowsButton;
import creational.abstract_factory.checkbox.CheckBox;
import creational.abstract_factory.checkbox.WindowsCheckBox;

/**
 * @author zhangtian1
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
