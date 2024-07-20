// Scenario 2: Game Initialization
// In a game development scenario, have a class called "Game" with an instance initializer block that sets up the game environment, loads resources, and performs initialization tasks when a new game object is created.

class Game {
    private String environment;
    private String resources;
    {
        setupEnvironment();
        loadResources();
        initializeGame();
    }

    public Game() {
        System.out.println("Game constructor called.");
    }

    private void setupEnvironment() {
        environment = "Default Environment";
        System.out.println("Game environment set up: " + environment);
    }

    private void loadResources() {
        resources = "Default Resources";
        System.out.println("Game resources loaded: " + resources);
    }

    private void initializeGame() {
        System.out.println("Performing additional initialization tasks...");
    }
}
public class Task2 {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(game);
    }
}
