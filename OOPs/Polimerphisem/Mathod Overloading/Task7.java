//7. Max Value Finder:
//Develop a class `MaxFinder` with overloaded methods `max()` to find the maximum value among two integers, three integers, and four integers.

class MaxFinder{
    void max(int a , int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);
        }
    }
    void max(int a , int b , int c){
        if(a>b && a>c){
            System.out.println(a+" is greatest");
        }
        else if(b>a && b>c){
            System.out.println(b+" is greatest");
        }
        else{
            System.out.println(c+" is greatest");
        }
    }
    
}

public class Task7 {
    public static void main(String[] args) {
        MaxFinder obj = new MaxFinder();
        obj.max(5, 2);
        obj.max(42, 56, 78);
    }
}
