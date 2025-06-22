class Student {
    public int id;
    public String name;
    public static String college = "IIT";

    public Student() {}
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static void display() {
        System.out.println("College: " + college);
    }
}


public class Static_KW {
    public static void main(String[] args) {
        // Student s = new Student();

        System.out.println(Student.college);        //Without creat an object we can print static variable......
        // System.out.println(s.college);           // this is print but show waring......... 
    }
}
/*
Static is used to refer the common property of all objects.

Anything that will be declared as static will be common for all the objects of that class.
*/