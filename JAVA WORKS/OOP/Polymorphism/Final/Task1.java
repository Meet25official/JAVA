// Scenario 1: Math Constants
// In a mathematical calculation library, define a class called "MathConstants" with final variables for commonly used mathematical constants like pi and e. These variables cannot be modified and hold their constant values throughout the program.

final class MathConstants {
    public static final double PI = 3.14;

    public static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }   
}

public class Task1 {
    public static void main(String[] args) {
        double radius = 5.0;
        double circumference = MathConstants.calculateCircumference(radius);
        System.out.println("Circumference of the circle with radius " + radius + " is: " + circumference);
    }
}
