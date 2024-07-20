// Scenario 2: Animal Shelter
// In an animal shelter application, have classes like "Animal," "Cat," and "Dog" representing different types of animals. Use the instanceof operator to identify the type of animal and apply specific operations like feeding or grooming based on the animal's type.


class AnimalShelter {
    public static class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void performAction() {
            System.out.println(name + " is an animal.");
        }
    }

    public static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }

        @Override
        public void performAction() {
            System.out.println(getName() + " is a cat. Time to groom!");
        }
    }

    public static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override
        public void performAction() {
            System.out.println(getName() + " is a dog. Time to feed!");
        }
    }

    public static class Shelter {
        private Animal[] animals;
        private int animalCount;

        public Shelter(int maxAnimals) {
            this.animals = new Animal[maxAnimals];
            this.animalCount = 0;
        }

        public void addAnimal(Animal animal) {
            if (animalCount < animals.length) {
                animals[animalCount++] = animal;
            } else {
                System.out.println("Shelter is full. Cannot add more animals.");
            }
        }

        public void performAllActions() {
            for (int i = 0; i < animalCount; i++) {
                Animal animal = animals[i];
                if (animal instanceof Cat) {
                    ((Cat) animal).performAction();
                } else if (animal instanceof Dog) {
                    ((Dog) animal).performAction();
                } else {
                    animal.performAction();
                }
            }
        }
    }
}
public class Task2 {
    public static void main(String[] args) {
        AnimalShelter.Shelter shelter = new AnimalShelter.Shelter(5);

        AnimalShelter.Cat cat1 = new AnimalShelter.Cat("Whiskers");
        AnimalShelter.Dog dog1 = new AnimalShelter.Dog("Rex");
        AnimalShelter.Cat cat2 = new AnimalShelter.Cat("Mittens");
        AnimalShelter.Dog dog2 = new AnimalShelter.Dog("Buddy");

        shelter.addAnimal(cat1);
        shelter.addAnimal(dog1);
        shelter.addAnimal(cat2);
        shelter.addAnimal(dog2);

        shelter.performAllActions();
    }
}
