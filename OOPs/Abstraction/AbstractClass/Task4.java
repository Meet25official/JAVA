//Scenario 4: Shape Calculation
//Create an abstract class called "Shape" with abstract methods like "calculateArea" and "calculatePerimeter." Implement derived classes like "Circle" and "Rectangle" that provide specific implementations for these abstract methods.

abstract class Shape{
    private String type;

    public Shape(String type){
        this.type = type;
    }

    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Circle extends Shape{
    private double radius;

    public Circle(String type ,double radius){
        super(type);
        this.radius = radius;
    }

    @Override
    void calculateArea(){
        double ar = 3.14*radius*radius;
        System.out.println("The area of the Circle is :- "+ar);
    }

    @Override
    void calculatePerimeter(){
        double per = 2*3.14*radius;
        System.out.println("The perimeter of the Circle :- "+per);
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String type ,double length , double width){
        super(type);
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea(){
        double ar = length * width;
        System.out.println("The area of the Rectangle is :- "+ar);
    }

    @Override
    void calculatePerimeter(){
        double per = 2*(length + width);
        System.out.println("The perimeter of the Rectangle :- "+per);
    }
}

public class Task4 {
    public static void main(String[] args) {
        Circle obj1 = new Circle("Circle", 10);
        Rectangle obj2 = new Rectangle("Rectangle", 10, 20);
        obj1.calculateArea();
        obj1.calculatePerimeter();
        obj2.calculateArea();
        obj2.calculatePerimeter();
    }
}