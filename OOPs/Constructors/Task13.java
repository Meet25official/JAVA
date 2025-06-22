//3. Rectangle Class: Implement a `Rectangle` class with constructors for its width and height, and include methods to calculate its area and perimeter.

class Rectangle{
    private int length;
    private int width;

    public Rectangle(int length , int width){
        this.length = length;
        this.width = width;
    }

    void Area(){
        System.out.println("The area of Rectangle is :- "+(length*width));
    }
    void Parameter(){
        System.out.println("The Area of this rectangle is :- "+2*(length*width));
    }
}


public class Task13 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(15,10);
        obj.Area();
        obj.Parameter();
    }
}
