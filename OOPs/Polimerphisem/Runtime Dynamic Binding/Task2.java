//Scenario 2: Shape Drawing Application
// In a shape drawing application, define a base class called "Shape" with a method called "draw" that displays the shape on the screen. Implement derived classes like "Circle" and "Rectangle" that override the "draw" method with their specific drawing logic.

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

public class Task2 {
    public static void main(String[] args) {
        Circle obj1 = new Circle();
        Rectangle obj2 = new Rectangle(); 
        Triangle obj3 = new Triangle(); 

        obj1.draw();
        obj2.draw();
        obj3.draw();
    }  
}