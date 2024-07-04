// 10. Geometry Perimeter Calculation:
//    Create a class `Perimeter` with overloaded methods `calculate()` to find the perimeter of a square (using side length), a rectangle (using length and breadth), and a triangle (using the lengths of its three sides).
 
class Perimeter {
    public double calculate(double sideLength) {
        return 4 * sideLength;
    }

    public double calculate(double length, double breadth) {
        return 2 * (length + breadth);
    }

    public double calculate(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }
}
public class Task10 {
    public static void main(String[] args) {
        Perimeter perimeterCalculator = new Perimeter();

        double squarePerimeter = perimeterCalculator.calculate(5.0);
        System.out.println("Perimeter of square with side length 5: " + squarePerimeter);

        double rectanglePerimeter = perimeterCalculator.calculate(4.0, 6.0);
        System.out.println("Perimeter of rectangle with length 4 and breadth 6: " + rectanglePerimeter);

        double trianglePerimeter = perimeterCalculator.calculate(3.0, 4.0, 5.0);
        System.out.println("Perimeter of triangle with sides 3, 4, and 5: " + trianglePerimeter);
    }
}
