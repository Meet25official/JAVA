//2. Problem: Design a simple shape hierarchy with classes like `Circle` and `Rectangle`. Implement method overriding to calculate the area of these shapes.
//- Example: Create a superclass `Shape` with an overridden `calculateArea` method in subclasses like `Circle` and `Rectangle`.

class Shape{
    void area(){
        System.out.println("The area of the shape is show in below :- ");
    }
}

class Circle extends Shape{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    void area(){
        float ar = 3.14f * radius * radius;
        System.out.println("The area of the circle is :- "+ar);
    }
}

class Rectangle extends Shape{
    private int length;
    private int widht;

    public Rectangle(int length , int widht){
        this.length = length;
        this.widht = widht;    
    }
    @Override
    public void area(){
        float ar = length * widht;
        System.out.println("The area of the rectangle is  :- "+ar);
    }
}

public class Task2 {
    public static void main(String[] args) {
        Circle obj = new Circle(10);
        Rectangle obj2 = new Rectangle(10, 13);
        obj.area();
        obj2.area();
    }
}