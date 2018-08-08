package behavioral.command;

import java.util.List;

public class AllLightsCommand implements Command {

    private List<Light> lights;

    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    public void execute() {
        lights.stream().filter(Light::isOn).forEach(light -> light.toggle());
    }
}
