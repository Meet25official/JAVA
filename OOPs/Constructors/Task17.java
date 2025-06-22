//8. Circle Class: Create a `Circle` class with a constructor to specify the radius and methods to compute its circumference and area.

class Circle{
    private int radius;

    public Circle(int r){ 
        radius = r;
    }

    public void area(){
        double a;
        a = 3.14 * radius * radius;
        System.out.println("The area of the circle is :- "+a);
    }
    public void circumference(){
        double p;
        p = 2*3.14*radius;
        System.out.println("The circumference of the circle is :- "+p);
    }
}
public class Task17 {
    public static void main(String[] args) {
        Circle obj = new Circle(10);
        obj.area();
        obj.circumference();
    }
}
