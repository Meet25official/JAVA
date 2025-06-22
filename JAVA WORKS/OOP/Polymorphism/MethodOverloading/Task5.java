// 5. String Concatenation:
//    Write a class `Concatenator` with overloaded methods `concatenate()` to concatenate two strings, three strings, and four strings.

class Concatenator {
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public String concatenate(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }

    public String concatenate(String str1, String str2, String str3, String str4) {
        return str1 + str2 + str3 + str4;
    }
}

public class Task5 {
    public static void main(String[] args) {
        Concatenator concatenator = new Concatenator();

        String result1 = concatenator.concatenate("Hello, ", "world!");
        System.out.println("Concatenated string (two strings): " + result1);

        String result2 = concatenator.concatenate("I ", "love ", "Java!");
        System.out.println("Concatenated string (three strings): " + result2);

        String result3 = concatenator.concatenate("This ", "is ", "a ", "test.");
        System.out.println("Concatenated string (four strings): " + result3);
    }
}
