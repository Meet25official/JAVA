//6. Distance Calculation:
//Create a class `DistanceCalculator` with overloaded methods `distance()` to calculate the distance between two points in a 2D plane (using two points), three points in a 3D space (using three points), and between two points on a number line.

class DistanceCalculator{
     void distance(int x1 , int x2){
        System.out.println("The distance between two points is :- "+(x2-x1));
     }   
     void distance(int x1 , int x2 , int x3){
        System.out.println("The distance between three points is "+(x1 + x2 + x3)/3);
     }
} 

public class Task6 {
    public static void main(String[] args) {
        DistanceCalculator obj = new DistanceCalculator();
        obj.distance(5, 20);
        obj.distance(2, 3, 4);            
    }
}
