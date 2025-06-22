//10. Mutability and Immutability:
//Create an immutable 'Point' class with fields 'x' and 'y'. Implement a constructor to initialize these fields and do not provide any setter methods. Ensure that the fields are private and final, and write methods to get the values of 'x' and 'y'.

class  Point{
    private final int x;
    private final int y;

    public Point(int x , int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void getPoints(){
        System.out.println("("+x+", "+y+")");
    }
}

public class Task10 {
    public static void main(String[] args) {
            Point obj = new Point(3, 4);
            obj.getPoints();

            Point obj2 = new Point(1, 1);
            obj2.getPoints();
    }
}
