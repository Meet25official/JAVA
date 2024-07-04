// Scenario 2: Shape Factory
// In a shape factory application, define an abstract base class called "Shape" with a method called "createShape" that returns an instance of the "Shape" class. Implement derived classes like "Circle" and "Rectangle" that override the "createShape" method and return their specific shape objects.

class Shape {
    public Shape createShape() {
        return new Shape();
    }

    public void draw() {
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape {
    @Override
    public Shape createShape() {
        return new Circle();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
class Rectangle extends Shape {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
public class Task2 {
    public static void main(String[] args) {
        Shape circle = new Circle().createShape();
        Shape rectangle = new Rectangle().createShape();

        circle.draw();
        rectangle.draw();
    }
}
