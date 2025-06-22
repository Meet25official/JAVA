// Scenario 2: Shape Factory
// In a shape factory application, define an abstract base class called "Shape" with a method called "createShape" that returns an instance of the "Shape" class. Implement derived classes like "Circle" and "Rectangle" that override the "createShape" method and return their specific shape objects.

class Shape {
    public Shape createShape() {
        return this;
    }

    @Override
    public String toString() {
        return "Shape";
    }
}
class Circle extends Shape {
    @Override
    public Shape createShape() {
        return new Circle();
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
class Rectangle extends Shape {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
class ShapeFactory {
    public static Shape getShape(String shapeType) {
        if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            return new Circle().createShape();
        } else if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
            return new Rectangle().createShape();
        }
        return null;
    }
}
public class Task2 {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        Shape shape2 = ShapeFactory.getShape("RECTANGLE");

        System.out.println("Shape 1: " + shape1);
        System.out.println("Shape 2: " + shape2);
    }
}
