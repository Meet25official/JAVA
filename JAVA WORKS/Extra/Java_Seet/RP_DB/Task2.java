// Scenario 2: Shape Drawing Application
// In a shape drawing application, define a base class called "Shape" with a method called "draw" that displays the shape on the screen. Implement derived classes like "Circle" and "Rectangle" that override the "draw" method with their specific drawing logic.

class Shape {
    public void draw() {
        System.out.println("Drawing a shape...");
    }
}
class Circle extends Shape {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
        System.out.println("Circle drawn successfully!");
    }
}
class Rectangle extends Shape {

    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void draw() {
        System.out.println("Drawing a rectangle with width: " + width + " and height: " + height);
        System.out.println("Rectangle drawn successfully!");
    }
}
public class Task2 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        
        circle.draw();
        rectangle.draw();
    }
}
