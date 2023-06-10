package creational.factory;

import creational.abstract_factory.GUIFactory;
import creational.abstract_factory.MacOSFactory;
import creational.abstract_factory.WindowsFactory;
import creational.abstract_factory.button.Button;
import creational.abstract_factory.button.MacOSButton;
import creational.abstract_factory.checkbox.CheckBox;
import creational.abstract_factory.checkbox.WindowsCheckBox;
import org.junit.jupiter.api.Test;

/**
 * @author zhangtian1
 * @see javax.xml.parsers.DocumentBuilderFactory#newInstance()
 */
public class AbstractFactoryTest {
    @Test
    public void testGetMacOSButton() {
        GUIFactory factory = new MacOSFactory();
        Button button = factory.createButton();
        button.paint();
        assert button.getClass() == MacOSButton.class;
    }

    @Test
    public void testGetWindowsCheckBox() {
        GUIFactory factory = new WindowsFactory();
        CheckBox checkBox = factory.createCheckBox();
        checkBox.paint();
        assert checkBox.getClass() == WindowsCheckBox.class;
    }
}
