//5. String Concatenation:
//Write a class `Concatenator` with overloaded methods `concatenate()` to concatenate two strings, three strings, and four strings.

class Concatenator{
    void concatenate(String s1 , String s2){
        System.out.println("The concataion of two string is :- "+s1.concat(s2));
    }

    void concatenate(String s1 , String s2 , String s3){
        System.out.println("The concataion of three string is :- "+s1.concat(s2).concat(s3));
    }

    void concatenate(String s1 , String s2 , String s3, String s4){
        System.out.println("The concataion of four string is :- "+s1.concat(s2).concat(s3).concat(s4));
    }
}

public class Task5 {
    public static void main(String[] args) {
        Concatenator obj = new Concatenator();
        obj.concatenate("Himesh", " Patel");
        obj.concatenate("Patel ", "Himesh", " Kumar");
        obj.concatenate("Patel ", " Himesh Kumar", " Anil", " Kumar");
    }
}