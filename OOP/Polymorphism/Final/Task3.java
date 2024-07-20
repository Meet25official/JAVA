// Scenario 3: Math Calculations
// In a math calculation library, define a class called "MathUtils" with final methods for commonly used mathematical calculations like square root and logarithm. These methods cannot be overridden and provide consistent behavior throughout the program.

final class MathUtils {
    public static final double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static final double calculateNaturalLogarithm(double number) {
        return Math.log(number);
    }
}
public class Task3 {
    public static void main(String[] args) {
        double number = 15.0;
        double squareRoot = MathUtils.calculateSquareRoot(number);
        System.out.println("Square root of " + number + " is: " + squareRoot);

        double number2 = 20.0;
        double naturalLog = MathUtils.calculateNaturalLogarithm(number2);
        System.out.println("Natural logarithm of " + number2 + " is: " + naturalLog);
    }
}
