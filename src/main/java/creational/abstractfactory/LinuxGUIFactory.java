package creational.abstractfactory;

public class LinuxGUIFactory implements GUIFactory {
    public ButtonInterface createButton() {
        return new LinuxButton();
    }
}
