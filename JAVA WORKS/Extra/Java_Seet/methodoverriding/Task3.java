// Scenario 1: Shape Transformation Application
// In a shape transformation application, create a base class called "Shape" with a method called "transform." Implement different derived classes such as "Circle," "Rectangle," and "Triangle" that override the "transform" method to perform shape-specific transformations.

class Shape {
    public void transform() {
        System.out.println("Transforming Shape....");
    }
}
class Circle extends Shape {
    @Override
    public void transform() {
        System.out.println("Transforming Circle....");
    }
}
class Rectangle extends Shape {
    @Override
    public void transform() {
        System.out.println("Transforming Rectangle....");
    }
}
class Triangle extends Shape {
    @Override
    public void transform() {
        System.out.println("Transforming Triangle....");
    }
}
public class Task3 {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.transform();

        Shape rectangle = new Rectangle();
        rectangle.transform();

        Shape triangle = new Triangle();
        triangle.transform();
    }
}
