// 3. Constructor Chaining:
//    Implement a 'Rectangle' class with fields for 'length' and 'width'. Provide a default constructor that initializes these to 1, another constructor that takes only 'length' (and sets 'width' to a default value), and a constructor that takes both 'length' and 'width'. Use constructor chaining to avoid code duplication.

class Rectangle{
    private double length, width;

    public Rectangle(){
        length = width = 1.0;
    }
    public Rectangle(double length){
        this.length = length;
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    void getRectangleDetails() {
        System.out.println("Rectangle: " + (width * length));
    }
}
public class Task3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getRectangleDetails();

        Rectangle r1 = new Rectangle(10);
        r1.getRectangleDetails();

        Rectangle r2 = new Rectangle(10, 10);
        r2.getRectangleDetails();

    }
}