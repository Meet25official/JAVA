public class Finally{

    //case 1: when the exception doesn't occur
    // public static void main(String[] args) {
    //     System.out.println("Before Exception");

    //     try {
    //         int data = 25/5;
    //         System.out.println(data);
    //     } catch (ArithmeticException e) {
    //         e.printStackTrace();
    //     } finally {
    //         System.out.println("Finally block executed!");
    //     }

    //     System.out.println("After Exception");
    // }

    //case 2: when the exception does occur and not handled

    // public static void main(String[] args) {
    //     System.out.println("Before Exception");

    //     try {
    //         int data = 25/0;
    //         System.out.println(data);
    //     } catch (NullPointerException e) {
    //         e.printStackTrace();
    //     } finally {
    //         System.out.println("Finally block executed!");
    //     }

    //     System.out.println("After Exception");
    // }
    //case 3: when the exception does occurs and also gets handled by the catch block

    // public static void main(String[] args) {
    //     System.out.println("Before Exception");

    //     try {
    //         int data = 25/0;
    //         System.out.println(data);
    //     } catch (ArithmeticException e) {
    //         e.printStackTrace();
    //     } finally {
    //         System.out.println("Finally block executed!");
    //     }

    //     System.out.println("After Exception");
    // }
}