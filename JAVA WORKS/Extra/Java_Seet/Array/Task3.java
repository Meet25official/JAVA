// Scenario 3: Weather Tracking
// In a weather monitoring system, create an array to store temperature data for a specific location over a period of time. Perform operations such as finding the average temperature, identifying the hottest and coldest days, and generating a temperature graph.

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        double[] temperatureData = { 25, 28, 30, 26, 24, 27, 29 }; 
        double averageTemperature = Arrays.stream(temperatureData).average().orElse(Double.NaN);

        double hottestDay = Arrays.stream(temperatureData).max().orElse(Double.NaN);
        double coldestDay = Arrays.stream(temperatureData).min().orElse(Double.NaN);

        System.out.println("Average Temperature: " + averageTemperature + "°C");
        System.out.println("Hottest Day: " + hottestDay + "°C");
        System.out.println("Coldest Day: " + coldestDay + "°C");
    }
}

