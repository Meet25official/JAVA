// Scenario 10: Recipe Management Application
// Create an abstract class called "Recipe" with abstract methods like "prepareIngredients" and "cook." Implement derived classes like "SoupRecipe" and "DessertRecipe" that provide specific implementations for these abstract methods.

abstract class Recipe {
    private String recipeName;

    public Recipe(String recipeName) {
        this.recipeName = recipeName;
    }

    abstract void prepareIngredients();
    abstract void cook();

    public String getRecipeName() {
        return recipeName;
    }
}

class SoupRecipe extends Recipe {
    public SoupRecipe(String recipeName) {
        super(recipeName);
    }

    @Override
    void prepareIngredients() {
        System.out.println("Preparing ingredients for soup: " + getRecipeName());
    }

    @Override
    void cook() {
        System.out.println("Cooking soup: " + getRecipeName());
    }
}

class DessertRecipe extends Recipe {
    public DessertRecipe(String recipeName) {
        super(recipeName);
    }

    @Override
    void prepareIngredients() {
        System.out.println("Preparing ingredients for dessert: " + getRecipeName());
    }

    @Override
    void cook() {
        System.out.println("Cooking dessert: " + getRecipeName());
    }
}
public class Task10 {
    public static void main(String[] args) {
        Recipe soupRecipe = new SoupRecipe("Tomato Soup");
        soupRecipe.prepareIngredients();
        soupRecipe.cook();

        Recipe dessertRecipe = new DessertRecipe("Chocolate Cake");
        dessertRecipe.prepareIngredients();
        dessertRecipe.cook();
    }
}
