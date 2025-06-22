// Scenario 10: Restaurant Menu
// Create a restaurant menu system with a base class called "MenuItem" and derived classes like "Appetizer," "MainCourse," and "Dessert." Each derived class can have specific attributes like ingredients and methods related to that type of menu item.


class MenuItem {
    String name;
    double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println(name + " - $" + price);
    }
}

class Appetizer extends MenuItem {
    String ingredients;

    public Appetizer(String name, double price, String ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }

    public void display() {
        super.display();
        System.out.println("Ingredients: " + ingredients);
    }
}

class MainCourse extends MenuItem {
    String chefSpecialty;

    public MainCourse(String name, double price, String chefSpecialty) {
        super(name, price);
        this.chefSpecialty = chefSpecialty;
    }

    public void display() {
        super.display();
        System.out.println("Chef's Specialty: " + chefSpecialty);
    }
}

class Dessert extends MenuItem {
    String type;

    public Dessert(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    public void display() {
        super.display();
        System.out.println("Type: " + type);
    }
}
public class Task10 {
    public static void main(String[] args) {
        Appetizer appetizer = new Appetizer("Caesar Salad", 8.99, "Romaine lettuce, croutons, Caesar dressing");
        MainCourse mainCourse = new MainCourse("Grilled Salmon", 19.99, "Pan-seared with lemon butter sauce");
        Dessert dessert = new Dessert("Chocolate Lava Cake", 6.99, "Cake");

        System.out.println("Appetizer:");
        appetizer.display();

        System.out.println("\nMain Course:");
        mainCourse.display();

        System.out.println("\nDessert:");
        dessert.display();
    } 
}
