//8. GCD Calculation:
//Write a class `GCD` with overloaded methods `calculateGCD()` to compute the greatest common divisor of two integers and three integers.

class GCD{
    int  calculateGCD(int a , int b){
        while(b !=0 ){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    int calculateGCD(int a , int b , int c){
        return calculateGCD(calculateGCD(a, b), c);
    }
}

public class Task8 {
    public static void main(String[] args) {
        GCD obj = new GCD();
        int gcd1 = obj.calculateGCD(10, 2);
        int gcd2 = obj.calculateGCD(32, 16, 2);
        System.out.println("The gdc of the 10 and 2 is :- "+gcd1);
        System.out.println("The gdc of the 32 , 16 , 2 is :- "+gcd2);
    }
}
