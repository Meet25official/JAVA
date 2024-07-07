// Scenario 1: Shape Drawing Application
// In a shape drawing application, create a base class called "Shape" with a method called "draw." Implement different derived classes such as "Circle," "Rectangle," and "Triangle" that override the "draw" method to display the respective shapes.

class Shape {
    public void draw() {
        System.out.println("Drawing a shape...");
    }
}
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}
class Triangle extends Shape {
    public void draw() {
        System.out.println("Drawing a triangle...");
    }
}
public class Task1 {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        circle.draw(); 
        rectangle.draw(); 
        triangle.draw(); 
    }
}
