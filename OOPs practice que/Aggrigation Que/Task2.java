//Scenario 2: University Department Management
//Create a university department management system where a department consists of multiple faculty members. The department class contains a list of faculty objects, representing an aggregation relationship.

import java.util.Scanner;

class Faculty{
    private String name;
    private String quli;
    private int age;

    public Faculty(String name , String quli , int age){
        this.name = name;
        this.quli = quli;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuli() {
        return quli;
    }

    public void setQuli(String quli) {
        this.quli = quli;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void display(){
        System.out.println("The faculty name is :- "+name);
        System.out.println("The qulification of this faculty is :- "+quli);
        System.out.println("The age of this faculty is :- "+age);
    }
}

class Department{
    Faculty facultys[];
    int count;

    public Department(int capacity){
        facultys = new Faculty[capacity];
        count = 0;
    }

    public void addFaculty(String name , String quli , int age){
        if(count < facultys.length){
            facultys[count++] = new Faculty(name , quli , age);
            System.out.println("Faculty is added successfuly.");
        }
        else{
            System.out.println("The capacity is full.");
        }
    }

    public void removeFaculty(String name){
        for (int i = 0; i < count; i++) {
            if(facultys[i].getName().equals(name)){
                for(int j = i; j < count-1; j++) {
                    facultys[j] = facultys[j+1];
                }  
                count--;
                System.out.println("The Faculty removed succesfuly.");
                return;
            }
            else{
                System.out.println("The Faculty cannot find.");
            }
        }
    }

    public void updateFaculty(String name){
        for(int i = 0; i < count; i++) {
            if(facultys[i].getName().equals(name)){
                int choice;
                do{
                    Scanner sc = new Scanner(System.in);
                    System.out.println("1-------------------------------------->name");
                    System.out.println("2-------------------------------------->quli");
                    System.out.println("3-------------------------------------->age");
                    System.out.println("0-------------------------------------->Exit");
                    System.out.println("Enter your choice :- ");
                    choice = sc.nextInt();

                    switch(choice){
                        case 1: System.out.println("Enter the new Faculty Name :- ");
                                sc.nextLine();
                                facultys[i].setName(sc.nextLine());
                                break;
                 
                        case 2: System.out.println("Enter the new Qulification :- ");
                                sc.nextLine();        
                                facultys[i].setQuli(sc.nextLine());
                                break;
                        
                        case 3: System.out.println("Enter the new Age :- ");
                                facultys[i].setAge(sc.nextInt());
                                // sc.close();
                                break;
                        case 0: break;
                        
                        default: System.out.println("Enter the vailid choice!!!");
                            break;
                    }
                }while(choice != 0);
                System.out.println("Faculty update succesfuly.");
                return;
            } 
        }
    }
    public void displayAll(){
        for (int i = 0; i < count; i++) {
            facultys[i].display();
        }
    }
}


public class Task2 {
    public static void main(String[] args) {
        Department obj = new Department(10);

        obj.addFaculty("Mohak", "Diploma CS", 20);
        obj.addFaculty("Shrey", "B.E CE", 22);
        obj.addFaculty("Zafar", "B.Tech CSE", 23);
        obj.addFaculty("Ronak", "B.tech Data Science", 25);
        obj.addFaculty("Tejash", "B.Tech WebDesign", 40);

        obj.displayAll();

        obj.removeFaculty("Ronak");
        obj.displayAll();

        obj.updateFaculty("Shrey");
        obj.displayAll();
    }
}