class Animal {
    void makeSound() {
        System.out.println("Generic animal sound.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class InstanceOf {
    public static void main(String[] args) {
        //Upcasting
        Animal myDog = new Dog();   //upcasting
        // System.out.println(myDog instanceof Dog);   //object instanceof Class
        // myDog.makeSound();
        
        // Downcasting
        if(myDog instanceof Dog) {
            Dog myRealDog = (Dog) myDog;    //downcasting
            myRealDog.bark();
        }
    }
}
/*
instanceof is a keyword that is used for checking if a reference variable is containing a given type of object reference or not.

Upcasting and downcasting

Upcasting: Converting a subclass reference to a superclass reference is called upcasting.

Downcasting: Converting a superclass reference to a subclass reference is called downcasting.
*/