// 1. Temperature Converter: Create a class that converts temperatures between Celsius and Fahrenheit. Use an instance initializer block to set default conversion factors.

class TemperatureConverter {
    private double celsius;

    {
        celsius = 1.8;
    }
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * celsius) + 32;
    }
}
public class Task1 {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        System.out.println(converter.celsiusToFahrenheit(30));  
    }
}
