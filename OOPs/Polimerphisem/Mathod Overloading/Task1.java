//1. Area Calculation:
//   Write a class `Shape` with overloaded methods `area()` to calculate the area of a circle (using radius), a rectangle (using length and breadth), and a triangle (using base and height).


class Shape{
    public void area(){
        System.out.println("The area is in below");
    }
    public void area(float radius){
        float a = 3.14f*radius*radius;
        System.out.println("The area of the Circle is :- "+a);
    }
    public void area(float length , float breadth){
        float a1 = length*breadth;
        System.out.println("The area of the Rectangle is :- "+a1);
    }
    public void area(double base , double height){
        double a2 = (1.0/2.0)*base*height;
        System.out.println("The area of the Triangle is :- "+a2);
    }
}



public class Task1 {
    public static void main(String[] args) {
        Shape obj = new Shape();
        obj.area();
        obj.area(10);
        obj.area(4f, 5f);
        obj.area(3.7, 6.8);
    }
}
