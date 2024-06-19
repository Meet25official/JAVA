//3. Write a Java program to print the following grid.

//Expected Output :

//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - -                                                                                           
//- - - - - - - - - - 

public class Task3 {
    public static void main(String[] args) {
        int rows = 10;
        int cols = 10;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}
