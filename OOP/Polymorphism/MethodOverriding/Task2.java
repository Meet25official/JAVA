// 2. Problem: Design a simple shape hierarchy with classes like `Circle` and `Rectangle`. Implement method overriding to calculate the area of these shapes.
//    - Example: Create a superclass `Shape` with an overridden `calculateArea` method in subclasses like `Circle` and `Rectangle`.

class Shape {
    public double calculateArea(){
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Area of circle with radius 5: " + circle.calculateArea());
        System.out.println("Area of rectangle with length 4 and width 6: " + rectangle.calculateArea());
    }
}
