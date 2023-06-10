package creational.abstract_factory;

import creational.abstract_factory.button.Button;
import creational.abstract_factory.checkbox.CheckBox;

/**
 * @author zhangtian1
 */
public interface GUIFactory {
    Button createButton();

    CheckBox createCheckBox();
}
