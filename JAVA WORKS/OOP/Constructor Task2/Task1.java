// 1. Person Class: Create a `Person` class with a parameterized constructor to store a person's name, age, and address.

class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

public class Task1{
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30, "123 Main St, City");
        person1.displayInfo();
        person1.setAddress("456 Oak Ave, Town");
        System.out.println("Updated address:");
        person1.displayInfo();
    }
}
