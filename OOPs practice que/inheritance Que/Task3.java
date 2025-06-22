//Scenario 3: Animal Kingdom
//Design an animal kingdom hierarchy with a base class called "Animal" and derived classes like "Mammal," "Bird," and "Fish." Each derived class can have specific characteristics and behaviors unique to that group of animals.

class Animal{
    private String species; 

    public Animal(String species){
        this.species = species;
    }

    public void display(){
        System.out.println("The species of the Animal is :- "+species);
    }
}

class Mammal extends Animal{
    private String hasFur;

    public Mammal(String  species,String hasFur){
        super(species);
        this.hasFur = hasFur;
    }

    public void displayMammel(){
        super.display();
        System.out.println("The hasFur of the Mammel is :- "+hasFur);
    }
}

class Bird extends Animal{
    private int flyingspeed;

    public Bird(String  species,int flyingspeed){
        super(species);
        this.flyingspeed = flyingspeed;
    }

    public void displayBird(){
        super.display();
        System.out.println("The flying speed of the Bird is :- "+flyingspeed);
    }
}

class Fish extends Animal{
    private int liveyear;

    public Fish(String  species,int liveyear){
        super(species);
        this.liveyear = liveyear;
    }

    public void displayFish(){
        super.display();
        System.out.println("The live year of the Fish is :- "+liveyear);
    }
}
public class Task3 {
    public static void main(String[] args) {
        Mammal obj1 = new Mammal("Mammel", "Brown");
        Bird obj2 = new Bird("Bird", 56);
        Fish obj3 = new Fish("Fish", 120);
        obj1.displayMammel();
        obj2.displayBird();
        obj3.displayFish();
    }  
}
