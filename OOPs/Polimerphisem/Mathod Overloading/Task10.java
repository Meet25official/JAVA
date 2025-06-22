//10. Geometry Perimeter Calculation:
//Create a class `Perimeter` with overloaded methods `calculate()` to find the perimeter of a square (using side length), a rectangle (using length and breadth), and a triangle (using the lengths of its three sides).
  
class Perimeter{
    void calculate(int l){
          System.out.println("The perimeter of the square is :- "+(l*l));  
    }

    void calculate(int l , int b){
        System.out.println("The perimeter of the rectangle is :- "+(l*b));
    }
    
    void calculate(float l){
        System.out.println("The perimeter of the triangle is :- "+(3*l));
    }
}

public class Task10 {
    public static void main(String[] args) {
        Perimeter obj = new Perimeter();
        obj.calculate(6);
        obj.calculate(3f);
        obj.calculate(2, 4);   
    }
}