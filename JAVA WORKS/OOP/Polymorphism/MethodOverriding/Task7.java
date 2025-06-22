// 7. Problem: Create a simple game with different character classes (warrior, mage, archer). Use method overriding to define their unique abilities.
//    - Example: Implement a `Character` superclass and subclasses for each character class (e.g., `Warrior`, `Mage`, `Archer`) with overridden methods for their special abilities.

class Character {
    protected String name;
    protected int health;
    protected int mana;

    public Character(String name, int health, int mana) {
        this.name = name;
        this.health = health;
        this.mana = mana;
    }

    public void basicAttack(Character enemy) {
        System.out.println(name + " performs a basic attack on " + enemy.name);
        enemy.health -= 10;
        System.out.println(enemy.name + "'s health reduced to " + enemy.health);
    }

    public void displayStatus() {
        System.out.println(name + " - Health: " + health + ", Mana: " + mana);
    }

    public void uniqueAbility() {
        System.out.println(name + " does not have a unique ability.");
    }
}

class Warrior extends Character {
    public Warrior(String name, int health, int mana) {
        super(name, health, mana);
    }

    @Override
    public void uniqueAbility() {
        System.out.println(name + " uses Shield Bash!");
        System.out.println(name + " stuns the enemy!");
    }
}

class Mage extends Character {
    public Mage(String name, int health, int mana) {
        super(name, health, mana);
    }

    @Override
    public void uniqueAbility() {
        if (mana >= 20) {
            System.out.println(name + " casts Fireball!");
            System.out.println(name + " deals massive damage with Fireball!");
            mana -= 20;
        } else {
            System.out.println(name + " does not have enough mana to cast Fireball.");
        }
    }
}

class Archer extends Character {
    public Archer(String name, int health, int mana) {
        super(name, health, mana);
    }

    @Override
    public void uniqueAbility() {
        System.out.println(name + " uses Rapid Shot!");
        System.out.println(name + " attacks multiple times with Rapid Shot!");
    }
}

public class Task7 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Aragorn", 100, 50);
        Mage mage = new Mage("Gandalf", 80, 100);
        Archer archer = new Archer("Legolas", 90, 60);

        warrior.displayStatus();
        mage.displayStatus();
        archer.displayStatus();

        System.out.println();

        warrior.uniqueAbility();
        mage.uniqueAbility();
        archer.uniqueAbility();

        System.out.println();
        
        warrior.displayStatus();
        mage.displayStatus();
        archer.displayStatus();
    }
}
