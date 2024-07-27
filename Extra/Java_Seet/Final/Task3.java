// Scenario 1: Math Calculations
// In a math calculation library, define a class called "MathUtils" with final methods for commonly used mathematical calculations like square root and logarithm. These methods cannot be overridden and provide consistent behavior throughout the program.

final class MathUtils {
    private MathUtils() {
        throw new AssertionError("Cannot instantiate MathUtils");
    }

    public static final double sqrt(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Cannot compute the square root of a negative number");
        }
        return Math.sqrt(value);
    }

    public static final double log(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Cannot compute the logarithm of zero or a negative number");
        }
        return Math.log(value);
    }
}
public class Task3 {
    public static void main(String[] args) {
        double number = 25.0;
        double sqrtValue = MathUtils.sqrt(number);
        double logValue = MathUtils.log(number);

        System.out.println("Square root of " + number + " is " + sqrtValue);
        System.out.println("Logarithm of " + number + " is " + logValue);
    }
}
