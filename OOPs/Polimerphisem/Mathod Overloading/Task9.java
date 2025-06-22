//9. String Repetition:
//Implement a class `Repeater` with overloaded methods `repeat()` to repeat a string a specified number of times, concatenate the repeated string, and print it.

class Repeater{
    void repeat(){
        String sc = "";
        String str = "Himesh";
        for (int i = 1; i < 3; i++) {
            sc += str;
        }
        System.out.println("The reapeat string is :- "+sc);
    }
    void reapeat(String s){
        String sc = "";
        for (int i = 1; i < 4; i++) {
            sc += s;
        }
        System.out.println("The reapet string is :- "+sc);
    }
    void reapeat(String s , int c){
        String sc = "";
        for (int i = 1; i < c; i++) {
            sc += s; 
        }
        System.out.println("The reapet string is :- "+sc);
    }
}

public class Task9 {
    public static void main(String[] args) {
        Repeater obj = new Repeater();
        obj.repeat();
        obj.reapeat("Royal");
        obj.reapeat("Patel", 5);
    }
}
