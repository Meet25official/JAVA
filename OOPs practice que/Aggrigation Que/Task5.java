//Scenario 5: School Course Enrollment
//Create a school course enrollment system where a student can enroll in multiple courses. The student class contains a list of course objects, representing an aggregation relationship.

import java.util.Scanner;

class Student{
    private int sid;
    private String name;
    private String cname;
    private int marks;

    public Student(int sid , String name , String cname , int marks){
        this.sid = sid;
        this.name = name;
        this.cname = cname;
        this.marks = marks;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void display(){
        System.out.println("The name of this student is :- "+name);
        System.out.println("The Student id is :- "+sid);
        System.out.println("The cource name is :- "+cname);
        System.out.println("The marks of this cource is :- "+marks);
    }
}

class Course{
    Student student[];
    int count;

    public Course(int capacity){
        student = new Student[capacity];
        count = 0;
    }

    public void addCource(int sid , String name , String cname , int marks){
        if(count < student.length){
            student[count++] = new Student(sid, name, cname, marks);
            System.out.println("The Student cource added succesfully.");
        }
        else{
            System.out.println("The capacity is full.");
        }
    }

    public void removeCource(int sid){
        for (int i = 0; i < count; i++) {
            if(student[i].getSid() == sid){
                for (int j = i; j < count-1; j++) {
                    student[j] = student[j+1];
                }
                count--;
                System.out.println("The cource of this student remove successfully.");
                return;
            }
            else{
                System.out.println("The Student is not in cource.");
            }
        }
    }
    public void updateCource(int sid){
        for (int i = 0; i < count; i++) {
            if(student[i].getSid() == sid){
                int choice;
                do{
                    Scanner sc = new Scanner(System.in);
                    System.out.println("1------------->sid");
                    System.out.println("2------------->Student Name");
                    System.out.println("3------------->Cource Name");
                    System.out.println("4------------->Marks");
                    System.out.println("0------------->exit");
                    System.out.println("Enter your choice :- ");
                    choice = sc.nextInt();

                    switch(choice){
                        case 1: System.out.println("Enter new Student id :- ");
                                sc.nextLine();
                                int s = sc.nextInt();
                                student[i].setSid(s);
                                break;
                        
                        case 2: System.out.println("Enter new Student name :- ");
                                sc.nextLine();
                                String n = sc.nextLine();
                                student[i].setName(n);
                                break;
                        
                        case 3: System.out.println("Enter new cource name :- ");
                                sc.nextLine();
                                String c = sc.nextLine();
                                student[i].setCname(c);
                                break; 
                        
                        case 4: System.out.println("Enter new Marks :- ");
                                sc.nextLine();
                                int m = sc.nextInt();
                                student[i].setMarks(m);
                                sc.close();
                                break;
                        case 0: break;  
                        default:System.out.println("Invailid Choice!!!");
                            break;     
                    }
                } while(choice != 0);
                System.out.println("Student details update succesfully");
                return;
            }
        }
    }

    public void displayAll(){
        for (int i = 0; i < count; i++) {
            student[i].display();
            System.out.println("-------------------------------------------------");
        }
    }
}

public class Task5 {
    public static void main(String[] args) {
        Course obj = new Course(10);
        obj.addCource(50, "Himesh", "Java Script", 97);
        obj.addCource(18, "Dhruv", "Python", 98);
        obj.addCource(45, "Meet", "AWS", 96);
        obj.addCource(23, "Mohak", "Java", 89);
        obj.addCource(56, "Shrey", "Data Science", 92);
        obj.displayAll();
        obj.removeCource(23);
        obj.displayAll();
        obj.updateCource(50);
        obj.displayAll();
    }
}