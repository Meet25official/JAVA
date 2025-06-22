//Scenario 10: Recipe Management Application
//Create an abstract class called "Recipe" with abstract methods like "prepareIngredients" and "cook." Implement derived classes like "SoupRecipe" and "DessertRecipe" that provide specific implementations for these abstract methods.

abstract class Recipe{
    private String name;

    public Recipe(String name){
        this.name = name;
    }

    abstract void prepareIngredients();
    abstract void cook();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 
}

class SoupRecipe extends Recipe{
    private String type;

    public SoupRecipe(String name , String type){
        super(name);
        this.type = type;
    }

    @Override
    public void prepareIngredients(){
        System.out.println("The Recipe book name is :- "+super.getName());
        System.out.println("The dish name is Soup and their type is :- "+type);
    }

    @Override
    public void cook(){
        System.out.println("The Soup is ready.");
    }
}

class DessertRecipe extends Recipe{
    private String type;

    public DessertRecipe(String name , String type){
        super(name);
        this.type = type;
    }

    @Override
    public void prepareIngredients(){
        System.out.println("The Recipe book name is :- "+super.getName());
        System.out.println("The dish name is Desert and their type is :- "+type);
    }

    @Override
    public void cook(){
        System.out.println("The Desert is ready.");
    }
}
public class Task10 {
    public static void main(String[] args) {
        SoupRecipe obj1 = new SoupRecipe("IndianFood", "Tomato");
        DessertRecipe obj2 = new DessertRecipe("Chaska", "South Indain");

        obj1.prepareIngredients();
        obj1.cook();

        obj2.prepareIngredients();
        obj2.cook();
    }
}