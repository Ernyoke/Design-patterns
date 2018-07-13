package creational.abstractfactory;

public class OSXGUIFactory implements GUIFactory {
    public ButtonInterface createButton() {
        return new OSXButton();
    }
}
