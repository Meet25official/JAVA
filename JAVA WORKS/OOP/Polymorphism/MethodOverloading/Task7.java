// 7. Max Value Finder:
//    Develop a class `MaxFinder` with overloaded methods `max()` to find the maximum value among two integers, three integers, and four integers.

class MaxFinder {
    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public int max(int a, int b, int c, int d) {
        return Math.max(Math.max(Math.max(a, b), c), d);
    }
}
public class Task7 {
    public static void main(String[] args) {
        MaxFinder finder = new MaxFinder();

        int max1 = finder.max(10, 20);
        System.out.println("Maximum of 10 and 20: " + max1);

        int max2 = finder.max(30, 15, 25);
        System.out.println("Maximum of 30, 15, and 25: " + max2);

        int max3 = finder.max(5, 10, 15, 3);
        System.out.println("Maximum of 5, 10, 15, and 3: " + max3);
    }
}
