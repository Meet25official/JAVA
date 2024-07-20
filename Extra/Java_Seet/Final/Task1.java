// Scenario 1: Math Constants
// In a mathematical calculation library, define a class called "MathConstants" with final variables for commonly used mathematical constants like pi and e. These variables cannot be modified and hold their constant values throughout the program.

class MathConstants {
    public static final double PI = 3.14;
    public static final double E = 2.71;
}

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Value of PI: " + MathConstants.PI);
        System.out.println("Value of E: " + MathConstants.E);
    }
}
