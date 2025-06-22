//Scenario 1: Animal Hierarchy
//Create an abstract class called "Animal" with abstract methods like "eat" and "sound." Implement derived classes like "Cat" and "Dog" that provide specific implementations for these abstract methods.

abstract class Animal{
    private String name;
    public Animal(String name){
        this.name = name;
    }
    
    abstract void eat();
    abstract void sound();
}

class Cat extends Animal{
    private String eatItem;

    public Cat(String name , String eatItem){
        super(name);
        this.eatItem = eatItem;
    }
    @Override
    void eat(){
        System.out.println("This animal type is Cat.");
        System.out.println("The Cat eat "+eatItem);
    }
    @Override
    void sound(){
        System.out.println("The sound of cat is Mow Mow");
    }
}

class Dog extends Animal{
    private String eatItem;

    public Dog(String name , String eatItem){
        super(name);
        this.eatItem = eatItem;
    }

    @Override
    void eat(){
        System.out.println("This animal type is Dog.");
        System.out.println("The Dog eat "+eatItem);
    }
    @Override
    void sound(){
        System.out.println("The sound of Dog is Bhow Bhow");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Cat obj1 = new Cat("Cat", "Milk");
        Dog obj2 = new Dog("Dog", "Padegree");
        obj1.eat();
        obj1.sound();
        obj2.eat();
        obj2.sound();
    }
}