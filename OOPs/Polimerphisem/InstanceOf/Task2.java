//Scenario 2: Animal Shelter
//In an animal shelter application, have classes like "Animal," "Cat," and "Dog" representing different types of animals. Use the instanceof operator to identify the type of animal and apply specific operations like feeding or grooming based on the animal's type.

class Animal{
    void makeSound(){
        System.out.println("The animal have many type of sound :- ");
    }
}

class Dog extends Animal{
    void makeSoundDog(){
        System.out.println("The Dog sound is Bark or Bhow Bhow.");
    }
}

class Cat extends Animal{
    void makeSoundCat(){
        System.out.println("The Cat sound is Mow Mow.");
    }
}


public class Task2 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal animal2 = new Cat();
        System.out.println(animal instanceof Dog);
        animal.makeSound();
        System.out.println(animal2 instanceof Cat);
        animal2.makeSound();
        
        if (animal instanceof Dog){
            Dog obj = (Dog) animal;
            obj.makeSoundDog();
        }
        if (animal2 instanceof Cat){
            Cat obj2 = (Cat) animal2;
            obj2.makeSoundCat();
        }
    }
}
