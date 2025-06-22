//3. Constructor Chaining:
//    Implement a 'Rectangle' class with fields for 'length' and 'width'. Provide a default constructor that initializes these to 1, another constructor that takes only 'length' (and sets 'width' to a default value), and a constructor that takes both 'length' and 'width'. Use constructor chaining to avoid code duplication.


class Rectangle{
    private int length;
    private int width;

    public Rectangle(){
        length = 1;
        width = 1;
    }

    public Rectangle(int length){
        this.length = length;
        this.width = 10;
    }

    public Rectangle(int length , int width){
        this.length = length;
        this.width = width;
    }

    void Area(){
        System.out.println("The area of Rectangle is :- "+(length*width));
    }
}


public class Task3 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle(20);
        Rectangle obj3 = new Rectangle(15,10);

        obj1.Area();
        obj2.Area();
        obj3.Area();
    }
}
