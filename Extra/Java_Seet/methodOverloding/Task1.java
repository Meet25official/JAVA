// Scenario 1: Calculator
// In a calculator application, implement method overloading for the addition operation. Create multiple methods with different parameter types such as adding two integers, adding two doubles, and adding three integers.

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Task1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);
        System.out.println("Result: " + result);
    }
}
