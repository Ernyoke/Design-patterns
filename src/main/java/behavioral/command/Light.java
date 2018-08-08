package behavioral.command;

// receiver
public class Light{
    private boolean isOn;

    public void toggle() {
        if (isOn) {
            off();
        } else {
            on();
        }
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void on() {
        System.out.println("Light switched on!");
    }

    public void off() {
        System.out.println("Light switched off!");
    }
}
