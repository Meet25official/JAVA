//Scenario 1: Calculator
//In a calculator application, implement method overloading for the addition operation. Create multiple methods with different parameter types such as adding two integers, adding two doubles, and adding three integers.

public class TaskSheet1{
    public static void addition(int a , int b){
        System.out.println("The addition of this two integer number is :- "+a+" + "+b+" = "+(a+b));
    }
    public static void addition(double a ,double b){
        System.out.println("The addition of this two double number is :- "+a+" + "+b+" = "+(a+b));
    }
    public static void addition(int a , int b, int c){
        System.out.println("The addition of this three integer number is :- "+a+" + "+b+" + "+c+" = "+(a+b+c));
    }
    public static void main(String[] args) {
        addition(2,3);
        addition(1.5, 7.3);
        addition(1, 2, 3);
    }  
}