// 3. Exception Handling in a Calculator: Design a calculator program in Java that employs the 'throw' statement to manage arithmetic exceptions. Create situations where 'throw' is used to handle divide-by-zero errors or invalid mathematical operations.

class InvalidMathOperationException extends Exception {
    public InvalidMathOperationException(String message) {
        super(message);
    }
}
class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws InvalidMathOperationException {
        if (b == 0) {
            throw new InvalidMathOperationException("Cannot divide by zero.");
        }
        return a / b;
    }

    public double performOperation(String operation, double a, double b) throws InvalidMathOperationException {
        switch (operation.toLowerCase()) {
            case "add":
                return add(a, b);
            case "subtract":
                return subtract(a, b);
            case "multiply":
                return multiply(a, b);
            case "divide":
                return divide(a, b);
            default:
                throw new InvalidMathOperationException("Invalid mathematical operation: " + operation);
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            System.out.println("Addition: " + calculator.performOperation("add", 10, 5));
            System.out.println("Subtraction: " + calculator.performOperation("subtract", 10, 5));
            System.out.println("Multiplication: " + calculator.performOperation("multiply", 10, 5));
            System.out.println("Division: " + calculator.performOperation("divide", 10, 5));
            System.out.println("Invalid Operation: " + calculator.performOperation("modulus", 10, 5));
        } catch (InvalidMathOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            System.out.println("Division by Zero: " + calculator.performOperation("divide", 10, 0));
        } catch (InvalidMathOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
