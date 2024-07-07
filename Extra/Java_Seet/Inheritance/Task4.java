// Scenario 4: Shape Hierarchy
// Develop a shape hierarchy with a base class called "Shape" and derived classes like "Circle," "Rectangle," and "Triangle." The base class can define common attributes like color and area calculation methods, while the derived classes can implement shape-specific behavior.


class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0.0; 
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}

class Triangle extends Shape {
    double base;
    double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        System.out.println("Circle Area: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle("Blue", 3.0, 4.0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        Triangle triangle = new Triangle("Green", 2.0, 3.0);
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
}
