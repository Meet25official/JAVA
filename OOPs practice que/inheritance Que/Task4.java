//Scenario 4: Shape Hierarchy
//Develop a shape hierarchy with a base class called "Shape" and derived classes like "Circle," "Rectangle," and "Triangle." The base class can define common attributes like color and area calculation methods, while the derived classes can implement shape-specific behavior.

class Shape{
    private String type;

    public Shape(String type){
        this.type = type;
    }

    public void display(){
        System.out.println("The type of the shape is :- "+type);
    }
}

class Circle extends Shape{
    private int radius;

    public Circle(String type,int radius){
        super(type);
        this.radius = radius;
    }

    public void displayCircle(){
        super.display();
        System.out.println("The radius of the circle is :- "+radius);
        
    }

}

class Rectangle extends Shape{
    private int length;
    private int breath;

    public Rectangle(String type,int length , int breath){
        super(type);
        this.length = length;
        this.breath = breath;
    }

    public void displayRectangle(){
        super.display();
        System.out.println("The length of the rectangle is :- "+length);
        System.out.println("The breath of the rectangle is :- "+breath);
    }

}

class Triangle extends Shape{
    private int len;
    private int base;

    public Triangle(String type,int len , int base){
        super(type);
        this.len = len;
        this.base = base;
    }

    public void displayTriangle(){
        super.display();
        System.out.println("The length of the triangle is :- "+len);
        System.out.println("The base of the triangle is :- "+base);
    }

}

public class Task4 {
  public static void main(String[] args) {
        Circle obj1 = new Circle("Circle", 4);
        Rectangle obj2 = new Rectangle("Rectangle", 4, 6);
        Triangle obj3 = new Triangle("Triangle",5, 10);
        obj1.displayCircle();
        obj2.displayRectangle();
        obj3.displayTriangle();
  }  
}
