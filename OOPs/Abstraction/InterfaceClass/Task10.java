//Scenario 10: Weather Forecast Service
//Design an interface called "WeatherService" with methods like "getCurrentWeather" and "getForecast." Implement classes like "OpenWeatherMapService" and "AccuWeatherService" that provide specific implementations for these interface methods.

interface WeatherService{
    void getCurrentWeather();
    void getForecast();
}

class OpenWeatherMapService implements WeatherService{
    private String name;
    private int temp;

    public OpenWeatherMapService(String name , int temp){
        this.name = name;
        this.temp = temp;
    }

    @Override
    public void getCurrentWeather(){
        System.out.println("The weather is measured by Open Weather Map.");
        System.out.println("The name of this Place is :- "+name);
        System.out.println("The tempratuer of this place is :- "+temp);
    }

    @Override
    public void getForecast(){
        System.out.println("The Weather is fore cast.");
    }
}

class AccuWeatherService implements WeatherService{
    private String name;
    private int temp;

    public AccuWeatherService(String name , int temp){
        this.name = name;
        this.temp = temp;
    }

    @Override
    public void getCurrentWeather(){
        System.out.println("The weather is measured by Accual Weather App.");
        System.out.println("The name of this Place is :- "+name);
        System.out.println("The tempratuer of this place is :- "+temp);
    }

    @Override
    public void getForecast(){
        System.out.println("The Weather is fore cast.");
    }
}


public class Task10 {
    public static void main(String[] args) {
        OpenWeatherMapService obj1 = new OpenWeatherMapService("Gandhinagar", 33);
        AccuWeatherService obj2 = new AccuWeatherService("Ahmdabad", 35);

        obj1.getCurrentWeather();
        obj1.getForecast();

        obj2.getCurrentWeather();
        obj2.getForecast();
    }
}