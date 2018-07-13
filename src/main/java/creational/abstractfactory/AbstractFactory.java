package creational.abstractfactory;

public class AbstractFactory {
    public enum OS {
        WINDOWS, OSX, LINUX
    }

    public GUIFactory getGUIFactory(OS os) throws Exception {
        switch (os) {
            case WINDOWS:
                return new WindowsGUIFactory();
            case OSX:
                return new OSXGUIFactory();
            case LINUX:
                return new LinuxGUIFactory();
            default:
                throw new Exception("Operating system not supported!");
        }
    }
}
