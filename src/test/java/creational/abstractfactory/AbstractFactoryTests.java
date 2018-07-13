package creational.abstractfactory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AbstractFactoryTests {
    private AbstractFactory abstractFactory;

    @BeforeAll
    public void setUp() {
        abstractFactory = new AbstractFactory();
    }

    @Test
    @DisplayName("Should return a Windows button.")
    public void shouldReturnWindowsButton() throws Exception {
        ButtonInterface button = abstractFactory.getGUIFactory(AbstractFactory.OS.WINDOWS).createButton();

        Assertions.assertThat(button).isNotNull();
        Assertions.assertThat(button instanceof WindowsButton).isTrue();
    }

    @Test
    @DisplayName("Should return a OSX button.")
    public void shouldReturnOSXsButton() throws Exception {
        ButtonInterface button = abstractFactory.getGUIFactory(AbstractFactory.OS.OSX).createButton();

        Assertions.assertThat(button).isNotNull();
        Assertions.assertThat(button instanceof OSXButton).isTrue();
    }

    @Test
    @DisplayName("Should Linux a OSX button.")
    public void shouldReturnLinuxButton() throws Exception {
        ButtonInterface button = abstractFactory.getGUIFactory(AbstractFactory.OS.LINUX).createButton();

        Assertions.assertThat(button).isNotNull();
        Assertions.assertThat(button instanceof LinuxButton).isTrue();
    }
}
