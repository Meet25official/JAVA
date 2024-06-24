// 8. Circle Class: Create a `Circle` class with a constructor to specify the radius and methods to compute its circumference and area.

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}

public class Task8 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Circumference: " + circle.circumference());
        System.out.println("Area: " + circle.area());
    }
}

