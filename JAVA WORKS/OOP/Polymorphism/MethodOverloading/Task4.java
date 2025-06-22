// 4. Temperature Conversion:
//    Implement a class `TemperatureConverter` with overloaded methods `convert()` to convert temperatures from Celsius to Fahrenheit, Fahrenheit to Celsius, and Celsius to Kelvin.

class TemperatureConverter {
    public double convert(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double convert(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double convert(double celsius, String toUnit) {
        if (toUnit.equalsIgnoreCase("kelvin")) {
            return celsius + 273.15;
        } else {
            throw new IllegalArgumentException("Unsupported conversion unit. Use 'kelvin'.");
        }
    }
}
public class Task4 {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double fahrenheit1 = converter.convert(25);
        System.out.println("25 degrees Celsius is equal to " + fahrenheit1 + " Fahrenheit");

        double celsius1 = converter.convert(80);
        System.out.println("80 degrees Fahrenheit is equal to " + celsius1 + " Celsius");

        double kelvin1 = converter.convert(100, "kelvin");
        System.out.println("100 degrees Celsius is equal to " + kelvin1 + " Kelvin");
    }
}
