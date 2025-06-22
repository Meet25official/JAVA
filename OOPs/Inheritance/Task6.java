//6. Using Super to Call Parent Class Methods:
//- Problem Statement: Implement a hierarchical inheritance system with classes 'Shape', 'Circle', and 'Rectangle'. The 'Shape' class should have a method 'area()'. Both 'Circle' and 'Rectangle' classes should override the 'area()' method. Ensure 'Circle' and 'Rectangle' call the 'area()' method from 'Shape' using 'super' and then add their specific calculations.

class Shape{
    private String type;

    public Shape(String type){
        this.type = type;
    }

    public void area(){
        System.out.println("The type of the shape is :- "+type);
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(String t,double r){
        super(t);
        radius = r;
    }

    public void areaofCircle(){
        double ar = 3.14 * radius * radius;
        super.area();
        System.out.println("The area of the circle is :- "+ar);    
    }
}

class Rectangle extends Shape{
    private double length;
    private double breagth;

    public Rectangle(String t,double l , double b){
        super(t);
        length = l;
        breagth = b;
    }

    public void areaofRectangle(){
        double a = length*breagth;
        super.area();
        System.out.println("The area of the rectangle is :- "+a);
    }
}

public class Task6 {
    public static void main(String[] args) {
        Circle obj = new Circle("Circle", 10);
        Rectangle obj2 = new Rectangle("Rectangle", 5, 10);
        obj.areaofCircle();
        obj2.areaofRectangle(); 
    }  
}
