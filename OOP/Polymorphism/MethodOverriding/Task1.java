// 1. Problem: Create a class called `Calculator` that demonstrates method overloading for basic arithmetic operations (addition, subtraction, multiplication, and division).
//    - Example: Implement the `add`, `subtract`, `multiply`, and `divide` methods in the `Calculator` class, each overloaded with different parameter lists to perform the respective operations.

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}
public class Task1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition (2 + 3): " + calc.add(2, 3));
        System.out.println("Subtraction (5 - 2): " + calc.subtract(5, 2));
        System.out.println("Multiplication (4 * 6): " + calc.multiply(4, 6));
        System.out.println("Division (10 / 2): " + calc.divide(10, 2));
    }
}
