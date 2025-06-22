//Scenario 3: Math Calculations
//In a math calculation library, define a class called "MathUtils" with final methods for commonly used mathematical calculations like square root and logarithm. These methods cannot be overridden and provide consistent behavior throughout the program.

import java.lang.Math;

class MathUtils{
    protected double a;

    public MathUtils(double a){
        this.a = a;
    }

    public final void SqureRoot(){
        double s = Math.pow(a, 0.5);
        System.out.println("The sqare root of the number is :- "+s);
    }

    public final void logarithm(){
        double l = Math.log(a);
        System.out.println("The Logerithm of the number is :- "+l);
    }
}

class Calculator extends MathUtils{
    public Calculator(double a){
        super(a);
    }
     
    // @Override
    // public void SqureRoot(){
    //     System.out.println("This is calculator.");
    // }
    // @Override
    // public void Logerithm(){
    //     System.out.println("This is calculator.");
    // }
}

public class Task3 {
    public static void main(String[] args) {
       
        Calculator obj = new Calculator(10);
        obj.SqureRoot();
        obj.logarithm();
    }
}
