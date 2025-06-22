//5. Student Class: Develop a `Student` class with a constructor to store a student's name, ID, and a list of courses they are enrolled in.

class Student{
    private String name;
    private int sid;
    private String cource[] = new String[5];

    public Student(String name , int sid, String cource[]){
        this.name = name;
        this.sid = sid;
        for (int i = 0; i < cource.length; i++) {
            this.cource[i] = cource[i];
        }
    }
    public void displayDetails(){
        System.out.println("The name of Student is :- "+name);
        System.out.println("The Student ID of this Student is :- "+sid);
        System.out.println("The list of cource choose by the student is :- ");
        for (int i = 0; i < cource.length; i++) {
            System.out.print(cource[i]+", ");
        }
        System.out.print("\b\b ");
    }
}

public class Task15 {
    public static void main(String[] args) {
        String arr[] = {"CS" , "EC" ,"IT" , "CSE" , "ME"};
        Student obj = new Student("Himesh", 50, arr);
        obj.displayDetails();
    }
}
