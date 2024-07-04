// 1. Area Calculation:
//    Write a class `Shape` with overloaded methods `area()` to calculate the area of a circle (using radius), a rectangle (using length and breadth), and a triangle (using base and height).

class Shape {
    public static double area(int radius){
        return Math.PI * radius * radius; 
    }

    public static double area(int length, int breadth){
        return length * breadth;
    }

    public static double area(double base, double height){
        return (base * height) / 2;
    }
} 

public class Task1 {
    public static void main(String[] args) {
        double circleArea = Shape.area(5);
        System.out.println("Area of circle with radius 5: " + circleArea);
        
        double rectangleArea = Shape.area(4.0, 3.0);
        System.out.println("Area of rectangle with length 4 and breadth 3: " + rectangleArea);
        
        double triangleArea = Shape.area(6.0, 2.5);
        System.out.println("Area of triangle with base 6 and height 2.5: " + triangleArea);
    }
}
