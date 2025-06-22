// Scenario 1: Animal Sounds
// In an animal sounds application, create a base class called "Animal" with a method called "makeSound" that returns an instance of the "Sound" class. Implement derived classes like "Dog" and "Cat" that override the "makeSound" method and return their specific sound objects.
// Base class: Animal

class Animal {
    public Sound makeSound() {
        return new Sound("Unknown sound");
    }

}
class Dog extends Animal {
    @Override
    public Sound makeSound() {
        return new Sound("Woof!");
    }
} 
class Cat extends Animal {
    @Override
    public Sound makeSound() {
        return new Sound("Meow!");
    }
}
class Sound {
    private String sound;

    public Sound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
public class Task1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        Sound dogSound = dog.makeSound();
        Sound catSound = cat.makeSound();

        System.out.println("Dog sound: " + dogSound.getSound());
        System.out.println("Cat sound: " + catSound.getSound());
    }
}