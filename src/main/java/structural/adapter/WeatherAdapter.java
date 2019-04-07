package structural.adapter;

import java.util.Optional;
public class WeatherAdapter {
    public Optional<Integer> findWeather(int zipCode) {
        return findCityByZipCode(zipCode).map(city -> {
            WeatherFinder weatherFinder = new WeatherFinderImpl();
            return weatherFinder.find(city);
        });
    }

    private Optional<String> findCityByZipCode(int zipCode) {
        // Get the city from a database
        if (String.valueOf(zipCode).startsWith("540")) {
            return Optional.of("Targu-Mures");
        }
        return Optional.empty();
    }
}
