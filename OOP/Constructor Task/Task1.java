// 1. Basic Constructor Initialization:
//    Create a 'Person' class with fields for 'name' and 'age'. Implement a default constructor that sets these fields to default values and a parameterized constructor that initializes these fields with given values. Display the person's details using a method.

class Person{
    private String name;
    private int age;
    public Person(){
        name = null;
        age = 0;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void getPersonDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Task1{
    public static void main(String[] args) {
        Person p[] = new Person[3];
        p[0] = new Person("Meet", 21);
        p[0].getPersonDetails();
    }
}