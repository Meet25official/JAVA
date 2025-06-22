//1. Person Class: Create a `Person` class with a parameterized constructor to store a person's name, age, and address.
class Person{
    private String name;
    private String address;
    private int age;
    
    public Person(String name , int age , String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void getDetails(){
        System.out.println("Name : " + name);
        System.out.println("address : " + address);
        System.out.println("age : " + age);
    }
}


public class Task11 {
    public static void main(String[] args) {
       Person obj = new Person("Himesh", 18, "Kalol");
       obj.getDetails();
    }
}
