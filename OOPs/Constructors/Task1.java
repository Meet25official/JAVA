//1. Basic Constructor Initialization:
// Create a 'Person' class with fields for 'name' and 'age'. Implement a default constructor that sets these fields to default values and a parameterized constructor that initializes these fields with given values. Display the person's details using a method.

class Person{
    private String name;
    private int age;
    
    public Person(){
        name = "Himesh";
        age = 18;
    }

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    void getDetails(){
        System.out.println("Name : " + name);
        System.out.println("age : " + age);
    }
}

public class Task1 {
    public static void main(String[] args) {
        Person c1 = new Person();
        Person c2 = new Person("Dhruv" , 19);
        c1.getDetails();
        c2.getDetails();
    }
}
