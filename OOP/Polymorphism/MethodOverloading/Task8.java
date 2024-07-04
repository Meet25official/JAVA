// 8. GCD Calculation:
//    Write a class `GCD` with overloaded methods `calculateGCD()` to compute the greatest common divisor of two integers and three integers.

class GCD {
    public int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); 
    }

    public int calculateGCD(int a, int b, int c) {
        return calculateGCD(calculateGCD(a, b), c);
    }
}
public class Task8 {
    public static void main(String[] args) {
        GCD gcdCalculator = new GCD();

        int gcd1 = gcdCalculator.calculateGCD(24, 36);
        System.out.println("GCD of 24 and 36: " + gcd1);

        int gcd2 = gcdCalculator.calculateGCD(36, 48, 60);
        System.out.println("GCD of 36, 48, and 60: " + gcd2);
    }
}
