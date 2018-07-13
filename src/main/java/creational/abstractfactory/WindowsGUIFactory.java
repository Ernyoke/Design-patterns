package creational.abstractfactory;

public class WindowsGUIFactory implements GUIFactory {
    public ButtonInterface createButton() {
        return new WindowsButton();
    }
}
