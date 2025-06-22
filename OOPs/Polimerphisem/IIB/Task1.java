//1. Temperature Converter: Create a class that converts temperatures between Celsius and Fahrenheit. Use an instance initializer block to set default conversion factors.

class Temperature{
    int a;
    float b;
    float c;

    {
         a = 32;
         b = 5.0f;
         c = 9.0f;
    }

    public void Converter(int celsius){
        float fern = (c/b)*celsius - a;
        System.out.println("The temprature celsius to feranhit :- "+fern); 
    }
     
    public void Converter(float feranhit){
        float cel = (feranhit - a)*(b/c);
        System.out.println("The temprature converts to fernahit to celsius :- "+cel);
    }
}


public class Task1 {
    public static void main(String[] args) {
        Temperature obj = new Temperature();
        obj.Converter(50);
        obj.Converter(90.0f);
    }
}
