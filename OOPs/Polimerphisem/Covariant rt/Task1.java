//Scenario 1: Animal Sounds
//In an animal sounds application, create a base class called "Animal" with a method called "makeSound" that returns an instance of the "Sound" class. Implement derived classes like "Dog" and "Cat" that override the "makeSound" method and return their specific sound objects.

class Animal{
    Animal makeSound(){
        System.out.println("There are many types of animal sounds.");
        return this;
    }
}

class Dog extends Animal{
    @Override
    Dog makeSound(){
        System.out.println("The sound of Dog is bark and 'Wolf - Wolf' ");
        return this;
    }
}

class Cat extends Animal{
    @Override
    Cat makeSound(){
        System.out.println("The sound of cat is mouw - mouw");
        return this;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();


        animal = new Dog();
        animal.makeSound();
    }
}
