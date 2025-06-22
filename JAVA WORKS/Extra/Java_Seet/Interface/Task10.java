// Scenario 10: Weather Forecast Service
// Design an interface called "WeatherService" with methods like "getCurrentWeather" and "getForecast." Implement classes like "OpenWeatherMapService" and "AccuWeatherService" that provide specific implementations for these interface methods.

interface WeatherService {
    String getCurrentWeather(String location);
    String getForecast(String location);
}

class OpenWeatherMapService implements WeatherService {
    @Override
    public String getCurrentWeather(String location) {
        String currentWeather = "Sunny, 25°C"; 
        System.out.println("Getting current weather from OpenWeatherMap for " + location + ": " + currentWeather);
        return currentWeather;
    }

    @Override
    public String getForecast(String location) {
        String forecast = "Sunny, 25-30°C for the next week"; 
        System.out.println("Getting weather forecast from OpenWeatherMap for " + location + ": " + forecast);
        return forecast;
    }
}

class AccuWeatherService implements WeatherService {
    @Override
    public String getCurrentWeather(String location) {
        String currentWeather = "Cloudy, 22°C"; 
        System.out.println("Getting current weather from AccuWeather for " + location + ": " + currentWeather);
        return currentWeather;
    }

    @Override
    public String getForecast(String location) {
        String forecast = "Cloudy, 22-27°C for the next week"; 
        System.out.println("Getting weather forecast from AccuWeather for " + location + ": " + forecast);
        return forecast;
    }
}
public class Task10 {
    public static void main(String[] args) {
        WeatherService openWeatherMapService = new OpenWeatherMapService();
        System.out.println("OpenWeatherMap - Current Weather: " + openWeatherMapService.getCurrentWeather("New York"));
        System.out.println("OpenWeatherMap - Forecast: " + openWeatherMapService.getForecast("New York"));

        WeatherService accuWeatherService = new AccuWeatherService();
        System.out.println("AccuWeather - Current Weather: " + accuWeatherService.getCurrentWeather("Los Angeles"));
        System.out.println("AccuWeather - Forecast: " + accuWeatherService.getForecast("Los Angeles"));
    }
}
