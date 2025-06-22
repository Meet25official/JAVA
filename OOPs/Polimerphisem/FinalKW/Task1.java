//Scenario 1: Math Constants
//In a mathematical calculation library, define a class called "MathConstants" with final variables for commonly used mathematical constants like pi and e. These variables cannot be modified and hold their constant values throughout the program.

class MathConstants{
    final float pi = 3.14f;
    final float e = 2.78f;

    public void display(){
        System.out.println("The value of pi is :- "+pi);
        System.out.println("The value of e is :- "+e);
    }
}

public class Task1 {
    public static void main(String[] args) {
        MathConstants obj = new MathConstants();
        // obj.pi = 3.2f;        
        obj.display();
    }
}
