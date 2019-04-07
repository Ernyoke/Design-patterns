package structural.adapter;

public class WeatherUI {
    public void showTemperature(int zipCode) {
        WeatherAdapter weatherAdapter = new WeatherAdapter();
        weatherAdapter.findWeather(zipCode)
                .ifPresentOrElse(System.out::println, () -> System.out.println("Invalid zip-code!"));
    }
}
