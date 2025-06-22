// 2. Math Operations: Develop a class that performs mathematical operations (addition, subtraction, etc.). Initialize required constants and variables within an instance initializer block.

class MathOperations {
    private double num1;
    private double num2;

    {
        num1 = 0.0;
        num2 = 0.0;
    }

    public MathOperations(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num1 / num2;   
    }
}
public class Task2 {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations(10.0, 2.0);
        System.out.println("Addition: " + mathOps.add());
        System.out.println("Subtraction: " + mathOps.subtract());
        System.out.println("Multiplication: " + mathOps.multiply());
        System.out.println("Division: " + mathOps.divide());
    }
}
