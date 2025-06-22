//Scenario 1: Shape Transformation Application
// In a shape transformation application, create a base class called "Shape" with a method called "transform." Implement different derived classes such as "Circle," "Rectangle," and "Triangle" that override the "transform" method to perform shape-specific transformations.


class Shape{
    public void transform(){
        System.out.println("The shape are transform.");
    }
}

class Circle extends Shape{
    @Override
    public void transform(){
        System.out.println("The shape is transform to circle");
    }
}

class Rectangle extends Shape{
    @Override
    public void transform(){
        System.out.println("The shape is transform to Rectangle");
    }
}

class Triangle extends Shape{
    @Override
    public void transform(){
        System.out.println("The shape is transform to Triangle.");
    }
}


public class TaskSheet3 {
    public static void main(String[] args) {
        Circle obj1 = new Circle();
        Rectangle obj2 = new Rectangle(); 
        Triangle obj3 = new Triangle(); 

        obj1.transform();
        obj2.transform();
        obj3.transform();
    }
}
