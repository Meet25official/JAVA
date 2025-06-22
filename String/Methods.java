public class Methods {
    public static void main(String[] args) {
        
      //   String str = "This is String";

      //   System.out.println("str: " + str);
      //   System.out.println("hashcode(): " + str.hashCode());

      //   str = "This is another string";

      //   System.out.println("str: " + str);
      //   System.out.println("hashcode(): " + str.hashCode());
        

        String str = "Welcome to Java World";

      //   System.out.println(str.charAt(4));
      //   System.out.println(str.length());
      //   System.out.println(str.substring(10));
      //   System.out.println(str.substring(10, 15));
      //   System.out.println(str.indexOf(' ', 8));
      //   System.out.println(str.indexOf(", ", 7));
      //   System.out.println(str.lastIndexOf("a"));
      //   System.out.println(str.startsWith("Welcome"));
      //   System.out.println(str.startsWith("to", 8));
      //   System.out.println(str.endsWith("d"));
      //   System.out.println("HeLlO".toLowerCase());
      //   System.out.println("HeLlO".toUpperCase());
      //   String str = "   sd sd    ";
      //   System.out.println("\n" + str + " -> " + str.length() + "\n" + str.trim() + " -> " + str.trim().length());
      //   System.out.println(str.replace('a', 'A'));
      //   System.out.println(str.replace("Java", "python".toUpperCase()));
      //   System.out.println(str.contains("java".toLowerCase()));
      //   String s = new String();
      //   String s = "";
      //   System.out.println(s.isEmpty());
      //   int i = 2345;
      //   String s = String.valueOf(i);
      //   System.out.println(s + " -> " + ((Object)i).getClass().getSimpleName());
      //   System.out.println(s + " -> " + s.getClass());

      //   int ab = Integer.valueOf(s);
      //   System.out.println(ab + " -> " + ((Object)ab).getClass().getName());

      //   System.out.println("Hello ".concat("World."));
      //   char a[] = new char[10];
      //   a = str.substring(0, 10).toCharArray();
        
      //   for (char c : a) {
      //       System.out.print(c + " ");
      //   }
      //   System.out.println();

      //   System.out.println("Hello".equals("hello"));
      //   System.out.println("Hello".equalsIgnoreCase("hello"));
      //   System.out.println("Hello".compareToIgnoreCase("hello"));
      //   str = "Dhruv";
      //   System.out.println(String.format("this is a string example -> %s\n\n%d %d", str, 1, 2));

    }
}

/*
String is an immutable class.


String Methods:
1. charAt(int index): Returns the character at the specified index.
2. length(): Returns the length of the string.
3. substring(int beginIndex): Returns a substring starting from the specified index.
4. substring(int beginIndex, int endIndex): Returns a substring within the specified range.
5. indexOf(int ch): Returns the index of the first occurrence of a specified character.
6. indexOf(int ch, int fromIndex): Returns the index of the first occurrence of a specified character starting from the given index.
7. indexOf(String str): Returns the index of the first occurrence of a specified substring.
8. lastIndexOf(int ch): Returns the index of the last occurrence of a specified character.
9. lastIndexOf(int ch, int fromIndex): Returns the index of the last occurrence of a specified character before the given index.
10. lastIndexOf(String str): Returns the index of the last occurrence of a specified substring.
11. startsWith(String prefix): Checks if the string starts with the specified prefix.
12. endsWith(String suffix): Checks if the string ends with the specified suffix.
13. toLowerCase(): Converts the string to lowercase.
14. toUpperCase(): Converts the string to uppercase.
15. trim(): Removes leading and trailing white spaces.
16. replace(char oldChar, char newChar): Replaces all occurrences of a character with another character.
17. replace(CharSequence target, CharSequence replacement): Replaces all occurrences of a specified CharSequence.
18. contains(CharSequence s): Checks if the string contains the specified sequence of characters.
19. isEmpty(): Checks if the string is empty.
20. valueOf(Object obj): Returns the string representation of an object.
*/

/*
String objects are immutable, which means that once created, their values cannot be changed.

3. Data Parsing:
   Develop a CSV parser in Java that reads a comma-separated file, extracts each field, and organizes the data into usable chunks, allowing for further processing or manipulation.

4. Encryption and Decryption:
   Implement a Java application that encrypts sensitive user data (like passwords) using a chosen encryption algorithm and allows decryption for authorized users.



8. Error Handling:
   Develop a log analysis tool in Java that reads log files, extracts error messages, and categorizes them based on timestamp, error codes, and descriptions for easier debugging.

9. Text Analysis:
   Build a Java application that performs sentiment analysis on user-provided text, analyzing the frequency of positive and negative words to gauge sentiment.

10. Internationalization and Localization:
    Create a Java program that manages multi-language support by enabling users to switch between languages, displaying content based on their selected language preference.


Sample Test Cases:


3. Data Parsing:
   - Input CSV:
     ```
     Name, Age, City
     John, 25, New York
     Emily, 30, San Francisco
     ```
     - Expected Output: Parsed data as a list of arrays or objects containing information for each person.

4. Encryption and Decryption:
   - Input: "SecretPassword123"
     - Expected Output: Encrypted/Hashed password
     - Decryption: Ensure the decrypted password matches the original input.



8. Error Handling:
   - Input Log:
     ```
     [2023-11-30 10:15:20] ERROR: Database connection failed
     [2023-11-30 10:20:35] ERROR: File not found
     ```
     - Expected Output: Extracted errors categorized by timestamp and error messages.

9. Text Analysis:
   - Input Text: "The movie was fantastic! The acting was superb."
     - Expected Output: Sentiment analysis showing positive sentiment with word frequency analysis.

10. Internationalization and Localization:
    - Input: Select language as "French"
      - Expected Output: Display content in French language as per the user's choice.
*/