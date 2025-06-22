//Scenario 1: Shape Drawing Application
//In a shape drawing application, create a base class called "Shape" with a method called "draw." Implement different derived classes such as "Circle," "Rectangle," and "Triangle" that override the "draw" method to display the respective shapes.

class Shape{
    public void draw(){
        System.out.println("The shape are draw by the pencil :- ");
    }
}

class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("The circle have only one parameter is radius.");
    }
}

class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("The rectangle have two parameter is length and breadth.");
    }
}

class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("The triangle have two parameter is base and heigth.");
    }
}

public class TaskSheet1 {
    public static void main(String[] args) {
        Circle obj1 = new Circle();
        Rectangle obj2 = new Rectangle(); 
        Triangle obj3 = new Triangle(); 

        obj1.draw();
        obj2.draw();
        obj3.draw();
    }  
}