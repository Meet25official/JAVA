// 6. Distance Calculation:
//    Create a class `DistanceCalculator` with overloaded methods `distance()` to calculate the distance between two points in a 2D plane (using two points), three points in a 3D space (using three points), and between two points on a number line.

class DistanceCalculator {
    public double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dz = z2 - z1;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public double distance(double point1, double point2) {
        return Math.abs(point2 - point1);
    }
}

public class Task6 {
    public static void main(String[] args) {
        DistanceCalculator calculator = new DistanceCalculator();

        double distance1 = calculator.distance(1.0, 2.0, 4.0, 6.0);
        System.out.println("Distance between (1.0, 2.0) and (4.0, 6.0) in 2D plane: " + distance1);

        double distance2 = calculator.distance(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        System.out.println("Distance between (1.0, 2.0, 3.0) and (4.0, 5.0, 6.0) in 3D space: " + distance2);

        double distance3 = calculator.distance(5.0, 10.0);
        System.out.println("Distance between points 5.0 and 10.0 on a number line: " + distance3);
    }
}
