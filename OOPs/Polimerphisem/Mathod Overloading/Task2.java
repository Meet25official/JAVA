//2. Volume Calculation:
//Create a class `Volume` with overloaded methods `calculate()` to compute the volume of a cube (using side length), a cylinder (using radius and height), and a rectangular prism (using length, width, and height).

public class Task2{
    public static void calculate(float length){
        float a1 = length*length*length;
        System.out.println("The volume of the cube is :- "+a1);
    }
    public static void calculate(float radius , float height){
        float a2 = 3.14f*radius*radius*height;
        System.out.println("The volume of the cyllinder is :- "+a2);
    }
    public static void calculate(float length , float width ,float height){
        float a3 = length*width*height;
        System.out.println("The volume of the rectangle is :- "+a3);
    }
    public static void main(String[] args){
        calculate(2.0f);
        calculate(3.0f,4.0f);
        calculate(3.0f,2.0f,6.0f);
    }  
}
