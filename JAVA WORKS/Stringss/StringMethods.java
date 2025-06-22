public class StringMethods {

    public static void main(String[] args) {
        String str = "Hello World! This is a Java String Methods.";

        // 1. charAt(int index)
        char ch = str.charAt(6); 
        System.out.println("charAt(6): " + ch);

        // 2. length()
        int length = str.length(); 
        System.out.println("length(): " + length);

        // 3. substring(int beginIndex)
        String substrFromIndex = str.substring(7); 
        System.out.println("substring(7): " + substrFromIndex);

        // 4. substring(int beginIndex, int endIndex)
        String substrInRange = str.substring(7, 12); 
        System.out.println("substring(7, 12): " + substrInRange);

        // 5. indexOf(int ch)
        int indexOfChar = str.indexOf('W'); 
        System.out.println("indexOf('W'): " + indexOfChar);

        // 6. indexOf(int ch, int fromIndex)
        int indexOfCharFromIndex = str.indexOf('W', 8); 
        System.out.println("indexOf('W', 8): " + indexOfCharFromIndex);

        // 7. indexOf(String str)
        int indexOfSubstring = str.indexOf("Java"); 
        System.out.println("indexOf(\"Java\"): " + indexOfSubstring);

        // 8. lastIndexOf(int ch)
        int lastIndexOfChar = str.lastIndexOf('o'); 
        System.out.println("lastIndexOf('o'): " + lastIndexOfChar);

        // 9. lastIndexOf(int ch, int fromIndex)
        int lastIndexOfCharFromIndex = str.lastIndexOf('o', 20); 
        System.out.println("lastIndexOf('o', 20): " + lastIndexOfCharFromIndex);

        // 10. lastIndexOf(String str)
        int lastIndexOfSubstring = str.lastIndexOf("Java"); 
        System.out.println("lastIndexOf(\"Java\"): " + lastIndexOfSubstring);

        // 11. startsWith(String prefix)
        boolean startsWith = str.startsWith("   Hello"); 
        System.out.println("startsWith(\"   Hello\"): " + startsWith);

        // 12. endsWith(String suffix)
        boolean endsWith = str.endsWith("Demo.   "); 
        System.out.println("endsWith(\"Demo.   \"): " + endsWith);

        // 13. toLowerCase()
        String lowerCase = str.toLowerCase(); 
        System.out.println("toLowerCase(): " + lowerCase);

        // 14. toUpperCase()
        String upperCase = str.toUpperCase(); 
        System.out.println("toUpperCase(): " + upperCase);

        // 15. trim()
        String trimmed = str.trim();
        System.out.println("trim(): " + trimmed);

        // 16. replace(char oldChar, char newChar)
        String replacedChar = str.replace('o', 'O'); 
        System.out.println("replace('o', 'O'): " + replacedChar);

        // 17. replace(CharSequence target, CharSequence replacement)
        String replacedSubstring = str.replace("Java", "Python"); 
        System.out.println("replace(\"Java\", \"Python\"): " + replacedSubstring);

        // 18. contains(CharSequence s)
        boolean containsSubstring = str.contains("World"); 
        System.out.println("contains(\"World\"): " + containsSubstring);

        // 19. isEmpty()
        boolean isEmpty = str.isEmpty(); 
        System.out.println("isEmpty(): " + isEmpty);

        // 20. valueOf(Object obj)
        String numberString = String.valueOf(123); 
        System.out.println("valueOf(123): " + numberString);
    }
}
