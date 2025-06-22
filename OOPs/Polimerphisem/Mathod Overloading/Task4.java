//4. Temperature Conversion:
//Implement a class `TemperatureConverter` with overloaded methods `convert()` to convert temperatures from Celsius to Fahrenheit, Fahrenheit to Celsius, and Celsius to Kelvin.

class TemperatureConverter{
    void convert(int cel){
        double fer = (9.0/5.0)*cel + 32;
        System.out.println("The Celsius to feranhit is :- "+fer);
    }
    void convert(float fer){
        double cel = (5.0/9.0)*(fer - 32.0);
        System.out.println("The Fernhit to Celcius is :- "+cel);
    }
    void convert(double cel){
        double kel = cel + 273;
        System.out.println("The Celsius to Kelvin is :- "+kel);
    }
}

public class Task4 {
    public static void main(String[] args) {
        TemperatureConverter obj = new TemperatureConverter();
        obj.convert(25);
        obj.convert(90.0f);
        obj.convert(100.0);
    }  
}