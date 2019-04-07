package structural.adapter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AdapterTests {
    @Test
    @DisplayName("Should test the adapter with existing zip code.")
    public void testExistingZipCode() {
        WeatherUI weatherUI = new WeatherUI();
        weatherUI.showTemperature(540123);
    }

    @Test
    @DisplayName("Should test the adapter with non-existing zip code.")
    public void testNonExistingZipCode() {
        WeatherUI weatherUI = new WeatherUI();
        weatherUI.showTemperature(123456);
    }
}
