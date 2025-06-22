// 40. Write a Java program to find the two elements in a given array of positive and negative numbers such that their sum is close to zero.

public class Task40 {
    public static void main(String[] args) {
        int arra[] = {1, 2, -3, -5, 6, 7, 0};
        int a = 0, b = 0;
        int minsum = arra[0] + arra[1];
        for(int i = 0; i < arra.length; i++){
            for(int j = i + 1; j < arra.length; j++){
                int sum = arra[i] + arra[j];
                if(Math.abs(minsum) > Math.abs(sum)){
                    minsum = sum;
                    a = arra[i];
                    b = arra[j];
                }
            }
        }
        System.out.println("sum is close to zero: " + a + " and " + b);
    }
}
