// Scenario 3: Animal Kingdom
// Design an animal kingdom hierarchy with a base class called "Animal" and derived classes like "Mammal," "Bird," and "Fish." Each derived class can have specific characteristics and behaviors unique to that group of animals.

class Animal {
    private String name;
    private int age;
    private String habitat;
    public Animal(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }
    public void makeSound() {
        System.out.println("Some generic sound");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
class Mammal extends Animal {
    private boolean hasFur;
    public Mammal(String name, int age, String habitat, boolean hasFur) {
        super(name, age, habitat);
        this.hasFur = hasFur;
    }
    public void giveBirth() {
        System.out.println(getName() + " is giving birth.");
    }
}
class Bird extends Animal {
    private boolean canFly;
    public Bird(String name, int age, String habitat, boolean canFly) {
        super(name, age, habitat);
        this.canFly = canFly;
    }
    public void sing() {
        System.out.println(getName() + " is singing.");
    }
}
class Fish extends Animal {
    private String waterType;
    public Fish(String name, int age, String habitat, String waterType) {
        super(name, age, habitat);
        this.waterType = waterType;
    }
    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}

public class Task3 {
    public static void main(String[] args) {
        Mammal lion = new Mammal("Lion", 5, "Grasslands", true);
        Bird eagle = new Bird("Eagle", 10, "Mountains", true);
        Fish salmon = new Fish("Salmon", 2, "River", "Freshwater");

        lion.makeSound(); 
        lion.giveBirth(); 

        eagle.makeSound(); 
        eagle.sing(); 

        salmon.makeSound();
        salmon.swim(); 
    }
}
