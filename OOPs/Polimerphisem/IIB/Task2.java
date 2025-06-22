//2. Math Operations: Develop a class that performs mathematical operations (addition, subtraction, etc.). Initialize required constants and variables within an instance initializer block.

class Mathematical{
    private int a;
    private int b;

    {
        a = 10;
        b = 2;
    } 

    public void operations(){
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        System.out.println("The addition of two number :- "+sum);
        System.out.println("The substraction of two number :- "+sub);
        System.out.println("The multiplication of two number :- "+mul);
        System.out.println("The division of two number :- "+div);
    }
     
}

public class Task2 {
    public static void main(String[] args) {
        Mathematical obj = new Mathematical();
        obj.operations();
    }
}
