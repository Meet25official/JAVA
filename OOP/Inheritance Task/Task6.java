// 6. Using Super to Call Parent Class Methods:
//    - Problem Statement: Implement a hierarchical inheritance system with classes 'Shape', 'Circle', and 'Rectangle'. The 'Shape' class should have a method 'area()'. Both 'Circle' and 'Rectangle' classes should override the 'area()' method. Ensure 'Circle' and 'Rectangle' call the 'area()' method from 'Shape' using 'super' and then add their specific calculations.

class Shape {
    double area() {
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double lenght;
    double width;

    Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    double area() {
        return lenght * width;
    }
}

public class Task6 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        System.out.println("Circle area: " + circle.area());

        Rectangle rectangle = new Rectangle(4,6);
    }    
}
