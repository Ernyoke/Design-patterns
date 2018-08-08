package behavioral.command;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CommandTests {

    private Switch lightSwitch;
    private Command allLightsCommand;

    private Light bedRoomLight = new Light();
    private Light kitchenLight = new Light();
    private List<Light> lights;

    @BeforeAll
    public void setUp() {
        lights = Arrays.asList(bedRoomLight, kitchenLight);
        lightSwitch = new Switch();
        allLightsCommand = new AllLightsCommand(lights);
    }

    @Test
    @DisplayName("Test toggle command!")
    public void testToggleCommand() {
        bedRoomLight.toggle();
        System.out.println("-------");
        allLightsCommand.execute();
        allLightsCommand.execute();
    }
}
