// 9. String Repetition:
//    Implement a class `Repeater` with overloaded methods `repeat()` to repeat a string a specified number of times, concatenate the repeated string, and print it.

class Repeater {
    public String repeat(String str, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public void repeatAndPrint(String str, int times) {
        String repeatedString = repeat(str, times);
        System.out.println("Repeated " + times + " times: " + repeatedString);
    }
}
public class Task9 {
    public static void main(String[] args) {
        Repeater repeater = new Repeater();

        repeater.repeatAndPrint("Hello", 3);
        repeater.repeatAndPrint("Java", 5);
    }
}
