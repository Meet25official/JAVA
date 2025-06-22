//Scenario 2: Shape Factory
//In a shape factory application, define an abstract base class called "Shape" with a method called "createShape" that returns an instance of the "Shape" class. Implement derived classes like "Circle" and "Rectangle" that override the "createShape" method and return their specific shape objects.

class Shape{
    Shape createShape(){
        System.out.println("The Shape are many perameters :- ");
        return this;
    }
}

class Circle extends Shape{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    Circle createShape(){
        System.out.println("The circle have two perameters :- length and width");
        float ar = 3.14f*radius*radius;
        System.out.println("The area of circle is :- "+ar);
        return this;
    }
}

class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(int length , int width){
        this.length = length;
        this.width = width;
    }
    
    @Override
    Rectangle createShape(){
        System.out.println("The ractangle have two peramete");
        float ar = length * width;
        System.out.println("The area of rectangle is :- "+ar);
        return this;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Shape obj = new Shape();
        obj.createShape();

        Circle obj2 = new Circle(10);
        obj2.createShape();

        Rectangle obj3 = new Rectangle(10, 15);
        obj3.createShape();
    }  
}
