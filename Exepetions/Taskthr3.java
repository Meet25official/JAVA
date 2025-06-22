//3. Exception Handling in a Calculator: Design a calculator program in Java that employs the 'throw' statement to manage arithmetic exceptions. Create situations where 'throw' is used to handle divide-by-zero errors or invalid mathematical operations.

class Calculator{
    private int a;
    private int b;

    public Calculator(int a , int b){
        this.a = a;
        this.b = b;
    }

    public void operations() throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Divide by zero is invalid.");
        }
        else{
            System.out.println("The operation is :- "+(a/b));
        }
    }
}

public class Taskthr3 {
    public static void main(String[] args) {
        Calculator obj = new Calculator(30, 0);
        try {
            obj.operations();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
