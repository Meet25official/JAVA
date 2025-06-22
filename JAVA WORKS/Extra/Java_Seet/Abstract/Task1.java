// Scenario 1: Animal Hierarchy
// Create an abstract class called "Animal" with abstract methods like "eat" and "sound." Implement derived classes like "Cat" and "Dog" that provide specific implementations for these abstract methods.

abstract class Animal {
    abstract void eat();
    abstract void sound();
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat eats fish....");
    }
    public void sound() {
        System.out.println("Cat says meow.....");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat eats bones....");
    }
    public void sound() {
        System.out.println("Cat says bark.....");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        myCat.eat();
        myCat.sound();

        myDog.eat();
        myDog.sound();
    }
}