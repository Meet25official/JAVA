// 3. Geometry Calculator: Create a class for calculating geometric shapes. Implement an instance initializer block to define default values for shape properties.

class GeometryCalculator {
    private double length;
    private double width;
    private double radius;

    {
        length = 1.0;
        width = 1.0;
        radius = 1.0;
    }

    public GeometryCalculator(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public GeometryCalculator(double radius) {
        this.radius = radius;
    }

    public double calculateRectangleArea() {
        return length * width;
    }

    public double calculateRectanglePerimeter() {
        return 2 * (length + width);
    }

    public double calculateCircleArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircleCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Task3 {
    public static void main(String[] args) {
        GeometryCalculator rectangleCalc = new GeometryCalculator(5.0, 3.0);
        System.out.println("Rectangle Area: " + rectangleCalc.calculateRectangleArea());
        System.out.println("Rectangle Perimeter: " + rectangleCalc.calculateRectanglePerimeter());

        GeometryCalculator circleCalc = new GeometryCalculator(4.0);
        System.out.println("Circle Area: " + circleCalc.calculateCircleArea());
        System.out.println("Circle Circumference: " + circleCalc.calculateCircleCircumference());
    }
}
