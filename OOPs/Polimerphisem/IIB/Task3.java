//3. Geometry Calculator: Create a class for calculating geometric shapes. Implement an instance initializer block to define default values for shape properties.

class Shape{
    private float pi;

    {
        pi = 3.14f;
    }

    public void properties(int radius){
        System.out.println("The circle have one peramater radius.");
        float area = pi*radius*radius;
        System.out.println("The area of circle is :- "+area);
    }

    public void properties(int length , int width){
        System.out.println("The rectangle have two perameter length and width.");
        float area = length * width;
        System.out.println("The area of rectangle is :- "+area);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Shape obj = new Shape();
        obj.properties(10);
        obj.properties(10, 15);   
    }
}