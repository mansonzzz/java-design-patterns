package creational.abstract_factory;

import creational.abstract_factory.button.Button;
import creational.abstract_factory.button.MacOSButton;
import creational.abstract_factory.checkbox.CheckBox;
import creational.abstract_factory.checkbox.MacOSCheckBox;

/**
 * @author zhangtian1
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
